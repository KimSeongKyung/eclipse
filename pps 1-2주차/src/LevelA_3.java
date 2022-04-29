//import java.math.*;

public class LevelA_3 {
	public static void main(String[] args) {
	   
		int[] digits = {9,9,9};
		digits = plusOne(digits);
		
		for(int i=0; i<digits.length; i++) {
			System.out.println(digits[i]);
		}
		
	
	}
	
	public static int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for(int i=n-1; i>=0; i--){
        	if(digits[i]==9) {
        		digits[i]=0;
        	}
        	else {
        		digits[i]++;
        		return digits;
        	}
        }
      ///새로 알게된 사실!!! 
        /*
         * 원래는 digits={9,9,9}라
         * digits[0]=0, digits[1]=0, digits[2]=0
         * 근데
         * digits = new int[n+1]  digits를 길이 하나 더 늘려서 재선언하고
         * digits[0]=1 이라고 하면 digits의 첫 번째 원소가 1이 되고 나머지는 밀려남!!!!!!><
         * 
         */
        digits = new int[n+1];
    	digits[0] = 1;
  
    	return digits;
        
    }
}

		/*BigInteger num = new BigInteger("0");
		//int[] newArray = new int[];
		int[] newArray = null;
		int exponent=digits.length;
		System.out.println("first num: "+ num);
		System.out.println("exponent: "+ exponent);
		for(int i=0; i<digits.length; i++) {
		   // num = num.add(BigInteger.valueOf((long) (digits[i]*(Math.pow(10,exponent-1)))));
		   
			System.out.println(i+"번째 num: " + num);
		    exponent--;
		}
		num = num.add(BigInteger.valueOf(1));
		int i=0;
		exponent = (int)(Math.log10(num.doubleValue())+1);
		newArray = new int[exponent];
		while(exponent>0) {
		    newArray[i] = (num.divide(BigInteger.valueOf((long) Math.pow(10,exponent-1)))).intValue();
		    System.out.println("newArray["+i+"]: " + newArray[i]);
		    num = (num.remainder(BigInteger.valueOf((long) Math.pow(10,exponent-1))));
		    exponent--;
		    i++;
		}
		return newArray;*/
		
