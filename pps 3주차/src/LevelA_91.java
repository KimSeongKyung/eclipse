import java.util.Arrays;

public class LevelA_91 {
	public static void main(String args[]) {
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;
		int result = removeElement(nums, val);
		System.out.println(result);
		
	}
	
    public static int removeElement(int[] nums, int val) {
        int count=0;
        int i=0;
        while(i<nums.length-count) {
        	if(nums[i]==val) {
        		
        		 System.out.println("before: "+ Arrays.toString(nums));
				 System.out.println("nums["+i+"]= " + nums[i]);
				 
        		for(int j=i; j<nums.length-1-count; j++) {
        			nums[j] = nums[j+1];
        		}
        		nums[nums.length-1-count] = val;
        		count++;     //배열 뒤에 있는 val이랑 같아서 있는 원소 개수. 
        		
        		 System.out.println("after: "+ Arrays.toString(nums));
				 System.out.println();
        	}
        	else i++;
        }
        return nums.length-count;
    }

}
