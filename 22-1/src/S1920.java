import java.util.Scanner;
import java.util.Arrays;

public class S1920 {
	public static void main(String args[]) {
		int N,M;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		int [] nums = new int[N];
		
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		
		
		M = sc.nextInt();
		int [] findNum = new int[M];
		
		for(int i=0; i<M; i++) {
			findNum[i] = sc.nextInt();
		}
		
		Arrays.sort(nums);
		
		int low=0; 
		int high = N-1; 
		
		for(int i=0; i<M; i++) {
			if(binarySearch(nums, findNum[i], low, high) == -1) 
				System.out.println(0);
			else System.out.println(1);
		}
		sc.close();
		
		
	}
	
	public static int binarySearch(int[] nums, int key, int low, int high) {
		
		int mid;
		
		if(low <= high) {
			mid = (low+high)/2;
			if(key == nums[mid]) return mid;
			else if(key < nums[mid]) return binarySearch(nums, key, low, mid-1);
			else return binarySearch(nums, key, mid+1, high);
		}
		
		return -1;
		
	}

}
