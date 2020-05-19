package practice;

import java.util.*;
import java.io.*;

public class QuadTree {
	static int tCase, pointer;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	

	public static void main(String[] args) throws IOException {
		tCase = Integer.parseInt(br.readLine());
		
		for(int t=1;t<=tCase;t++) {
			pointer = -1;
			String input = br.readLine();
			System.out.println(recursive(input));
		}

	}


	private static String recursive(String input) {
		
		pointer += 1;
		char ch = input.charAt(pointer);
		if(ch == 'b' || ch == 'w') {
			return ch + "";
		}
		
		String leftUp = recursive(input);
		String rightUp = recursive(input);
		String leftDown = recursive(input);
		String rightDown = recursive(input);
		
		return "x" + leftDown + rightDown+ leftUp + rightUp;
	}

}
