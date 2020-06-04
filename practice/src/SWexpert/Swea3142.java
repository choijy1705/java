package SWexpert;
import java.util.*;
public class Swea3142 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int M;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			int a =0;
			
			while(a<=M) {
				int b = M-a;
				
				if(a*2 + b == N) {
					System.out.println("#" + tc + " " + b + " " + a);
					break;
				}
				a++;
			}
		}

	}

}
