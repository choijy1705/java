package SWexpert;

import java.util.*;

public class Swea5162 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			int small = a < b? a:b;
			
			System.out.println("#" + tc + " " + c/small);
		}
		

	}

}
