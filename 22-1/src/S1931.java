import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class S1931 {
	public static void main(String args[]) {
		int N;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int finish;
		int count=1;
		int[][] meetings = new int[N][2];
		
		for(int i=0; i<N; i++) {
			meetings[i][0] = sc.nextInt();
			meetings[i][1] = sc.nextInt();	
		}
		
		Arrays.sort(meetings, new Comparator<int[]> () {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] != o2[1]) return o1[1] - o2[1];
				else return o1[0] - o2[0];
			}	
		});
		
		finish = meetings[0][1];
		
		for(int i=1; i<N; i++) {
			if(finish <= meetings[i][0]) {
				finish = meetings[i][1];
				count++;
			}
		}
		
		System.out.println(count);
		sc.close();
		
	}

}
