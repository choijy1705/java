package SWexpert;
import java.util.*;
public class Swea4789 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String person = sc.next();
			String[] st = person.split("");
			int[] people = new int[st.length];
			for(int i=0;i<st.length;i++) {
				people[i] = Integer.parseInt(st[i]);
			}
			
			int clab = people[0];
		
			int result = 0;
			while(true) {
				boolean chk = true;
				for(int i=1;i<people.length;i++) {
					if(clab >= i) {
						clab += people[i];
						
						people[i]=0;
					}else {
						chk = false;
					}
				}
				
				if(chk) {
					break;
				}else {
					clab++;
					result++;
				}
			}
			System.out.println("#" + tc + " " + result);
			
		}
	}

}
