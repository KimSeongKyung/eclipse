import java.util.Scanner;

public class LevelA_96 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = hammingWeight(n);
		System.out.println(result);
		sc.close();
	}
    
	
	public static int hammingWeight(int n) {
		int count=0;
        long unsignedValue = n & 0xffffffffL;
        System.out.println(unsignedValue);
        count  = Long.bitCount(unsignedValue);
        return count;
        
    }
}
