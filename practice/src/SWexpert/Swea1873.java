package SWexpert;
import java.util.*;

public class Swea1873 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int H;
	static int W;
	static String[][] map;
	static int N;
	static int x, y;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			H = sc.nextInt();
			W = sc.nextInt();
			
			map = new String[H][W];
			
			for(int i=0;i<H;i++) {
				map[i] = sc.next().split("");
			}
			
			findtank();
			
			N = sc.nextInt();
			String command = sc.next();
			for(int i=0;i<N;i++) {
				char c = command.charAt(i);
				
				switch(c) {
				case 'U':
					if(x >= 1 && map[x-1][y].equals("#") || map[x-1][y].equals("*") || map[x-1][y].equals("-")) {
						map[x][y] = "^";
					}else {
						map[x][y] = ".";
						x--;
						map[x][y] = "^";
					}
					break;
				case 'D':
					if(x+1 < H && map[x+1][y].equals("#") || map[x+1][y].equals("*") || map[x+1][y].equals("-")) {
						map[x][y] = "v";
					}else {
						map[x][y] = ".";
						x++;
						map[x][y] = "v";
					}
					break;
				case 'R':
					if(y+1 < W &&map[x][y+1].equals("#") || map[x][y+1].equals("*") || map[x][y+1].equals("-")) {
						map[x][y] = ">";
					}else {
						map[x][y] = ".";
						y++;
						map[x][y] = ">";
					}
					break;
				case 'L':
					if(y >=1 && map[x][y-1].equals("#") || map[x-1][y-1].equals("*") || map[x-1][y-1].equals("-")) {
						map[x][y] = "<";
					}else {
						map[x][y] = ".";
						y--;
						map[x][y] = "<";
					}
					break;
				case 'S':
					switch(map[x][y]) {
					case "^":
						for(int k=x;k>=0;k--) {
							if(map[k][y].equals("#") ) {
								break;
							}else if(map[k][y].equals("*")) {
								map[k][y] = ".";
								break;
							}
						}
						break;
					case "v":
						for(int k=x;k<map.length;k++) {
							if(map[k][y].equals("#") ) {
								break;
							}else if(map[k][y].equals("*")) {
								map[k][y] = ".";
								break;
							}
						}
						break;
					case ">":
						for(int k=y;k<W;k++) {
							if(map[x][k].equals("#") ) {
								break;
							}else if(map[x][k].equals("*")) {
								map[x][k] = ".";
								break;
							}
						}
						break;
					case "<":
						for(int k=y;k>=0;k--) {
							if(map[x][k].equals("#") ) {
								break;
							}else if(map[x][k].equals("*")) {
								map[x][k] = ".";
								break;
							}
						}
						break;
					}
					break;
				}
			}
			System.out.print("#" + tc + " ");
			for(int i=0;i<H;i++) {
				String result = "";
				for(int j=0;j<W;j++) {
					result += map[i][j];
				}
				System.out.println(result);
			}
		}

	}
	private static void findtank() {
		boolean chk = false;
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(map[i][j].equals("^") || map[i][j].equals("v") || map[i][j].equals("<") || map[i][j].equals(">")) {
					x=i;
					y=j;
					chk = true;
					break;
				}
			}
			if(chk) {
				break;
			}
		}
		
	}

}
