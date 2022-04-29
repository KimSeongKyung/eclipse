import java.util.Scanner;

public class LevelA_22 {
	public static void main(String[] args) {
		int num;
		int[] sec;
		int[] sum = new int[2];
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sec = new int[num];
		
		for(int i=0; i<num; i++) {
			sec[i] = sc.nextInt();
		}
		for(int i=0; i<num; i++) {
			sum[0] += 10*(sec[i]/30+1);
			sum[1] += 15*(sec[i]/60+1);
		}
		if(sum[0]>sum[1]) System.out.println("M "+sum[1]);
		else if(sum[0]<sum[1]) System.out.println("Y "+sum[0]);
		else System.out.println("Y M "+sum[0]);
		
		sc.close();
	}

}
