import java.util.Arrays;

public class LevelA_92 {
	public static void main(String args[]) {
		int[] nums = {4,2,5,7};
		int[] result = sortArrayByParityII(nums);
		
		System.out.println(Arrays.toString(result));
		
	}
	
	  public static int[] sortArrayByParityII(int[] nums) {
		    int[] odds = new int[nums.length/2];
			int[] evens = new int[nums.length/2];
			int[] sortNums = new int[nums.length];
			
			int oCount=0;
			int eCount=0;
			
			for(int i=0; i<nums.length; i++) {
				if(nums[i]%2!=0) {
					odds[oCount] = nums[i];
					oCount++;
				}
				else {
					evens[eCount] = nums[i];
					eCount++;
				}
			}
			
			for(int i=0; i<odds.length; i++) {
				sortNums[2*i+1]  = odds[i];
			}
			
			for(int i=0; i<evens.length; i++) {
				sortNums[2*i] = evens[i];
			}
	        
			return sortNums;
	  }

}
