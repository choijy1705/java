package SWexpert;
import java.util.*;
public class Swea3376 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static long[] wave;
	static int N;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			
			if(N >5) {
				wave = new long[N];
			}else {
				wave = new long[5];
			}
			
			
			wave[0] = 1;
			wave[1] = 1;
			wave[2] = 1;
			wave[3] = 2;
			wave[4] = 2;
			
			int index = 5;
			if(index >=5) {
				while(index < N) {
					wave[index] = wave[index-1] + wave[index-5];
					index ++;
					
				}
			}
			
			
			System.out.println("#" + tc + " " + wave[N-1]);
			
		}
		

	}
	

}
