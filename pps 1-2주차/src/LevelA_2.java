//왜 set으로 하면 안될까....?
//답) set은 특정 인덱스값을 대체하는 메소드임. 따라 초기값을 선정할때는 add메소드로, 그것을 대체할 때는 set으로 
import java.util.*;

public class LevelA_2 {
	public static void main(String[] args) {
		
	        List<List<Integer>> pascal = new ArrayList<>(5);
	        int temp;
	        
	        for(int i=0; i<5; i++) {
	            List<Integer> list  = new ArrayList<>(i+1);
	            list.add(1);
	           
	            for(int j=1; j<i; j++){
	                temp = pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j);
	                list.add(temp);
	            }
	            
                if(i>=1) list.add(1);
	            pascal.add(list);
	        }
	        
	        for(List<Integer> i : pascal) {
	        	System.out.print(i);
	        }
	        
	       
	}
	
}
