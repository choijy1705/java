package SWexpert;
import java.util.*;
public class Swea5948 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			
			int[] arr = new int[7];
			for(int i=0;i<7;i++) {
				arr[i] = sc.nextInt();
			}
			Set<Integer> set = new HashSet<Integer>();
			Arrays.sort(arr);
			for(int i=0;i<5;i++) {
				for(int j=i+1;j<6;j++) {
					for(int k=j+1;k<7;k++) {
						set.add(arr[i] + arr[j] + arr[k]);
					}
				}
			}
			
			List<Integer> list = new ArrayList<>(set);
			
			Collections.sort(list);
			
			System.out.println("#" + tc + " " +list.get(list.size()-5));
			
			
		}

	}

}
