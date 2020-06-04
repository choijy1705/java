package SWexpert;

import java.util.*;

public class Swea8500 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int[] arr;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			
			arr = new int[N];
			
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int seat = 0;
			int before = 0;
			
			for(int i=0;i<N;i++) {
				seat += 1;
				seat += 2*arr[i];
				seat -= before;
				before = arr[i];
			}
			
			System.out.println("#" + tc + " " + seat);
			
		}
	}

}
