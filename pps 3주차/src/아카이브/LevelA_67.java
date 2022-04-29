/*
 *재귀로 풀긴 했는데 시간 초과...
 *
 */

/*public class LevelA_67 {
	static String result;
	public static void main(String args[]) {
		String s = "abbaca";
		String result = removeDuplicates(s);
		System.out.println(result);
		
	}
	
	
	public static String removeDuplicates(String s) {
		if(s.length()<2) return s;
		char[] letters = s.toCharArray();
		boolean allDif = true;
		for(int i=0; i<letters.length-1; i++) {
			if(letters[i]==letters[i+1]) {
				allDif = false;
				String str = s.substring(0,i)+s.substring(i+2);
				result = removeDuplicates(str);
			}
		} 
		if(allDif) return s;
		return result;	 
	}
}*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LevelA_67{
	public static void main(String args[]) {
		String s = "abbaca";
		String result = removeDuplicates(s);
		System.out.println(result);
		
	}
	
	public static String removeDuplicates(String s) {
		String result="";
		char[] letters = s.toCharArray();
		Character[] letters2 = new Character[letters.length];
		
		for(int i=0; i<letters.length; i++) {
			letters2[i] = letters[i];
		}
		List<Character> list = new ArrayList<>(Arrays.asList(letters2));
		
		
	/*	for(int i=0; i<list.size()-1; i++) {//한 번 쓰여진 
			                    //반복 조건은 바뀌지 않음 list.size() 상수로 변
			if(list.get(i)==list.get(i+1)) {
//				list.remove(i);
//				list.remove(i); //한 번 지웠으니깐 인덱스 하나 줄여야 함 
			    
			}
		}*/
		
		int a= list.size();
		while(a>1) { 
			for(int i=0; i<list.size()-1; i++) {//한 번 쓰여진 
					                    //반복 조건은 바뀌지 않음 list.size() 상수로 변함...
				//무한반복하는 이유좀;;;;;;;;;;;;
				if(list.get(i)==list.get(i+1)) {
					list.remove(i);
					list.remove(i); //한 번 지웠으니깐 인덱스 하나 줄여야 함 
				    
				}
			}
			a = list.size();
			System.out.println(list);
		}
		
	    for(int i=0; i<list.size(); i++) {
	    	result += Character.toString(list.get(i));
	    }
		return result;
		
	}
}
