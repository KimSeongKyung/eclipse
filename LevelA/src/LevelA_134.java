import java.util.Scanner;

public class LevelA_134 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char ch = sc.next().charAt(0);
		String result = reversePrefix(word, ch);
		System.out.println(result);
		sc.close();
		
	}
	
	 public static String reversePrefix(String word, char ch) {
		 String reverse="";
		 int end_i = -1;
	     char[] words = word.toCharArray();
	     for(int i=0; i<words.length; i++) {
	    	 if(words[i]==ch) {
	    		 end_i = i;
	    		 break;
	    	 }
	     }
	    
	     if(end_i==-1) reverse += word;
	     
	     else {
	    	 for(int i=end_i; i>=0; i--) {
		    	 reverse += words[i];
		     }
	    	 for(int i=end_i+1; i<words.length; i++)
	    		 reverse += words[i];
	     }
	     return reverse;
     }

}
