package SWexpert;
import java.util.*;
public class Swea8821 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String s = sc.next();
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<s.length();i++) {
				if(list.contains(s.charAt(i) - '0')) {
					list.remove((Integer)(s.charAt(i) - '0'));
				}else {
					list.add(s.charAt(i) - '0');
				}
			}
			
			System.out.println("#" + tc + " " + list.size());
		}

	}

}
