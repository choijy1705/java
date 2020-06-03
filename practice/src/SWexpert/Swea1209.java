package SWexpert;
import java.util.*;
public class Swea1209 {
	static Scanner sc = new Scanner(System.in);
	static int[][] arr;
	public static void main(String[] args) {
		
		for(int tc=1;tc<=10;tc++) {
			sc.nextInt();
			
			arr = new int[100][100];
			int max = 0;
			for(int i=0;i<100;i++) {
				for(int j=0;j<100;j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int suma = 0;
			int sumb = 0;
			for(int i=0;i<100;i++) {
				int sumrow = 0;
				int sumcol=0;
				
				for(int j=0;j<100;j++) {
					sumrow += arr[i][j];
					sumcol += arr[j][i];
					
					if(i == j) {
						suma += arr[i][j];
					}
					
					if(i == 100-j) {
						sumb +=arr[i][j];
					}
				}
				if(sumrow > max) {
					max = sumrow;
				}
				
				if(sumcol > max) {
					max = sumcol;
				}
			}
			
			max = Math.max(max, Math.max(suma, sumb));
			System.out.println("#" + tc + " " + max);
			
			
		}

	}

}
