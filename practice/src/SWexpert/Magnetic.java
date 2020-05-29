package SWexpert;

import java.util.*;
import java.io.*;

public class Magnetic {
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		for(int tc=1;tc<=10;tc++) {
			sc.nextInt();
			String[] columns = new String[100];
			
			for(int i=0;i<100;i++) columns[i] = "";
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					columns[j] += sc.next();
				}
			}
			int result = 0;
			for(int i=0;i<100;i++) {
				String s = columns[i]
						.replace("0","")
						.replaceAll("1+", "1")
						.replaceAll("2+", "2")
						.replaceAll("1$", "")
						.replaceAll("^2", "");
				result += s.length()/2;
						
			}
			
			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			sb.append(result);
			sb.append("\n");
		}
		System.out.println(sb);
		sc.close();
	}

}
