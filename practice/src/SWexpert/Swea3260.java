package SWexpert;
import java.util.*;
public class Swea3260 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			
			String a = sc.next();
			String b = sc.next();
			
			int max = Math.max(a.length(), b.length());
			
			int[] aa = new int[max];
			int[] bb = new int[max];
			
			Arrays.fill(aa, 0);
			Arrays.fill(bb, 0);
			
			for(int i=1;max-i>=0;i++) {
				if(a.length()-i>=0) {
					aa[aa.length-i] = a.charAt(a.length()-i)-48;
					
				}
				
				if(b.length()-i>=0) {
					bb[bb.length-i] = b.charAt(b.length()-i)-48;
				}
			}
		
			
			int[] result = new int[max];
			for(int i=0;i<aa.length;i++) {
				result[i] = aa[i] + bb[i];				
			}
			
			for(int i=result.length-1;i>=0;i--) {
				if(i>0 && result[i]>=10 ) {
					result[i-1]++;
					result[i]-=10;
				}
			}
			
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<result.length;i++) {
				sb.append(result[i]);
			}
			
			System.out.println("#" + tc + " " + sb.toString());
		}

	}
	

}
