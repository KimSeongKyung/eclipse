/*
 * bw.flush()는 남아 있는 데이터를 모두 출력하는 것으로 이것을 선언하지 않으면 출력
 * 일어나지 않음.
 */

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class LevelA_49 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] vowels = {'a','e','i','o','u'};
        List<Character> list = new ArrayList<>();
        
        for(int i=0; i<vowels.length; i++) {
        	list.add(vowels[i]);
        }
        
        
		
	    while(true) {
	    	String pw = br.readLine();
	    	if(pw.equals("end")) break;
	        char[] array = pw.toCharArray();
	        boolean isValid = true;
	        int voCount=0;
	        
	       for(int i=0; i<array.length; i++) {
	    	   if(list.contains(array[i])) {
	    		   voCount++;
	    	   }
	       }
	       
	       if(voCount==0) isValid=false;
	       
	       if(isValid) {
	    	   for(int j=0; j<array.length-2; j++) {
	    		   if(list.contains(array[j]) && list.contains(array[j+1]) && list.contains(array[j+2])){
	    			   isValid = false;
                       break;
	    		   }
	    		   else if(!list.contains(array[j]) && !list.contains(array[j+1]) && !list.contains(array[j+2])){
	    			   isValid = false;
	    			   break;
	    		   }
	    			   
	    	   }
	       }
	       
	       if(isValid) {
	    	   for(int i=0; i<array.length-1; i++) {
	    		   if(array[i]!='e' && array[i]!= 'o' && array[i]==array[i+1]) {
	    			   isValid = false;
	    			   break;
	    		   }
	    	   }
	       }
	      
	       if(isValid) bw.write("<"+pw+"> is acceptable.\n");
	       else bw.write("<"+pw+"> is not acceptable.\n");
	      
	       
	    }
	    bw.flush();  
	    bw.close();
	}

}
