/*
 * <배열 출력하는 방법>
 * System.out.println(배열이름) 으로 하면 배열의 데이터가 저장된 메모리 주소가 나옴
 * 이게 아니라!
 * 배열을 문자열로 바꿔서 출력하면 예쁘게 나옴 -> Arrays.toString
 * System.out.println(Arrays.toString(배열이름))
 * 
 */


import java.util.Arrays;

public class LevelA_56 {
	public static void main(String args[]) {
		int[] nums1 = {2,4};
		int[] nums2 = {1,2,3,4};
		int[] result = nextGreaterElement(nums1, nums2);
		//System.out.println(result);
	    System.out.println(Arrays.toString(result));
	}
	
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
	    int[] result = new int[nums1.length];
	    
	    for(int i=0; i<nums1.length; i++) {
	    	int gNum=-1;
	    	for(int j=0; j<nums2.length; j++) {
	    		if(nums1[i]==nums2[j]) {  
	    			
	    			for(int k=j+1; k<nums2.length; k++) {  
	    				if(nums2[j]<nums2[k]) {  
	    					gNum = nums2[k];
	    					break;
	    				}
	    			}
	    			break;
	    		}
	    	}
	    	result[i] = gNum;
	    }
	    
	    return result;
	}

}
