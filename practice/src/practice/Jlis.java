package practice;
import java.util.*;


public class Jlis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i=1;i<=C;i++) {
			int n = sc.nextInt();
			int m= sc.nextInt();
			
			Set<Integer> set = new HashSet<>();
			
			for(int k=0;k<n+m;k++) {
				set.add(sc.nextInt());
			}
			
			System.out.println(set.size());
		}

	}

}
