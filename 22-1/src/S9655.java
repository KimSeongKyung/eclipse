import java.util.Scanner;

public class S9655 {
	public static int count=1;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String result = game(N, count);
		System.out.println(result);
		sc.close();
		
		
	}
	
	public static String game(int N, int count) {
		String result="";
		
		if(N == 3 || N == 1) {
			
			if(count%2 !=0) {
				result = "SK";
			}
			else result = "CY";
			return result;
		}
		
		else if(N >3) return game(N-3, count+1);
	    else return game(N-1, count+1);

		
	}

}
