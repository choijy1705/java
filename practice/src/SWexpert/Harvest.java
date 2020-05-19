package SWexpert;
import java.util.*;
public class Harvest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc=1; tc<=T; tc++) {
			int N = sc.nextInt();
			int peek = (N-1)/2;
			int sum = 0;
			for(int i=0; i<N; i++) {
				int temp = Math.abs(peek-i);
				char[] chs = sc.next().substring(temp,N-temp).toCharArray();
				for(char ch: chs) sum += ch - 48;
			}
			System.out.format("#%d %d\n", tc, sum);
		}
		sc.close();
	}
}