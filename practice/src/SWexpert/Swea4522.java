package SWexpert;
import java.util.*;
public class Swea4522 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String string = sc.next();
			String result = "Not exist";
			for(int i=0;i<string.length()/2;i++) {
				if(string.charAt(i) == string.charAt(string.length()-i-1) || string.charAt(i) == '?' || string.charAt(string.length()-i-1) == '?') {
					result = "Exist";
				}else {
					result = "Not exist";
					break;
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
