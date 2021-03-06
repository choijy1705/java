package SWexpert;
import java.util.*;
public class Swea9280 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int M;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			int[] price = new int[N];
			int[] carnum = new int[N];
			boolean[] park = new boolean[N];
			int[] carweight = new int[M];
			Queue<Integer> wait = new LinkedList<>();
			
			Arrays.fill(park, false);
			Arrays.fill(carnum, 0);
			
			for(int i=0;i<N;i++) {
				price[i] = sc.nextInt();
			}// 2, 3, 5
			
			for(int i=0;i<M;i++) {
				carweight[i] = sc.nextInt();
			}// 2,1,3,8
			int sum = 0; //주차비 합계
			for(int i=0;i<M*2;i++) {
				int car = sc.nextInt();
				if(car >0) {
					boolean chk = true;
					for(int j=0;j<N;j++) {
						if(!park[j]) {
							carnum[j] = carweight[car-1];
							sum+= carnum[j]*price[j];
							park[j] = true;
							chk = false;
							break;
						}
					}
					if(chk) {
						wait.add(carweight[car-1]);
					}
					
					
				}else {
					for(int j=0;j<N;j++) {
						if(carnum[j] == carweight[-car-1]) {
							park[j] = false;
							
							if(!wait.isEmpty()) {
								carnum[j] = wait.poll();
								sum+= carnum[j] * price[j];
								park[j] = true;
							}
							break;
						}
					}
				}
			}
			
			System.out.println("#" + tc + " " + sum);
		}

	}

}
