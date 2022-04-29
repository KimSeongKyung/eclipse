import java.util.Arrays;

public class LevelA_78 {
	public static void main(String args[]) {
		int[] citations = {3,0,6,1,5};
		int result  = solution(citations);
		System.out.println(result);
		
		
	}
	
	
	
	 public static  int solution(int[] citations) {
        int answer;
        int max_h=0;
        
        Arrays.sort(citations);
        //0 1 3 5 6 
        System.out.println(Arrays.toString(citations));

        for(int i=0; i<citations.length; i++) {
        	for(int j=0; j<citations.length; j++) {
        		if(i <= citations[j]) {
        			if(i <= citations.length-j && j <= i) {
        				if(max_h < i) max_h = i;
        			}
        		}
        	}
        }
        
        answer = max_h;
        return answer;
	 }

}


//for(int i=0; i<citations.length; i++) {
//if(citations.length-i >= citations[i] && i <= citations[i]) {
//	System.out.println("1 pass: " + citations[i]);
//	if(max_h < citations[i]) {
//		max_h = citations[i];
//		System.out.println("2 pass max_h: " + max_h);
//	}
//}
//}
