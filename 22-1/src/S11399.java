import java.util.Scanner;
import java.util.Arrays;

public class S11399 {
	
	static int time=0;
	public static void main(String args[]) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		int[] p = new int[N];
		
		for(int i=0; i<N; i++) {
			p[i] = sc.nextInt();
		}
		
		Arrays.sort(p);
		
		int j;
		for(int i=0; i<N; i++) {
			time += p[i];
			j = i-1;
			while(j >=0 ) {
				time += p[j];
				j--;
			}
		}
		
		System.out.println(time);
		sc.close();		
		
	}

}
