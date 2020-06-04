package SWexpert;
import java.util.*;
public class Swea5549 {
	static Scanner sc= new Scanner(System.in);
	static int C;

	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String st = sc.next();
			
			
			System.out.println("#" + tc + " " + ((int)(st.charAt(st.length()-1)-'0') %2 == 0?"Even":"Odd"));
		}

	}

}
