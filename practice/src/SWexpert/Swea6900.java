package SWexpert;
// 주혁이의 복권 당첨
import java.util.*;
public class Swea6900 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			String[] lotto = new String[N];
			int[] money = new int[N];
 			
			for(int i=0;i<N;i++) {
				lotto[i] = sc.next();
				money[i] = sc.nextInt();
			}
			
			String[] buy = new String[M];
			
			for(int i=0;i<M;i++) {
				buy[i] = sc.next();
			}
			int get = 0;
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					
					if(buy[i].length() == lotto[j].length()) {
						boolean chk = true;
						for(int k=0;k<buy[i].length();k++) {
							if(buy[i].charAt(k) == lotto[j].charAt(k) || lotto[j].charAt(k) == '*') {
								
							}else {
								chk = false;
								break;
							}
						}
						if(chk) {
							get += money[j];
							buy[i] = "";
						}
					}
					
				}
			}
			
			System.out.println("#" + tc + " " + get);
		}

	}

}
