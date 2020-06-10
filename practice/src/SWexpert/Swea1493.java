package SWexpert;
import java.util.*;

public class Swea1493 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int x;
	static int y;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int p = sc.nextInt();
			int q = sc.nextInt();
			x = 1;
			y = 1;
			findxy(p);
			findxy(q);
			int result = findnum();
			System.out.println("#" + tc + " " + result);
		}

	}
	private static int findnum() {
		int k = 1;
		int a=0;
		for(int i=1;i<x;i++) {
			k+=a;
			a++;
		}
		a--;
		for(int j=1;j<y;j++) {
			k+=a;
			a++;
		}
		
		return k;
		
	}
	private static void findxy(int num) {
		
		int now = 1;
		int i=1;
		int j=1;
		int k=1;
		
		while(now != num) {
			if(now > num) {
				now -= k;
				k--;
				i--;
				now += k;
				j++;
				
			}else if(now < num) {
				k++;
				now+=k;
				i++;
			}else {
				
			}
		}
		
		
		x +=i;
		y +=j;
		System.out.println(x + " : " + y);
	}

}
