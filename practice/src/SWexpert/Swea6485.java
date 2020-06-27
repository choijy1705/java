package SWexpert;
//삼성시의 버스 노선
import java.util.*;
public class Swea6485 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int P;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			
			int[][] range = new int[N][2];
			
			
			for(int i=0;i<N;i++) {
				range[i][0] = sc.nextInt();
				range[i][1] = sc.nextInt();
			}
			
			P = sc.nextInt();
			String result = "";
			for(int i=0;i<P;i++) {
				int a = sc.nextInt();
				int cnt = 0;
				for(int j=0;j<N;j++) {
					if(a>= range[j][0] && a <= range[j][1]) {
						cnt++;
					}
				}
				result += cnt + " ";
			}
			System.out.println("#" + tc + " " + result);
		}
		

	}

}
