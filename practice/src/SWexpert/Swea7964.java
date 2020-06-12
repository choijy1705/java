package SWexpert;
// 부먹 왕국의 차원 관문

import java.util.*;

public class Swea7964 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int D;
	public static void main(String[] args) {

		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			D = sc.nextInt();
			
			int[] arr = new int[N];
			int dis = 0;
			int cnt = 0;
			for(int i=0;i<N;i++) {
				arr[i] = sc.nextInt();
				if(arr[i] == 0) {
					dis++;
					if(dis == D) {
						cnt++;
						dis = 0;
					}
				}else if(arr[i] == 1) {
					dis=0;
				}
			}
			
			System.out.println("#" + tc + " " + cnt);
		}

	}

}
