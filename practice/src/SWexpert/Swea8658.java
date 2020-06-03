package SWexpert;
import java.util.*;
public class Swea8658 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String[] st = new String[10];
			int[] arr = new int[10];
			for(int i=0;i<10;i++) {
				st[i] = sc.next();
				arr[i]=0;
				for(int j=0;j<st[i].length();j++) {
					arr[i] += st[i].charAt(j)-'0';
				}
			}
			
			Arrays.sort(arr);
			
			System.out.println("#" + tc + " " + arr[arr.length-1] + " " + arr[0]);
		}
		
	}

}
