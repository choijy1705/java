package practice;

import java.util.*;
public class Picnic {
	public static StringBuilder sb = new StringBuilder();
	public static Scanner sc = new Scanner(System.in);
	
	public static int C;
	public static int count;
	public static int N;
	public static int M;
	public static boolean[][] friendsMap;
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int i=0;i<C;i++) {
			solve();
		}

	}


	private static void solve() {
		N = sc.nextInt();
		M = sc.nextInt();
		
		count = 0;
		boolean[] checkList = new boolean[N];
		for(int i=0;i<N;i++) {
			checkList[i] = false;
		}
		initMap();
		
		for(int i=0;i<M;i++) {
			friendsMap[sc.nextInt()][sc.nextInt()] = true;
		}
		
		picnic(checkList);
		
		sb.append(count).append("\n");
		
		System.out.println(sb.toString());
			
		
	}


	private static void picnic(boolean[] checkList) {
		int n = 0;
		while(n<N && checkList[n]) {
			n++;
		}
		
		if(n==N) {
			count++;
			return;
		}
		
		boolean[] isfriend = friendsMap[n];
		
		for(int i=0;i<N;i++) {
			if(isfriend[i] && !checkList[i]) {
				checkList[i] = checkList[n] = true;
				picnic(checkList);
				checkList[i] = checkList[n] = false;
			}
		}
		
	}


	private static void initMap() {
		friendsMap = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				friendsMap[i][j] = false;
			}
		}
		
	}

}

