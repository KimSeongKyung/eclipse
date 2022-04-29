import java.util.Scanner;

public class LevelA_19 {
	public static void main(String[] args) {
		int [] num = new int[3];
		int result;
		int [] number;
		int [] count = new int[10];
		int len;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			num[i] = sc.nextInt();
		}
		result = num[0]*num[1]*num[2];
		len = (int)(Math.log10(result)+1);
		number = new int[len];
		
		for(int i=0; i<len; i++) {
			number[len-(i+1)] = result%10;
			result = result/10;
		}
		
		
		for(int i=0; i<len; i++) {
			count[number[i]]++;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(count[i]);
		}
		sc.close();
	}
	

}
