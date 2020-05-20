package SWexpert;
// 부분수열의 합 , A1, A2, ... , AN의 N개의 자연수가 주어졌을 때, 최소 1개 이상의 수를 선택하여 그 합이 K가 되는 경우의 수를 구하는 프로그램을 작성하시오.
import java.util.*;

public class Sequence {
	static int cnt;
	static int[] arr;
	static int k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		
		for(int i=1;i<=C;i++) {
			cnt = 0;
			int n = sc.nextInt();
			k = sc.nextInt();
			
			arr = new int[n];
			
			for(int j=0;j<n;j++) {
				arr[j] = sc.nextInt();
			}
			
			int select = 1;
			Arrays.sort(arr);
			
			for(int j=0;j<n;j++) {
				isSumK(arr[j], select,j);
			}
			System.out.println("#" + i + " " + cnt);
		}

	}
	private static void isSumK(int num, int select,int index) {
			if(select > arr.length ) {
				return;
			}
		
		if(num == k) {
			cnt++;
		}else if(num < k) {
			if(index +1 > arr.length-1) {
				return;
			}
			
			for(int i=index+1;i<arr.length;i++) {
				isSumK(num+arr[i],select+1,i);
			}
		}
		
	}

}
