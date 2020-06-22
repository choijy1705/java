package SWexpert;
import java.util.*;
public class Swea4371 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
			}
	
			for(int i=1;i<N;i++) {
				if(arr[i] == -1) {
					continue;
				}
				for(int j=i+1;j<N;j++) {
					if((arr[j]-1)%(arr[i]-1) == 0) {
						arr[j] = -1;
					}
				}
			}
			int cnt = 0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i] != -1 && arr[i] != 1) {
					cnt++;
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
			
		}
		
		

	}

}
