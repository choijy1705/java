package SWexpert;

import java.util.*;
public class Password3 {
	static Scanner sc = new Scanner(System.in);
	static List<Integer> list = new ArrayList<>();
	
	static void insert() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i=0;i<y;i++) {
			list.add(x+i, sc.nextInt());
		}
	}
	static void delete() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		for(int i=0;i<y;i++) {
			list.remove(x);
		}
		
	}
	static void append() {
		int y=sc.nextInt();
		for(int i=0;i<y;i++) {
			list.add(sc.nextInt());
		}
	}
	public static void main(String[] args) {
		for(int tc=1;tc<=10;tc++) {
			int N = sc.nextInt();
			
			for(int i=0;i<N;i++) {
				list.add(sc.nextInt());
			}
			
			int M = sc.nextInt();
			for(int i=0;i<M;i++) {
				char command = sc.next().charAt(0);
				switch(command) {
				case 'I':
					insert();break;
				case 'D':
					delete(); break;
				case 'A':
					append(); break;
				}
				
			}
			System.out.format("#%d", tc);
			for(int i=0; i<10; i++) {
				System.out.format(" %d", list.get(i));
			}
			System.out.println();
		}
		sc.close();
	}

}
