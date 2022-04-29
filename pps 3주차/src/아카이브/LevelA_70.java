/*
 * queue.poll()에서 poll()함수는 큐의 첫 번째 값을 반환하고 제거함!!
 * 
 */

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class LevelA_70 {
	public static void main(String args[]) {
		int N;
		int result;
		Queue<Integer> queue = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			queue.offer(i+1);
		}
		
		for(int i=0; i<N-1; i++) {
			queue.remove();
			//int temp= queue.peek();
			int temp = queue.poll();  //제거할 원소 반환하고 제거
			queue.add(temp);
		}
		result = queue.peek();
		System.out.println(result);
		sc.close();
	}

}
