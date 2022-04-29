import java.util.HashMap;
import java.util.Map;
//왜 entrySet()활용했을 때는 안됨??
public class LevelA_13 {
	public static void main(String args[]) {
		int[] nums = {2,2,1};
		System.out.println(singleNumber(nums));
	}

	
	
	 public static int singleNumber(int[] nums) {
	        int number=0;
	        HashMap<Integer,Integer> maps = new HashMap<>();
	        
	        for(int i=0; i<nums.length; i++){
	            if(maps.containsKey(nums[i])) maps.put(nums[i], 2);
	            else maps.put(nums[i],1);
	        }
	       /* for(int i=0; i<nums.length; i++){
	            if(maps.get(nums[i])==1) {
	                number=nums[i];
	                break;
	            }
	      }*/
	        /*for(Entry<Integer,Integer> entry : maps.entrySet()){
	            if(entry.getValue()==1){
	                number = entry.getKey();
	                break;
	            }
	        }*/
	        for(Integer i : maps.keySet()){
	            if(maps.get(i)==1){
	                number = i;
	                break;
	            }
	        }
	        return number;
	    }
}
