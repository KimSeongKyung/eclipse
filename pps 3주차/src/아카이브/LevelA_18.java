import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class LevelA_18 {
	public static void main(String[] args) {
		int n;
		int[] first;
		int[] second;
		int [] temp1;
		Integer[] temp2;
		int result=0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		first = new int[n];
		second = new int[n];
		temp1 = new int[n];
		temp2 = new Integer[n];
		
		for(int i=0; i<n; i++) {
			first[i] = sc.nextInt();
			temp1[i] = first[i];
		}
		for(int i=0; i<n; i++) {
			second[i] = sc.nextInt();
			temp2[i] = second[i];
		}
		
		Arrays.sort(temp1);
		Arrays.sort(temp2, Collections.reverseOrder());
		// 0 1 1 1 6
		// 8 7 3 2 1
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(temp2[i]==second[j]) {
					first[j] = temp1[i];
				}
			}
		}
		for(int i=0; i<n; i++) {
			result += first[i]*second[i];
		}
		System.out.println(String.valueOf(result));
		sc.close();
	}

}
