package SWexpert;
import java.util.*;
public class Swea9229 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int M;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			N = sc.nextInt();
			M = sc.nextInt();
			
			int[] snack = new int[N];
			for(int i=0;i<N;i++) {
				snack[i] = sc.nextInt();
			}
			
			Arrays.sort(snack);
			List<Integer> weight = new ArrayList<>();
			int sum = 0;
			
			for(int i=0;i<N-1;i++) {
				if(sum == M) {
					break;
				}
				sum = 0;
				sum += snack[i];
				for(int j=i+1;j<N;j++) {
					sum+=snack[j];
					if(sum <=M) {
						
						weight.add(sum);
						sum=snack[i];
					}else {sum=0;
						break;
					}	
				}
			}
			Collections.sort(weight);
			
			if(weight.size()>0) {
				System.out.println("#" + tc + " " + weight.get(weight.size()-1));
			}else {
				System.out.println("#" + tc + " " + "-1");
			}
			
			
		}

	}

}
