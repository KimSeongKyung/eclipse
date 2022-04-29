
public class LevelB_07 {
	public static void main(String args[]) {
		int[] nums = {-1,0,3,5,9,12};
		int target =-1
				;
		int result = search(nums, target);
		System.out.println(result);
		
		
	}
	
	 public static int search(int[] nums, int target) {
		    int index = -1;
	        int lo = 0, hi = nums.length-1;
	        int mi;
	        while(lo <= hi) {
	        	mi = (lo+hi)/2;
	        	//if(lo == hi && nums[mi] != target) return index;
	        	if(nums[mi] == target) {
	        		return mi;
	        	}
	        	else if(nums[mi] > target) hi = mi-1;
	        	else if(nums[mi] < target) lo = mi+1;
	   
	        }
	        return index;
	        
	 }
	 
	 

}


/*private static int binarySearch(int[] nums, int target, int lo, int hi) {
	 int mi = (lo+hi)/2;
	 if(lo == hi && nums[mi] != target) return -1;
	 if(nums[mi] == target) return mi;
	 else if(nums[mi] > target)
		 return binarySearch(nums, target, lo, mi-1);
	 else return binarySearch(nums, target, mi+1, hi);
}*/