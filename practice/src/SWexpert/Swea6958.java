package SWexpert;
import java.util.*;
public class Swea6958 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int M;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			int cnt = 0;
			int max = 0;
			
			for(int i=0;i<N;i++) {
				int sum = 0;
				for(int j=0;j<M;j++) {
					sum += sc.nextInt();
				}
				if(sum > max) {
					max = sum;
					cnt = 1;
				}else if(sum == max) {
					cnt++;
				}
				
			}
			
			System.out.println("#" + tc + " " + cnt + " " + max);
		}

	}

}
