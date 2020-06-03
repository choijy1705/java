package SWexpert;
import java.util.*;
public class Swea3314 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			
			int sum = 0;
			
			for(int i=0;i<5;i++) {
				int a = sc.nextInt();
				
				sum += a>=40?a:40;
			}
			System.out.println("#" + tc + " "+ sum/5);
		}

	}

}
