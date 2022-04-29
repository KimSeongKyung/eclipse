import java.util.Arrays;

public class LevelA_90 {
	public static void main(String args[]) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int result = removeDuplicates(nums);
		System.out.println(result);
	}
	
	
	 public static int removeDuplicates(int[] nums) {
		 int count=0;       
		 int i=0;
		 while(i<nums.length-1-count) {
			 if(nums[i]==nums[i+1]) {
				 System.out.println("before: "+ Arrays.toString(nums));
				 System.out.println("nums["+i+"]= " + nums[i] + 
						 "  nums["+(i+1)+"]= " + nums[i+1]);
				 
				 for(int j=i+1; j<nums.length-1-count; j++) {
					 nums[j] = nums[j+1];
				 }
				 nums[nums.length-1-count] = nums[i];
				 
				 System.out.println("after: "+ Arrays.toString(nums));
				 System.out.println();
				 
				 count++;
			 }
			 else i++;
		 }
	     return nums.length-count;   
		 
	    }

}
