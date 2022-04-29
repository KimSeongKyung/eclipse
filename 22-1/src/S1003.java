import java.util.Scanner;

public class S1003 {
	static int count0 = 0;
	static int count1 = 0;
	public static void main(String args[]) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		for(int i=0; i<N; i++) {
			count0 = 0;
			count1 = 0;
			fibonacci(i);
			System.out.print("\n" + count0 + " ");
			System.out.print(count1);
		}
		sc.close();
		
	}
	
	public static int fibonacci(int n) {
		if(n==0) {
			count0 ++;
			System.out.println("Debug count0: " + count0);
			return 0;
		} else if(n==1) {
			count1 ++;
			System.out.println("Debug count1: " + count1);
			return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

}
