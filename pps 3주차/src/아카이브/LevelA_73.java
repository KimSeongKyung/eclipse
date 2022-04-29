import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LevelA_73 {
	public static void main(String args[]) {
		int n;
		List<String> result = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		result = fizzBuzz(n);
		System.out.println(result);
		sc.close();
		}
	
	
	 public static List<String> fizzBuzz(int n) {
		 List<String> list = new ArrayList<>();
		 for(int i=1; i<=n; i++) {
			 if(i%15==0) list.add("FizzBuzz");
			 else if(i%3==0) list.add("Fizz");
			 else if(i%5==0) list.add("Buzz");
			 else list.add(Integer.toString(i));
		 }
	     return list; 
	 }

}
