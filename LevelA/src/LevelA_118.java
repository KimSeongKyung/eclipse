import java.util.Arrays;

public class LevelA_118 {
	static int[] nums = {0,1,0,3,12};
	public static void main(String args[]) {
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
		
	}
	
	public static void moveZeroes(int[] nums) {
		int i=0, count=0;
		while(i < nums.length-count) {
			if(nums[i] == 0) {
				//nums[nums.length-1-count] = 0; 에러해결! 이렇게 하면 12가 없어지지..
				for(int j=i; j<nums.length-count-1; j++)
					nums[j] = nums[j+1];
				nums[nums.length-1-count] = 0;
				count++;
			}
			else i++;
		}
	        
    }

}
