package SWexpert;
//규영이와 인영이의 카드게임
import java.util.*;
public class Swea6808 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int win;
	static int lose;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int[] gyuyoung = new int[9];
			int[] inyoung = new int[9];
			win = 0;
			lose =0;
			int[] start = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
			for(int i=0;i<9;i++) {
				gyuyoung[i] = sc.nextInt();
				
				for(int j=0;j<18;j++){
					if(gyuyoung[i] == start[j]) {
						start[j] = 0;
						break;
					}
				}
			}
				
			for(int i=0;i<9;i++) {
				for(int j=0;j<18;j++) {
					if(start[j] != 0) {
						inyoung[i] = start[j];
						start[j] = 0;
						break;
					}
				}
			}

			
			boolean[] visit = new boolean[9];
			Arrays.fill(visit, false);
			fight(gyuyoung,inyoung,visit,0,0,0);
			
			System.out.println("#" + tc + " " + win + " " + lose);
		}
	}
	private static void fight(int[] gyuyoung, int[] inyoung, boolean[] visit, int i, int gyu, int in) {
		
		if(i == 9) {
			
			if(gyu > in) {
				win++;
			}else if(in > gyu){
				lose++;
			}
			return;
		}
		
		
		for(int j=0;j<9;j++) {
			if(!visit[j]) {

				if(gyuyoung[i] > inyoung[j]) {
					visit[j] = true;
					fight(gyuyoung,inyoung,visit,i+1,gyu+gyuyoung[i]+inyoung[j],in);
					visit[j] = false;
		
				}else{
					visit[j] = true;
					fight(gyuyoung,inyoung,visit,i+1,gyu,in+gyuyoung[i]+inyoung[j]);
					visit[j] = false;
				}
				
				
			}else {
				continue;
			}
		}
		
	}

}
