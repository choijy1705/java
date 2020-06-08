package SWexpert;
import java.util.*;

public class Swea6692 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			
			Double sum = 0.0;
			for(int i=0;i<N;i++) {
				Double p = Double.valueOf(sc.next());
				int x = sc.nextInt();
				
				sum += (p*x);
			}
			
			
			System.out.printf("#" + tc + " " + "%.6f", sum );
			System.out.println();
		}

	}

}
