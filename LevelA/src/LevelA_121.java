import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class LevelA_121 {
	static List<Integer> list = new ArrayList<>(); //다른 함수에서 변경된 list를 알기위해 전역변수로 설
    static List<Integer> temp = new ArrayList<>();
	public static void main(String args[]) {
		int[] nums = {1,2,2,1,2,1,1,1,1,2,2,2};
		int result = findShortestSubArray(nums);
		System.out.println(result);
		
	}
	
	public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        
        int degree=0;
        int start_i1= 0;
        int end_i1 = nums.length-1;
        int start_i2= 0;
        int end_i2 = nums.length-1;
        int minLen;
        
        for(int i=0; i<nums.length; i++) {
        	if(!maps.containsKey(nums[i])) maps.put(nums[i], 1);
        	else maps.put(nums[i], maps.get(nums[i])+1);
        }
        
        for(Integer i : maps.keySet()) {
        	if(degree < maps.get(i)) {
        		list.clear();
        		list.add(i);
        		degree = maps.get(i);
        	}
        	else if(degree == maps.get(i)) list.add(i);
        }
        
        System.out.println("list: " + list);
       Integer[] numbers = list.toArray(new Integer[list.size()]);
       temp= Arrays.asList(numbers);
      // temp = list; // 이렇게하면 같은 list내용을 temp에 할당하는게 아니라 메모리를 공유함..
   
       start_i1 = findStartIndex(nums,list);
       end_i1 = findEndIndex(nums,list);
       
       end_i2 = findEndIndex(nums,temp);
       start_i2 = findStartIndex(nums,temp);

       System.out.println("list: " + list);
       
       System.out.println("temp: " + temp);
       
       System.out.println("end_i1: " + end_i1);
       
       System.out.println("end_i2: " + end_i2);
       
       if(end_i1 - start_i1 > end_i2 - start_i2) minLen = end_i2 - start_i2+1;
       else minLen =  end_i1 - start_i1+1;
       return minLen;
  
        
    }
	
	public static int findStartIndex(int[] nums, List list) {
		int start_i=0;
		
		for(int i=0; i<nums.length/2; i++) {
        	if(list.contains(nums[i])) {
        		if(list.size()>1) {
        			list.remove(list.indexOf(nums[i]));
        			start_i ++;
        		}
        		else break;
        	}
        	else start_i ++;
        }
		
		return start_i;
		
	}
	
	
	public static int findEndIndex(int[] nums, List list) {
		int end_i = nums.length-1;
		
		for(int i=nums.length-1; i>=nums.length/2; i--) {
        	if(list.contains(nums[i])) {
        		if(list.size()>1) {
        			list.remove(list.indexOf(nums[i]));
        			end_i--;
        		}
        		else break;
        	}
        	else end_i--;
        }
        return end_i;	
	}

}
