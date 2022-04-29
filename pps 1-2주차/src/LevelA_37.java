import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class LevelA_37 {
	public static void main(String[] args) {
		List<Integer> selfDiv = new ArrayList<>();
	    int a,b;
	    Scanner sc = new Scanner(System.in);
	    a = sc.nextInt();
	    b = sc.nextInt();
	    
	    selfDiv =  selfDividingNumbers(a,b);
	    for(Integer i : selfDiv) {
	    	System.out.println(i);
	    }
	    sc.close();

	}
	  public static List<Integer> selfDividingNumbers(int left, int right) {
	        List<Integer> selfDiv = new ArrayList<>();
	        int temp;
	        boolean isValid;
	        
	        for(int i=left; i<=right; i++){
	            isValid = true;
	            temp = i;
	            System.out.println(temp);
	            for(int j=0; j<(int)(Math.log10(i)+1); i++) {
	                if(temp%10==0) {
	                    isValid = false;
	                    break;
	                }
	                if(i%(temp%10)!=0) {
	                    isValid = false;
	                    break;
	                }
	                temp = temp/10;   
	            }
	            if(isValid) {
	            	selfDiv.add(i);
	            	System.out.println(i);
	            }
	         }
	        return selfDiv;
	     
	    }
 }
