package SWexpert;
// 알 덴테 스파게티
import java.util.*;
public class Swea8457 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int B;
	static int E;
	public static void main(String[] args) {
		C= sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			B = sc.nextInt();
			E = sc.nextInt();
			int cnt = 0;
			for(int i=0;i<N;i++) {
				int time = sc.nextInt();
				
				for(int j=B-E;j<=B+E;j++) {
					if(j%time == 0) {
						cnt++;
						break;
					}
				}
				
			
			}
			
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
