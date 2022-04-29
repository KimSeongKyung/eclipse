
public class LevelB_08 {
	public static void main(String args[]) {
		int[] nums = {1,3,5,6};
		int target = 7;
		int result = searchInsert(nums, target);
		System.out.println(result);
		
		
	}
	
	
	 public static int searchInsert(int[] nums, int target) {
	     int lo = 0, hi = nums.length-1;
	     int mi=0;
	     
	     while(lo <= hi) {
	    	 mi = (lo+hi)/2;
	    	 if(nums[mi] == target) return mi;
	    	 else if(nums[mi] > target) hi = mi-1;
	    	 else lo = mi+1;
	    	 
	     }
	      
	     if(nums[mi] < target) return mi+1;
	     else return mi;
	     
	     //  마지막까지 못찾으면 target이 마지막 nums[mi]보다 작거나 크다.
	    // 그러므로 작거나 큰 경우를 나누어서 mi 자리에 target을 넣을건지 , 아님 mi 다음 인덱스에 
	     // 넣을 건지를 판단해야 한다.
	 }

	
}
