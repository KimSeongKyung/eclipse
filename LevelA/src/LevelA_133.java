import java.util.Scanner;

public class LevelA_133 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String title = sc.next();
		String result = capitalizeTitle(title);
		System.out.println(result);
		sc.close();
		
	}
	
	 public static String capitalizeTitle(String title) {
		 String capitalizeT = "";
		 String[] words = title.split(" ");
		 for(int i=0; i<words.length; i++) {
			 System.out.println(words[i]);
		 }
		 for(int i=0; i<words.length; i++) {
			 if(words[i].length() <=2 ) {
				 String newWord = words[i].toLowerCase();
				 capitalizeT += newWord;
			 }
			 else {
				String front = words[i].substring(0,1);
				String newFront = front.toUpperCase();
				String rest = words[i].substring(1, words[i].length());
				String newRest = rest.toLowerCase();
				capitalizeT += newFront + newRest;
				
			 }
			 capitalizeT += " ";
		 }
		 return capitalizeT;
	    
    }

}
