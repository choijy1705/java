package SWexpert;
import java.util.*;

public class Swea6019 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static double A;
	static double B;
	static double fly;
	static double distance;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			distance = sc.nextDouble();
			A = sc.nextDouble();
			B = sc.nextDouble();
			fly = sc.nextDouble();
		
			double crushtime = distance/(A+B);
			
			double flydistance = crushtime * fly;
	
			
			System.out.printf("#%d %.10f",tc,flydistance);
		}

	}

}
