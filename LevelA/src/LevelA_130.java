import java.util.Scanner;
import java.util.Stack;

public class LevelA_130 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		int K = sc.nextInt();
		int n;
		int sum=0;
		for(int i=0; i<K; i++) {
			n = sc.nextInt();
			if(n==0) stack.pop();
			else stack.add(n);
		}
		while(!stack.empty()) {
			sum += stack.pop();
		}
		System.out.println(sum);
		sc.close();
	}

}
