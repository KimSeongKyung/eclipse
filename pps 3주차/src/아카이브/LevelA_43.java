
public class LevelA_43 {
	public static void main(String args[]){
		String[] strs = {"dog","racecar","car"};
		String result = longestCommonPrefix(strs);
		System.out.println(result);
	}
	
	
	public static String longestCommonPrefix(String[] strs) {
		String result="";
		boolean isValid = true;
		int shortest = 200;
		int shortest_i=0;
		
		for(int i=0; i<strs.length; i++) {
			if(strs[i].length() < shortest) {
				shortest = strs[i].length();
				shortest_i = i;
			}
		}
		
		for(int i=0; i<shortest; i++) {
			for(int j=0; j<strs.length; j++) {
				if(strs[shortest_i].charAt(i) != strs[j].charAt(i)) {
					isValid = false;
					break;
				}
			}
			if(!isValid) break;
			result += strs[shortest_i].charAt(i);
			
		}
		
		
	    return result; 
	}

}
