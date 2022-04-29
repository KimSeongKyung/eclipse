import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class S11047 {
	public static int count=0;
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		Integer[] coins = new Integer[N];
		
		
		for(int i=0; i<N; i++) {
			coins[i] = sc.nextInt();
		}
		
	    Arrays.sort(coins, Collections.reverseOrder());
	    minimumCount(coins, K);
	    
	    System.out.println(count);
	    sc.close();
	    
	}
	
	
//	public static void minimumCount(Integer[] coins, int K) {
//		if(K == 0) return;
//		else {
//			for(int i=0; i<coins.length; i++) {
//				if(coins[i] <= K) {
//					K -= coins[i];
//					count++;
//					break;
//				}
//			}
//			minimumCount(coins, K);
//		}
//		
//	}
	
	public static void minimumCount(Integer[] coins, int K) {
		
		while(K!=0) {
			for(int i=0; i<coins.length; i++) {
				if(coins[i] <= K) {
					K -= coins[i];
					count++;
					break;
				}
			}
		}
	}

}
