import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class LevelA_97 {
	public static void main(String args[]) {
		int[] numbers = {0,0,1,2,3};
		int target = 0;
		int[] result = twoSum(numbers, target);
		System.out.println(Arrays.toString(result));
		
		
	}
	
	
	public static int[] twoSum(int[] numbers, int target) {
       List<Integer> list = new ArrayList<>();
       int[] indexs = new int[2];
       int num;
       for(int i=0; i<numbers.length; i++) {
    	   list.add(numbers[i]);
       }
       
       for(int i=0; i<list.size(); i++) {
    	   num = target-list.get(i);
    	   if(list.contains(num)) {
    		   if(num != list.get(i)){
    			   indexs[0] = i+1;
        		   indexs[1] = list.indexOf(num)+1;
        		   break;
    		   }  
    		   else {
    			   list.remove(list.get(i));
    			   if(list.indexOf(num) != -1) {
    				   indexs[0] = i+1;
    				   indexs[1] = list.indexOf(num)+2;
    			   }
    			}
    	   }
    	}
      
       
       return indexs;	
    }

}
