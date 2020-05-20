package SWexpert;

import java.util.*;
public class Permutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i=0;i<C;i++) {
			int N = sc.nextInt();
			
			int[] arr = new int[N];
			
			for(int j=0;j<N;j++) {
				arr[j] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int num = 1;
			boolean chk = true;
			for(int j=0;j<arr.length;j++) {
				if(arr[j] != num) {
					chk = false;
					break;
				}
				num++;
			}
			if(chk) {
				System.out.println("#" + (i+1) + " " + "Yes");
			}else {
				System.out.println("#" + (i+1) + " " + "No");
			}
		}
	}

}
