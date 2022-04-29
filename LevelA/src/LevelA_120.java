import java.util.Scanner;
import java.util.Arrays;

public class LevelA_120 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		char result = findTheDifference(s,t);
		System.out.println(result);
	    sc.close();
	}
	
	public static char findTheDifference(String s, String t) {
		char difference='?';
		char[] arrayS = s.toCharArray();
		char[] arrayT = t.toCharArray();
		
		Arrays.sort(arrayS);
		Arrays.sort(arrayT);
		
		for(int i=0; i<arrayS.length; i++) {
			if(arrayS[i] != arrayT[i]) {
				difference = arrayT[i];
				break;
			}
		}
		if(difference=='?') difference = arrayT[arrayT.length-1];
		return difference;
	    
	}

}
