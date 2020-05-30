package SWexpert;

import java.util.*;
public class MemoryRestore {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int cnt;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			
			String memory = sc.next();
			
			int chk = 0;
			int cnt = 0;
			
			for(int i=0;i<memory.length();i++) {
				if(memory.charAt(i) != String.valueOf(chk).charAt(0)) {
					cnt++;
					if(chk == 0) {
						chk = 1;
						
					}else {
						chk = 0;
					}
				}
			}
			System.out.println("#" + tc + " " + cnt);
			
		}

	}

}
