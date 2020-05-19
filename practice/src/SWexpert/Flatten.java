package SWexpert;

import java.util.*;
public class Flatten {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			int cnt = sc.nextInt();
			
			int[] height = new int[100];
			for(int j=0;j<100;j++) {
				height[j] = sc.nextInt();
			}
			
			for(int j=0;j<cnt;j++) {
				Arrays.sort(height);
				height[height.length-1]--;
				height[0]++;
			}
			Arrays.sort(height);
			int result = height[height.length-1] - height[0];
			System.out.println("#" + (i+1) + " " + result);
		}

	}

}
