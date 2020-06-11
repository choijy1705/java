package SWexpert;
import java.util.*;
public class Swea4047 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			
			String card = sc.next();
			
			Set sets = new HashSet();
			Set setd = new HashSet();
			Set seth = new HashSet();
			Set setc = new HashSet();
			
			
			int i = 0;
			boolean chk = false;
			
			while(i<card.length()) {
				int cardnum = 0;
				
				if(card.charAt(i) == 'S') {
					cardnum = Integer.parseInt(card.substring(i+1,i+3));
					
					if(sets.contains(cardnum)) {
						chk = true;
						break;
					}else {
						sets.add(cardnum);
					}
					
				}else if(card.charAt(i) == 'D') {
					cardnum = Integer.parseInt(card.substring(i+1,i+3));
					
					if(setd.contains(cardnum)) {
						chk = true;
						break;
					}else {
						setd.add(cardnum);
					}
				}else if(card.charAt(i) == 'H') {
					cardnum = Integer.parseInt(card.substring(i+1,i+3));
					
					if(seth.contains(cardnum)) {
						chk = true;
						break;
					}else {
						seth.add(cardnum);
					}
				}else if(card.charAt(i) == 'C') {
					cardnum = Integer.parseInt(card.substring(i+1,i+3));
					
					if(setc.contains(cardnum)) {
						chk = true;
						break;
					}else {
						setc.add(cardnum);
					}
				}
				
				i +=3;
			}
			
			String result = (13-sets.size()) +" " + (13-setd.size()) +" "+ (13-seth.size()) +" " +(13-setc.size());
			
			
			
			
			if(chk) {
				System.out.println("#" + tc + " " + "ERROR");
			}else {
				System.out.println("#" + tc + " " + result);
			}
		}

	}

}
