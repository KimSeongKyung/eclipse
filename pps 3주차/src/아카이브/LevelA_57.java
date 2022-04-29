
public class LevelA_57 {
	public static void main(String args[]) {
		int[] cookie = {1,1,2,3};
		int result = solution(cookie);
		System.out.println(result);
		
	}
	
	public static int solution(int[] cookie) {
        int answer = 0;
        int count1;
        int count2;
        
        for(int i=0; i<cookie.length-1; i++) { //시작 인덱스 반복
        	for(int m=i; m<cookie.length-1; m++) { //중간 인덱스 정하기 
        		count1=0;
        		count2=0;
        		
        	    for(int j=i; j<=m; j++) {
        	    	count1 += cookie[j];
            	}
        	    for(int j=m+1; j<cookie.length; j++) {
        	    	count2 += cookie[j];
        	    }
        	    //에러발견!!  첫째 아들이 i~m까지일때 둘째 아들이 무조건 m+1부터 시작한다는 보장이 없음.
        	    //근데 넌 무조건 m+1부터 시작한다는 전제 하에 코드짬.
        	    System.out.println("첫번째 인덱스: "+ i + "두번째 인덱스: " +(m+1));
        	    System.out.println("count1: " +count1 + "count2: " + count2);
       	    
        	    if(count1 == count2) {
        	    	if(answer < count1) {
        	    		answer = count1;

                	    System.out.println("answer: " + answer);
        	    	}
        	     }
        	}
        		
        }
        
        return answer;
	}

}
