/*
 * maps.get(nums[i))는  key nums[i]의 value(상수)를 가져오는 역할만하지 
 * maps.get(nums[i))++와 같은 연산은 못함.
 * 상수 ++ 과 같은 연산은 못하는 것과 같은 이유로..!
 */

import java.util.Map;
import java.util.HashMap;

public class LevelA_80 {
	public static void main(String args[]) {
		int[] nums = {2,2,1,1,1,2,2};
		int result = majorityElement(nums);
	   
		System.out.println(result);	
	}
    
	 public static int majorityElement(int[] nums) {
		 int majority=0;
		 
		 Map<Integer,Integer> maps = new HashMap<>();
		 
		 for(int i=0; i<nums.length; i++) {
			 if(!maps.containsKey(nums[i])) maps.put(nums[i],1);
			 else maps.put(nums[i], maps.get(nums[i])+1);
		 }
		 
	     for(Integer i : maps.keySet()) {
	    	 if(maps.get(i)>nums.length/2) {
	    		 majority = i;
	    		 break;
	    	 }
	     }
	     return majority;
	 }
}
