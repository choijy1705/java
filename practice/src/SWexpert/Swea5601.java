package SWexpert;

import java.util.*;

public class Swea5601 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int a = sc.nextInt();
			String result = "";
			
			for(int i=0;i<a;i++) {
				result += "1/"+a + " ";
			}
			
			System.out.println("#" + tc + " " + result);
		}
		

	}

}
