package SWexpert;
import java.util.*;
public class Swea5603 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			int sum = 0;
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
		
			int avg = sum/n;
			


			int move = 0;
			
			for(int i=0;i<n;i++) {
				move += Math.abs(avg - arr[i]);
				
			}
			move /=2;
			
			System.out.println("#" + tc + " " + move);
		}

	}

}
