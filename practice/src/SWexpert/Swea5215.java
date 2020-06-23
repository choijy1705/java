package SWexpert;
import java.util.*;
public class Swea5215 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int L;
	static int ans;
	static int[] taste;
	static int[] cal;
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt(); //재료 갯수
			L = sc.nextInt(); //최대칼로리
			
			taste = new int[N];
			cal = new int[N];
			
			
			for(int i=0;i<N;i++) {
				taste[i] = sc.nextInt();
				cal[i] = sc.nextInt();
			}
			ans = 0;
			dfs(0,0,0);
			
			System.out.println("#" + tc + " " + ans);
			 
		}

	}

	private static void dfs(int cnt, int sco, int kcal) {
		if(kcal > L) {
			return;
		}
		if(cnt == N) {
			ans = Math.max(sco, ans);
			return;
		}
		
		dfs(cnt+1,sco + taste[cnt],kcal+cal[cnt]);
		dfs(cnt+1,sco,kcal);
	}

}
