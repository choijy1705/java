package SWexpert;
import java.util.*;

public class Swea4466 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int K;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++) {
				arr[i]= sc.nextInt();
			}
			
			Arrays.sort(arr);
			int result = 0;
			for(int i=arr.length-1;i>arr.length-1-K;i--) {
				result += arr[i];
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
