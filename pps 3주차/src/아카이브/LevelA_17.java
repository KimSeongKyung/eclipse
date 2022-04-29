/*
 * int의 길이(자릿수)구하는 방법  - (int)( Math.log10(num)+1 )
 * 근데 걍 int로 받지 말고 String으로 받으면 됨^^
 * 
 * Integer.parseInt()에서 파라미터안에 문자열 밖에 못옴. 
 */

import java.util.Scanner;

public class LevelA_17 {
	public static void main(String[] args) {
	    String num;
	    int setCount=1;
	    int[] count = new int[10];
	    int n;
	    
	    Scanner sc = new Scanner(System.in);
	    num = sc.nextLine();
	    char[] nums = num.toCharArray();
	    
	    for(int i=0; i<nums.length; i++) {
	    	n = nums[i]-48;
	    	count[n] ++;
	    	if(setCount < count[n]) {
	    		if(n==6) {
	    		   if(setCount > count[9]) {
	    			   count[9]++;
	    			   count[6]--;
	    		   }
	    		   else setCount++;
	    		}
	    		else if(n==9) {       
	    		   if(setCount > count[6]) {
	    			   count[6]++;
	    			   count[9]--;
	    		   }
	    		   else setCount++;
		    	}
	    		else setCount++;
	    	}
	    }
	    System.out.println(setCount);
	    sc.close();
	}	
	
}







/*
 * 에러해결 ... else if로 안하고 if로 하게 될 경우 n==6일때 
 * 첫번째 if문을 수행하고 다음 if문이 맞는지 확인한다. 근데 n==9
 * 가 아니기 때문에 조건에 부합하지 않고 그게 아닌 else문을 수행한다.
 * else if로 하면 n==6인 조건이 아닌 경우가 전제하기 때문에 n==6
 * 일때 밑에 거들떠도 안보고 그냥 첫번째 if문에서 끝냄.
 * 
 * if - else 문이 한 세트   // if - else if - else 문이 한 세트 
 */