package SWexpert;
import java.util.*;

public class Swea6019 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int A;
	static int B;
	static int fly;
	static int distance;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			distance = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			fly = sc.nextInt();
			
			int dir = 0;
			double realtime = 0;
			double crushtime = distance/(A+B);
			

			double flydistance = crushtime * fly;
			
			flydistance = Math.round(flydistance*1000000)/1000000;
			
			System.out.printf("#%d %.6f",tc,flydistance);
		}

	}

}
