package SWexpert;
import java.util.*;
public class Swea5789 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int Q;
	static int L;
	static int R;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			
			int[] box = new int[N];
			Arrays.fill(box, 0);
			Q = sc.nextInt();
			
			for(int i=0;i<Q;i++) {
				L = sc.nextInt();
				R = sc.nextInt();
				
				for(int j=L-1;j<R;j++) {
					box[j] = i+1;
				}
			}
			String result = "";
			for(int i=0;i<box.length;i++) {
				result += box[i] + " ";
			}
			System.out.println("#" + tc + " "+ result);
		}

	}

}
