package SWexpert;
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
				int possible = (B-E)/time * time+time;
				System.out.println(possible);
				if(possible>=B-E && possible<=B+E) {
					cnt++;
				}
			
			}
			
			System.out.println("#" + tc + " " + cnt);
		}

	}

}