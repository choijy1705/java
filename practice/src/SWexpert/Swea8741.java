package SWexpert;
import java.util.*;
public class Swea8741 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			
			
			
			String result ="";
			for(int i=0;i<3;i++) {
				String st = sc.next();
				st.toUpperCase();
				result += String.valueOf(st.charAt(0));
			}
			
			System.out.println("#"  + tc + " " + result);
		}

	}

}
