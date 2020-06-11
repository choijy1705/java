package SWexpert;
import java.util.*;
public class Swea3131 {


	static boolean prime[] = new boolean[1000001];
	static ArrayList<Integer> prime_numbers = new ArrayList<>();
    
    public static void main(String[] args) throws Exception{
		

        int N = 1000000;

        prime[0] = prime[1] = true;
        
        for(int i=2; i*i<=N; i++){

            if(!prime[i]){

            	for(int j=i*i; j<=N; j+=i) prime[j]=true;                
            }        
        }    
        
        // 소수 출력
        for(int i=1; i<=N;i++){
        	if(!prime[i]) prime_numbers.add(i);     
        }
        
        for(int i=0; i<prime_numbers.size(); i++) {
        	System.out.print(prime_numbers.get(i) + " ");
        }
        
    }
}