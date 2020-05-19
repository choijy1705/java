package practice;

import java.util.*;
import java.io.*;
public class Clocksync {
	public static int[] clocksNow;
	public static int C, INF=9999, SWITCH=10, CLOCKS=16;
	
	public static int[][] linkedClock = {
			{0,1,2},
			{3,7,9,11},
			{4,10,14,15},
			{0,4,5,6,7},
			{6,7,8,10,12},
			{0,2,14,15},
			{3,14,15},
			{4,5,7,14,15},
			{1,2,3,4,5},
			{3,4,5,9,13}
	};
	// 모든시계가 12시를 가리키는지 확인
	public static boolean areAligned() {
		for(int ck=0;ck<CLOCKS;ck++) {
			if(clocksNow[ck] % 4 !=0 ) {
				return false;
			}
		}
		return true;
		
	}
	
	public static int readySwitch(int swtch) {
		//스위치를 다눌러 보았을 경우 결과 반환
		if(swtch == SWITCH) return areAligned() ? 0 : INF;
		//switch를 0번 누르는 경우부터 3번 누르는 경우
		int ret = INF;
		for(int cnt=0;cnt<4; cnt++) {
			ret = Math.min(ret, cnt + readySwitch(swtch+1));
			push(swtch);
		}
		return ret;
		
	}
	
	private static void push(int swtch) {
		for(int ck=0;ck<linkedClock[swtch].length;ck++) {
			int nClock = linkedClock[swtch][ck];
			clocksNow[nClock] +=3;
			if(clocksNow[nClock] == 15) {
				clocksNow[nClock] = 3;
			}
					
		}
		
	}

	public static void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//테스트 케이스 입력
		C = Integer.parseInt(br.readLine().trim());
		assert C <= 30 : "Error :: testCase must be no more than 30";
		
		while(C-->0) {
			clocksNow = new int[CLOCKS];
			
			StringTokenizer st = new StringTokenizer(br.readLine().trim());
			for(int i = 0;i<CLOCKS;i++) {
				int tmpClock = Integer.parseInt(st.nextToken());
				assert tmpClock==12 || tmpClock == 3 || tmpClock == 6 || tmpClock == 9: "Time can be inputed 3,6,9,12";
				clocksNow[i] = tmpClock;
			}
			
			// 스위치 눌러보기
			int result = readySwitch(0);
			bw.write(String.format("%d\n", result>=INF?-1:result));
		}
		bw.close();
	}
	

	public static void main(String[] args) throws IOException {
		run();
	
	}

}
