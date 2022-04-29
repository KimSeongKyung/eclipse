import java.util.Scanner;


public class LevelA_106 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		for(int i=0; i<test_case; i++) {
			//String str = sc.nextLine(); nextLine하면 안되는 이유
			String str = sc.next();
			char[] s = str.toCharArray();
			int[] alpha = new int[26];
			int sum=0;
			
			for(int j=0; j<s.length; j++) {
				alpha[s[j]-65] ++;
			}
			
			for(int j=0; j<alpha.length; j++) {
				if(alpha[j] == 0) sum += 65+j;
			}
			System.out.println(sum);
		}
		sc.close();
	}

}
