import java.util.Arrays;

public class LevelA_93 {
	public static void main(String args[]) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m=3;
		int n=3;
		merge(nums1, m, nums2, n);  // nums1이 변경됨..
		System.out.println(Arrays.toString(nums1));
	}
    
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	     int[] array = new int[m+n];
	    
	     for(int i=0; i<m; i++) {
	    	 array[i] = nums1[i];
	     }
	     
	     for(int i=0; i<n; i++) {
	    	 array[m+i]  = nums2[i];
	     }
	     
	     Arrays.sort(array);
	     
	     for(int i=0; i<array.length; i++) {
	    	 nums1[i] = array[i];
	     }
	     
	 }
}
