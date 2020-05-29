package SWexpert;
import java.util.*;
public class PowerOfSquare {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int tc = 1; tc<=10;tc++) {
			sc.nextInt();
			
			int a= sc.nextInt();
			int b= sc.nextInt();
			
			multiple(a,1,b,tc);
		}
		
	}

	private static void multiple(int a,int result, int b,int tc) {
		if(b == 0){
			System.out.println("#" + tc + " " + result );
			return;
		}
		result = result * a;
		b -= 1;
		multiple(a,result,b,tc);
		
	}

}
