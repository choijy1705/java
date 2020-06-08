package SWexpert;
import java.util.*;
public class Swea7532 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int S;
	static int E;
	static int M;
	public static void main(String[] args) {
		C = sc.nextInt();
		for(int tc=1;tc<=C;tc++) {
			S = sc.nextInt();
			E = sc.nextInt();
			M = sc.nextInt();
			int i=0;
			int n;
			while(true) {
				
				n = 365 * i + S;
				if((n-E)%24 == 0 && (n-M)%29 == 0) {
					break;
				}
				i++;
			}
			System.out.println("#" + tc + " " + n);
		}

	}

}
