/* 숫자 중 printable ASCII character는 0~9 임!!

*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class LevelA_74 {
	public static void main(String args[]) {
		String s;
		boolean result;
		Scanner sc = new Scanner(System.in);
		s= sc.nextLine();
		result = isPalindrome(s);
		System.out.println(result);
				
		sc.close();
	}
	
	public static boolean isPalindrome(String s) {
        boolean isPalin = true;
        String str = s.toLowerCase();
        char[] array = str.toCharArray();
        
        List<Character> list = new ArrayList<>();
        
        for(int i=0; i<array.length; i++) {
        	if(('a'<=array[i] && array[i]<='z') || ('0'<=array[i] && array[i]<='9'))
        		list.add(array[i]);
        }
        
        int j;
        for(int i=0; i<list.size(); i++) {
        	j = list.size()-1-i;
        	if(i<=j) {
        		if(list.get(i) != list.get(j)) {
        			isPalin = false;
        			break;
        		}
        	}
        }
        
        return isPalin;
        
    }

}
