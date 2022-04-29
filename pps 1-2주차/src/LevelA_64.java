import java.util.Arrays;

public class LevelA_64 {
	public static void main(String args[]) {
		int[] heights = {5,1,2,3,4};
		int result = heightChecker(heights);
		System.out.println(result);
		
	}
	
    public static int heightChecker(int[] heights) {
        int[] current = new int[heights.length];
        int count=0;
        
        for(int i=0; i<current.length; i++) {
        	current[i] = heights[i];
        }
        
        Arrays.sort(heights);
        
        for(int i=0; i<heights.length; i++) {
        	if(current[i]!=heights[i]) count++;
        }
        
        return count;
    }

}
