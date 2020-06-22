package SWexpert;
import java.util.*;
public class Swea3233 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static long A;
	static long B;
	public static void main(String[] args) {
		C= sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			long result = (long)(Math.pow(A, 2)/Math.pow(B, 2));
			
			if(Math.pow(A, 2)/Math.pow(B, 2) - result > 0) {
				result += 1;
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
