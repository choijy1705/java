package SWexpert;
import java.util.*;
public class Swea4299 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int D;
	static int H;
	static int M;
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			D = sc.nextInt();
			H = sc.nextInt();
			M = sc.nextInt();
			
			int now = D*1440 + H*60 + M;
			int day = 11*1440 + 11*60 + 11;
			
			int result = now-day <0 ? -1:now-day;
			
			System.out.println("#" + tc + " " + result);
			
			
		}

	}

}
