package SWexpert;
import java.util.*;
public class Swea4676 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String string = sc.next();
			
			int L = string.length();
			
			int H = sc.nextInt();
			
			String[] arr = string.split("");
			
			for(int i=0;i<H;i++) {
				int a = sc.nextInt();
				
				if(a==0) {
					arr[a] = "-" + arr[a];
				}else {
					arr[a-1]+= "-";
				}
			}
			String result = "";
			for(int i=0;i<arr.length;i++) {
				result += arr[i];
			}
			System.out.println("#" + tc + " "+ result);
		}

	}

}
