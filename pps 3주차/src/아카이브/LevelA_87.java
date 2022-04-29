import java.util.Arrays;
import java.util.Comparator;

public class LevelA_87 {
	public static void main(String args[]) {
		int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
		int truckSize = 10;
		int result = maximumUnits(boxTypes, truckSize);
		System.out.println(result);
		
		
	}
	
    public static int maximumUnits(int[][] boxTypes, int truckSize) {
    	int count=0;
    	int maxNum=0;
        Arrays.sort(boxTypes, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1] != o2[1])
					return o2[1] - o1[1];
				else
					return 0;
				
			}	
        });
        
        for(int i=0; i<boxTypes.length; i++) {
        	for(int j=0; j<boxTypes[i][0]; j++) {
        		maxNum += boxTypes[i][1]; 
        		count++; 
        		if(count == truckSize) break;
        	}
        	if(count == truckSize) break;
        	//여기에도 break걸어줘야함. 아니면 작은 반복문만 끝나고 큰 반복문은 안 끝나게됨
        }
        
        return maxNum;
        
    }

}
