import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;

public class LevelA_99 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean result = isValid(s);
		System.out.println(result);
		sc.close();
		
	}
	
	public static boolean isValid(String s) {
		boolean isValid = true;
		Stack<Character> stack = new Stack<>();
	    HashMap<Character, Character> map = new HashMap<>();
	    char[] brackets = s.toCharArray();
	    
	    map.put(')','(');
	    map.put('}', '{');
	    map.put(']', '[');
	    
	    if(brackets.length%2!=0) isValid = false;
	    else {
	    	for(int i=0; i<brackets.length; i++) {
		    	if(brackets[i]=='(' || brackets[i]=='{' || brackets[i]=='[')
		    		stack.add(brackets[i]);
		    	else {
		    		if(stack.pop() != map.get(brackets[i])) {
		    			isValid = false;
		    			break;
		    		}
		    	}
		    }    	
	    }
	    return isValid;
    }

}
