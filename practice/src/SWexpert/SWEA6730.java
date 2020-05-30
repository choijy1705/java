package SWexpert;
// 장애물 경주 난이도

import java.util.*;
public class SWEA6730 {
	static Scanner sc = new Scanner(System.in);
	static int C;

	public static void main(String[] args) {
		C = sc.nextInt();
		
		
		
		for(int tc=1;tc<=C;tc++) {
			Queue<Integer> queue = new LinkedList<>();
			
			int N = sc.nextInt();
			
			for(int i=0;i<N;i++) {
				queue.add(sc.nextInt());
			}
			int up = 0;
			int down = 0;
			int before = 0;
			int upchk = 0;
			while(!queue.isEmpty()) {
				int now = queue.poll();
				if(before == 0) {
					before = now;
					continue;
				}
				if(now > before) {
					up = Math.max(up, (now - before));
					upchk++;
					before = now;
				}else if(now < before) {
					down = Math.max(down, (before - now));
					before = now;
				}

			}
			
			
			System.out.println("#" + tc + " " + up + " " + down);
		}

	}

}
