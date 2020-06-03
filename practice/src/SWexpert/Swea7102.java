package SWexpert;
import java.util.*;
public class Swea7102 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int N;
	static int M;
	static List<Integer> list;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
				N = sc.nextInt();
				M = sc.nextInt();
				list = new ArrayList<>();
				int max = 0;
				for(int sum=2;sum<=N+M;sum++) {
					int cnt = 0;
					for(int i=1;i<=N;i++) {
						for(int j =1;j<=M;j++) {
							if(i+j == sum) {
								cnt++;
							}
						}
					}
					if(cnt > max) {
						max = cnt;
						list= new ArrayList<>();
						list.add(sum);
					}else if(cnt == max) {
						list.add(sum);
					}
				}
				String result = "";
				for(int i=0;i<list.size();i++) {
					result += list.get(i) + " ";
				}
				System.out.println("#" + tc + " " + result);
				
		}

	}

}
