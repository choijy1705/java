package practice;

import java.util.*;
public class Christmas {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int K;
	static int[] dolls;
	static int chooseone;
	static int choose;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			dolls = new int[N];
			for(int i=0;i<N;i++) {
				dolls[i] = sc.nextInt();
			}
			
			
			onepick(dolls);
			pick(dolls);
			
			System.out.println(chooseone + " " + choose);
		}
	}
	private static void pick(int[] dolls2) {
		choose = dolls2.length/K;
		return;
		
	}
	private static void onepick(int[] doll) {
		chooseone = 0;
		for(int i=0;i<doll.length;i++) {
			if(doll[i] >= K) {
				chooseone++;
			}
		}
		return;
	}

}
