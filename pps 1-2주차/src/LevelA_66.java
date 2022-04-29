import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class LevelA_66 {
	public static void main(String args[]) {
		String num;
        String result="";
		Scanner sc = new Scanner(System.in);
	    num = sc.nextLine();
	    char[] n = num.toCharArray();
	    Character[] newN = new Character[n.length];
	    
	    for(int i=0; i<newN.length; i++) {
	    	newN[i] = n[i];
	    }
	    
	    Arrays.sort(newN, Collections.reverseOrder());
	    
	    for(int i=0; i<newN.length; i++) {
	    	result += Character.toString(newN[i]);
	    }
	    System.out.println(result);
		sc.close();
	}

}
