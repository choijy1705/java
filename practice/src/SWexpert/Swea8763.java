package SWexpert;

// 코딩 토너먼트
import java.util.*;
public class Swea8763 {
	static Scanner sc = new Scanner(System.in);
	static int C;
	static int K;
	static int result;
	static int[] arr;
	
	public static void main(String[] args) {
		C = sc.nextInt();
		
		for(int tc=1;tc<=C;tc++) {
			K = sc.nextInt();
			result = 0;
			
			int numOfPeople = (int)Math.pow(2, K);
			
			peopleArray(numOfPeople);
			findWinner(arr);
			
			System.out.println("#" + tc + " " + result);
		}

	}

	private static void findWinner(int[] arr) {
		int[] next = new int[arr.length/2];
		int i=0;
		int j=0;
		while(j <next.length) {
			if(arr[i] >= arr[i+1]) {
				next[j] = arr[i];
				result += arr[i]-arr[i+1];
			}else {
				next[j] = arr[i+1];
				result += arr[i+1] - arr[i];
			}
			
			j++;
			i +=2;
		}
		arr = next;
		
		if(arr.length == 1) {
			return;
		}else {
			findWinner(arr);
		}
		
	}

	private static int[] peopleArray(int numOfPeople) {
		arr = new int[numOfPeople];
		
		for(int i=0;i<numOfPeople;i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
		
		
		
	}

}
