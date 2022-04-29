import java.util.Arrays;

public class LevelA_79 {
	public static void main(String args[]) {
		
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		int[] answer = solution(array, commands);
		
		System.out.println(Arrays.toString(answer));
		
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i,j,k;
        
        for(int index=0; index<commands.length; index++) {
        	i = commands[index][0]; //2
        	j = commands[index][1];
        	k = commands[index][2];
        	
        	int[] newArray = new int[j-i+1];
        	
        	for(int l=0; l<newArray.length; l++) {
        		newArray[l] = array[i-1+l];
        	}
        	
        	Arrays.sort(newArray);	
        	answer[index] = newArray[k-1];
        }
        return answer;
    }

}
