package SWexpert;
import java.util.*;
public class Swea5431 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int K;
	public static void main(String[] args) {
		
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			K = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for(int i=1;i<=N;i++) {
				list.add(i);
			}
			
			for(int i=0;i<K;i++) {
				list.remove((Integer)sc.nextInt());
			}
			
			String result = "";
			for(int i=0;i<list.size();i++) {
				result += list.get(i) + " ";
			}
			
			System.out.println("#" + tc + " " + result);
		}
			

	}

}
