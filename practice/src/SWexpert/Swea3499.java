package SWexpert;
import java.util.*;
public class Swea3499 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			int a;
			int b;
			if(N%2==0) {
				a = N/2;
				b = N/2;
			}else {
				a = N/2 + 1;
				b = N/2;
				
			}
			
			
			String[] card1 = new String[a];
			String[] card2 = new String[b];
			
			for(int i=0;i<a;i++) {
				card1[i] = sc.next();
			}
			for(int i=0;i<b;i++) {
				card2[i] = sc.next();
			}
			
			String result = "";
			
			for(int i=0;i<a;i++) {
				result += card1[i] +" ";
				try {
					result += card2[i] +" ";
				}catch(Exception e) {
					
				}
				
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
