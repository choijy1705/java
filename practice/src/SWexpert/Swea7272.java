package SWexpert;
import java.util.*;

public class Swea7272 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		String zero = "CEFGHIJKLMNSTUVWXYZ";
		
		String one = "ADOPQR";
		
		String two = "B";
		for(int tc = 1;tc<=C;tc++) {
			String A = sc.next();
			String B = sc.next();
			
			String result = "";
			
			if(A.length() != B.length()) {
				result = "DIFF";
			}else {
				int n = A.length();
				String anum = "";
				String bnum = "";
				
				
				
				for(int i=0;i<n;i++) {
					boolean chk = false;
					for(int j=0;j<zero.length();j++) {
						if(zero.charAt(j) == A.charAt(i)) {
							anum += "0";
							chk = true;
						}
						if(zero.charAt(j) == B.charAt(i)) {
							bnum += "0";
						}
					}
					if(chk) {continue;}
					for(int j=0;j<one.length();j++) {
						if(one.charAt(j) == A.charAt(i)) {
							anum += "1";
							chk = true;
						}
						if(one.charAt(j) == B.charAt(i)) {
							bnum += "1";
						}
					}
					if(chk) {continue;}
					if(two.charAt(0) == A.charAt(i)) {
						anum+="2";
					}
					if(two.charAt(0) == B.charAt(i)) {
						bnum +="2";
					}
				}
				
				if(anum.equals(bnum)) {
					result = "SAME";
				}else {
					result = "DIFF";
				}
			}
			
			System.out.println("#" + tc + " " + result);
		}

	}

}
