import java.util.Scanner;

public class LevelA_31 {
	public static void main(String[] args) {
		int n;
		int m;
		int result;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		if(n==1 & m==1) result = 0;
		else if(n>=m) result = 1+(m-1)*n;
		else result = 1+(n-1)*m;
		
		System.out.println(result);
		sc.close();
	}

}