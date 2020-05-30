package SWexpert;
//암호 생성기

import java.util.*;
public class Swea1225 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for(int tc=1;tc<=10;tc++) {
			List<Integer> list = new ArrayList<>();
			sc.nextInt();
			
			for(int i=0;i<8;i++) {
				list.add(sc.nextInt());
			}
			int k = 1;
			while(true) {
				
				int a = list.get(0) - k;
				if( k == 5) {
					k = 1;
				}else {
					k++;
				}
				
				list.remove(0);
				if( a<=0) {
					a = 0;
					list.add(a);
					break;
				}
				list.add(a);
				
			}
			
			String result = "";
			for(int i=0;i<8;i++) {
				result += list.get(i) + " ";
			}
			
			System.out.println("#" + tc + " " + result);
					
		}

	}

}
