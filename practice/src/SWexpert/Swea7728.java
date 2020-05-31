package SWexpert;
// 다양성 측정
import java.util.*;
public class Swea7728 {
	
	static Scanner sc = new Scanner(System.in);
	static int C;

	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String st = sc.next();
			
			HashSet<Character> set = new HashSet<>();
			
			for(int i=0;i<st.length();i++) {
				set.add(st.charAt(i));
			}
			
			System.out.println("#" + tc + " " + set.size());
		}
	}

}
