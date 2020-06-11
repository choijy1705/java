package SWexpert;
//북북서
import java.util.*;


public class Swea8556 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	public static void main(String[] args) {

		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			String st = sc.next();
			
			st = st.replaceAll("west", "0");
			st = st.replaceAll("north","1");
			
			String[] num = st.split("");
			
			int north = 0;
			int west = 0;
			
			double dir=-1;
			
			
			for(int i=num.length-1;i>=0;i--) {
				if(dir == -1) {
					if(num[i].equals("0")) {
						dir = 90;
						west++;
					}else if(num[i].equals("1")) {
						dir=0;
						north++;
					}
				}else {
					if(num[i].equals("0")) {
						dir = dir - (90/Math.pow(2, west));
						west++;
					}else if(num[i].equals("1")) {
						dir = dir + (90/Math.pow(2, north));
						north++;
					}
				}
			}
			System.out.println("#" + tc + " " + dir);
			
		}

	}

}
