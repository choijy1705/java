package SWexpert;
import java.util.*;
public class Swea1221 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			sc.next();
			int N = sc.nextInt();
			
			int[] num = new int[N];
			String[] st = new String[N];
			
			for(int i=0;i<N;i++) {
				String number = sc.next();
				
				switch(number) {
				case "ZRO":
					num[i] = 0;
					break;
				case "ONE":
					num[i] = 1;
					break;
				case "TWO":
					num[i] = 2;
					break;
				case "THR":
					num[i] = 3;
					break;
				case "FOR":
					num[i] = 4;
					break;
				case "FIV":
					num[i] = 5;
					break;
				case "SIX":
					num[i] = 6;
					break;
				case "SVN":
					num[i] = 7;
					break;
				case "EGT":
					num[i] = 8;
					break;
				case "NIN":
					num[i] = 9;
					break;
				}
			}
			
			Arrays.sort(num);
			
			for(int i=0;i<num.length;i++) {
				
				switch(num[i]) {
				case 0:
					st[i] = "ZRO";
					break;
				case 1:
					st[i] = "ONE";
					break;
				case 2:
					st[i] = "TWO";
					break;
				case 3:
					st[i] = "THR";
					break;
				case 4:
					st[i] = "FOR";
					break;
				case 5:
					st[i] = "FIV";
					break;
				case 6:
					st[i] = "SIX";
					break;
				case 7:
					st[i] = "SVN";
					break;
				case 8:
					st[i] = "EGT";
					break;
				case 9:
					st[i] = "NIN";
					break;
				}
			}
		}
	}

}
