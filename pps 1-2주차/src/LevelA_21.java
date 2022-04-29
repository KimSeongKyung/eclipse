import java.util.Scanner;

public class LevelA_21 {
	public static void main(String[] args) {
		int num;
		int result=0;
		int n;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=0; i<num-1; i++) {
			n = sc.nextInt();
			result +=(n-1);
		}
		n = sc.nextInt();
		result += n;
		
		System.out.println(result);
		sc.close();
	}

}
