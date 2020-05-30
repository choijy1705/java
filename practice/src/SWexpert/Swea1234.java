package SWexpert;

import java.util.*;
public class Swea1234 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		for(int tc=1;tc<=1;tc++) {
			int len = sc.nextInt();
			
			Stack<Integer> stack = new Stack<>();
			
			String st = sc.next();
			
			for(int i=0;i<len;i++) {
				int now = Integer.parseInt(String.valueOf(st.charAt(i)));
				
				if(stack.isEmpty()) {
					stack.push(now);
				}else if(now == stack.peek()) {
					stack.pop();
				}else {
					stack.push(now);
				}
			}
			String result = "";
			int k = stack.size();
			for(int i=0;i<k;i++) {
				result = stack.pop()+result; 
			}
			
			System.out.println("#" + tc + " " + result);
		}
		

	}

}
