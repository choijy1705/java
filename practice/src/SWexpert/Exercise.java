package SWexpert;

import java.util.*;
public class Exercise {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			int result = 0;
			if(X <= L) {
				result = (L-X);
			}else if(X>= U) {
				result = -1;
			}
			
			System.out.println("#" + tc + " "+ result);
		}
	}

}
