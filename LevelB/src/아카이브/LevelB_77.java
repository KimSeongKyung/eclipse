import java.math.*;

public class LevelB_77 {
	public static void main(String args[]) {
		int n = 5;
		BigInteger result = new BigInteger("0");
		System.out.println(result);
		result = fibonacci(n);
		System.out.println(result);
		
		
	}
	
	public static BigInteger fibonacci(int n) {
		if(n==1) return BigInteger.valueOf(1);
		else if(n==2) return BigInteger.valueOf(1);
		return fibonacci(n-1).add(fibonacci(n-2));
	}

}
