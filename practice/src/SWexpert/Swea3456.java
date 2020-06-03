package SWexpert;
import java.util.*;
public class Swea3456 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		for(int tc=1;tc<=C;tc++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d;
			if(a == b) {
				d = c;
			}else if(a== c) {
				d = b;
			}else {
				d = a;
			}
			
			System.out.println("#" + tc + " " + d);
		}
	}

}
