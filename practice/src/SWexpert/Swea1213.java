package SWexpert;

import java.util.*;
public class Swea1213 {
	static Scanner sc = new Scanner(System.in);
	static int cnt;
	
	public static void main(String[] args) {
		
		for(int tc=1;tc<=10;tc++) {
			cnt = 0;
			sc.next();
			String key = sc.next();
			int len = key.length();
			
			String st = sc.next();
			
			Character first = key.charAt(0);
			
			for(int i=0;i<st.length();i++) {
				if(st.charAt(i) == first) {
					if(st.substring(i,i+len).equals(key)) {
						cnt++;
					}
				}
				
			}
			System.out.println("#" + tc + " " + cnt);
		
		}
	}

}
