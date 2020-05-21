package game1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class ShootingGame {

	public static void main(String[] args) {
		game_Frame fms = new game_Frame();
		

	}
}


class game_Frame extends JFrame implements KeyListener, Runnable{
	
	int f_width;
	int f_height;
	
	int x,y;
	
	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false;
	boolean keySpace = false;
	
	Thread th;
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image me_img;
	Image Missile_img;
	
	ArrayList Missile_List = new ArrayList();
	
	Image buffImage; //더블 버퍼링용
	Graphics buffg; //더블 버퍼링용
	
	Missile ms; // 미사일 클래스 접근키
	
	game_Frame(){
		init();
		start();
		
		setTitle("슈팅 게임 만들기");
		setSize(f_width, f_height);
		
		Dimension screen = tk.getScreenSize();
		
		int f_xpos = (int)(screen.getWidth()/2 - f_width/2);
		int f_ypos = (int)(screen.getHeight()/2 - f_height/2);
		
		setLocation(f_xpos, f_ypos);
		setResizable(false);
		setVisible(true);
	}

	

	public void init() {
		x = 100;
		y = 100;
		f_width = 800;
		f_height = 600;
		
		me_img = tk.getImage("C:\\Users\\cjy17\\Desktop\\Solution\\practice\\src\\game1\\f15k.png");
		Missile_img =  tk.getImage("C:\\Users\\cjy17\\Desktop\\Solution\\practice\\src\\game1\\Missile.png");
		
		
	}
	
	public void start() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		th = new Thread(this);
		th.start();
		
	}
	
	public void run() {
		try {
			while(true) {
				KeyProcess();
				
				MissileProcess();
				repaint();
				Thread.sleep(20);
			}
		}catch(Exception e) {
			
		}
	}
	
	private void MissileProcess() {
		if(keySpace) {
			ms = new Missile(x,y);
			Missile_List.add(ms);
		}
		
	}



	public void paint(Graphics g) {
		
		buffImage = createImage(f_width, f_height);
		//더블 버퍼링 버퍼 크기를 화면크기와 같게 설정
		buffg = buffImage.getGraphics();
		
		update(g);
		
	}
	
	public void update(Graphics g) {
		Draw_Char(); // 실제로 그려진 이미지를 가져온다
		
		Draw_Missile();
		
		g.drawImage(buffImage, 0,0,this);
	}

	private void Draw_Missile() {
		for(int i=0;i<Missile_List.size();i++) {
			
			ms = (Missile)(Missile_List.get(i));
			//미사일 위치 값을 확인
			
			buffg.drawImage(Missile_img, ms.pos.x + 150, ms.pos.y + 30, this); // 이미지 크기를 고려한 미사일 발사 위치
			
			ms.move();
			
			if(ms.pos.x > f_width) {
				Missile_List.remove(i);
			}
		}
		
	}



	private void Draw_Char() {
		buffg.clearRect(0,0,f_width,f_height);
		buffg.drawImage(me_img,x ,y ,this);		
	}



	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP :
			
			keyUp=true;
			break;
		case KeyEvent.VK_DOWN :
			keyDown=true;
			break;
		case KeyEvent.VK_LEFT :
			keyLeft=true;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight=true;
			break;		
		case KeyEvent.VK_SPACE:
			keySpace=true;
			break;
		}		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP :
			keyUp=false;
			break;
		case KeyEvent.VK_DOWN :
			keyDown=false;
			break;
		case KeyEvent.VK_LEFT :
			keyLeft=false;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight=false;
			break;	
		case KeyEvent.VK_SPACE:
			keySpace=false;
			break;
		
		}
		
	}
	
	public void KeyProcess() {
		
		if(keyUp == true) y -= 	5;
		if(keyDown == true) y += 5;
		if(keyLeft == true) x -= 5;
		if(keyRight == true) x += 5;
			
	}
	
}

class Missile{
	Point pos ;
	
	Missile(int x, int y){
		pos = new Point(x,y);
	}
	public void move() {
		pos.x += 10;
	}
	
	
	
}

