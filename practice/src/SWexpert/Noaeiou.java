package SWexpert;
// 모음이 보이지 않는 사람

import java.util.*;
public class Noaeiou {
	static Scanner sc = new Scanner(System.in);
	static int C;
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		
		for(int tc=1;tc<=C;tc++) {
			String st = sc.next();
			StringBuilder sb = new StringBuilder();
			
			for(int i=0;i<st.length();i++) {
				if(st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o' || st.charAt(i) == 'u'  ) {
					
				}else {
					sb.append(st.charAt(i));
				}
			}
			
			System.out.println("#" + tc + " " + sb.toString());
		
		}

	}

}
