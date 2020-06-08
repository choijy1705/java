package SWexpert;
import java.util.*;
public class Swea8931 {
	static Scanner sc= new Scanner(System.in);
	static int C;
	static int K;
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			K = sc.nextInt();
			int sum = 0;
			for(int i=0;i<K;i++) {
				int a = sc.nextInt();
				sum +=a;
				if(a == 0) {
					sum -= stack.pop();
				}else {
					stack.push(a);
				}
			}
			
			System.out.println("#" + tc + " " + sum);
			
		}
	}

}
