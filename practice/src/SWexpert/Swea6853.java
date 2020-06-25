package SWexpert;
//직사각형과 점
import java.util.*;
public class Swea6853 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int X1,Y1,X2,Y2; // 직사각형의 점
	static int N; // 점의 개수
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			X1 = sc.nextInt();
			Y1 = sc.nextInt();
			X2 = sc.nextInt();
			Y2 = sc.nextInt();
			
			N = sc.nextInt();
			
			int inpoint = 0;
			int linepoint = 0;
			int outpoint = 0;
			
			for(int i=0;i<N;i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				if(X1 <x && X2>x) {
					if(Y1<y && Y2>y) {
						inpoint++;
					}else if(Y1 == y || Y2 == y) {
						linepoint++;
					}else {
						outpoint++;
					}
				}else if(X1 == x || X2 == x) {
					if(Y1<=y && Y2>=y) {
						linepoint++;
					}else {
						outpoint++;
					}
				}else {
					outpoint++;
				}
			}
			
			System.out.println("#" + tc + " " + inpoint + " " + linepoint + " " + outpoint);
		}

	}

}
