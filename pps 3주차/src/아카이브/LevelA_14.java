import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LevelA_14 {
	public static void main(String args[]) {
		int[] nums = {0,1,2,4,5,7};
		List<String> list = summaryRanges(nums);
		
		System.out.println(list);
			
	}
	
	 public static List<String> summaryRanges(int[] nums) {
		 List<String> list = new ArrayList<>();
	     int i=0;
	     int first=0;
	     int last=0;
	     
	     while(i < nums.length) {
	    	 first = nums[i];
	    	 if(i != nums.length-1) {
	    		 for(int j=i+1; j<nums.length; j++) {
		    		 if(nums[j] == nums[i]+1) i++;
		    		 else {
		    			 
		    			 last = nums[i];
		    			 list.add(first+ "->" +last);
		    			
		    			 break;
		    		 }
		    	 }
	    		 i++;
	    	 }
	    	 else list.add(first + "->" + first); 	 
	     }
		 
		 return list;
	 }

}
