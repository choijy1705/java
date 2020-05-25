package practice;

import java.util.*;
import java.io.*;

public class Graduation {
	private static final int INF = 987654321;
	static int N,K,M,L;
	static int cls[] = new int[10], pre[] = new int[12];
	static int cache[][] = new int[10][1<<12];
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int tc = sc.nextInt();
		
		while(tc -->0) {
			N = sc.nextInt(); //총 과목수
			K = sc.nextInt(); // 들어야 하는 과목수
			M = sc.nextInt(); // 학기수
			L = sc.nextInt(); // 한학기에 들을 수 있는 최대 과목수
			
			for(int i=0;i<10;i++) {
				Arrays.fill(cache[i], -1);
			}
			Arrays.fill(cls, 0);
			Arrays.fill(pre, 0);
			
			// 선수 과목
			for(int i=0;i<N;i++) {
				int cnt = sc.nextInt();
				for(int j=0;j<cnt;j++) {
					int p = sc.nextInt();
					pre[i] |= (1<<p); // pre[i] 배열에 비트마스크로 선수강과목 추가
				}
			}
			// 학기마다 개설과목
			for(int i=0;i<M;i++) {
				int cnt = sc.nextInt();
				for(int j=0;j<cnt;j++) {
					int p = sc.nextInt();
					cls[i] |= (1<<p);
				}
			}
			
			int result = graduate(0,0);
			if(result == INF) {
				System.out.println("IMPOSSIBLE");
			}else {
				System.out.println(result);
			}
			
		}
	}

	static int graduate(int semester, int taken) {
		if(Integer.bitCount(taken) >= K) {
			return 0;
		}
		if(semester == M) {
			return INF;
		}
		
		if(cache[semester][taken] != -1) {
			return cache[semester][taken];
		}
		
		cache[semester][taken] = INF;
		
		// 이번학기에 들을 수 있는 과목중 아직 듣지 않은 과목을 찾아라
		
		int canTake = (cls[semester] & ~taken);
		
		// 선수과목을 다듣지 않은 과목은 canTake에서 0 초기화, 즉 선수과목까지 마쳐서 이번학기에 실제로 들을 수 있는 과목을 구한다.
		
		for(int i=0;i<N;i++) {
			if((canTake & (1<<i)) > 0 && ((taken & pre[i]) != pre[i])) {
				canTake &= ~(1<<i);
			}
		}
		
		// 들을 수 있는 과목을 듣고 다음학기로 이동하여 탐색
		for(int take = canTake;take>0;take = ((take-1) & canTake)) {
			if(Integer.bitCount(take) > L) {
				continue;
			}
			cache[semester][taken] = Math.min(cache[semester][taken], graduate(semester + 1, taken | take )+ 1);
		}
		
		// 이번학기에 아무것도 듣지 않을 경우
		cache[semester][taken] = Math.min(cache[semester][taken],graduate(semester + 1, taken));
		return cache[semester][taken];
	}

}
