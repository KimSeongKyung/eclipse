import java.util.Scanner;

public class LevelA_94 {
	public static void main(String args[]) {
		String s;
	    int count=0;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char[] alpha = s.toCharArray();
		
	    for(int i=0; i<alpha.length; i++) {
	    	if(alpha[i]=='=') {
	    		if(alpha[i-1]=='z') {
	    			if(i>=2) {
	    				if(alpha[i-2]=='d') count --;
	    			}		
	    		}		
	    	}
	    	
	    	else if(alpha[i] == '-') count= count;
	    	else if(alpha[i] == 'j' && i>=1) {
	    		count++;
	    		if(alpha[i-1] == 'l' || alpha[i-1] =='n') count--;	
	    	}
	    	else count++;
	    }
		
		System.out.println(count);
		sc.close();
	}
}
