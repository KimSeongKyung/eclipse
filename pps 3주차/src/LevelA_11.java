import java.util.Arrays;
import java.util.Collections;

public class LevelA_11 {
	public static void main(String args[]) {
		int N = 4;
		int[] stages = {4,4,4,4,4};
		int[] result = solution(N, stages);
		System.out.println(Arrays.toString(result));
		
		
	}
	
	public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] count = new int[N];
        Double[] fail = new Double[N];
        Double[] temp = new Double[N];
        int player = stages.length;
        int prev=0;
        
        for(int i=0; i<N; i++){
            for(int j=0; j<player; j++){
                //System.out.println("stages["+j+"]: "+ stages[j]);
                if(i+1==stages[j]) count[i]++;
            }
            
            //System.out.println("count["+i+"]: "+count[i]);
            
            if(i==0) fail[i] = (count[i]*1.0)/(player*1.0);
            else {
                prev +=count[i-1];
                fail[i] =(count[i]*1.0)/((player-prev)*1.0); 
            }
            
           // System.out.println("fail["+i+"]: "+fail[i]+"\n");
        }
        
        for(int i=0; i<N; i++){
            temp[i] = fail[i];
        }
        
        Arrays.sort(temp, Collections.reverseOrder());
        
        for(int i=0; i<N; i++){
           // System.out.println("temp["+i+"]: "+temp[i]);
            
            for(int j=0; j<N; j++){
                if(temp[i]==fail[j]){
                    answer[i] = j+1;
                    break;
                }
            }
        }
    
        return answer;
    }

}
