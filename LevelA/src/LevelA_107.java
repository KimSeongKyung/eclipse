import java.util.Scanner;

public class LevelA_107 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] nums = new int[1000];
		int index=0;
		int number=1;
		int sum=0;
		
		while(true) {
			for(int j=0; j<number; j++) {
				nums[index] = number;
				index++;
				if(index == 1000) break;
			}
			if(index == 1000) break;
			number++;
		}
		
		for(int i=a-1; i<=b-1; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		sc.close();
		
		
	}

}
