import java.util.List;
import java.util.ArrayList;
//반환할 때 ArrayList<Integer> selfDiv = new ArrayList<>()로 선언한 배열도 잘 반환되네?? 왜지?

public class LevelA_4 {
	public static void main(String[] args) {
		List<Integer> selfDiv = new ArrayList<>();
		
		selfDiv = selfDividingNumbers(1,22);
		for(Integer i : selfDiv) {
			System.out.println(i);
		}
	}

	 public static List<Integer> selfDividingNumbers(int left, int right) {
	        List<Integer> selfDiv = new ArrayList<>();
	        int temp;
	        boolean isValid;
	        
	        for(int i=left; i<=right; i++){
	            isValid = true;
	            temp = i;
	            for(int j=0; j<(int)(Math.log10(i)+1); j++) {
	                if(temp%10==0) {
	                    isValid = false;
	                    break;
	                }
	                if(i%(temp%10)!=0) {
	                    isValid = false;
	                    break;
	                }
	                temp = temp/10;   
	            }
	            if(isValid) selfDiv.add(i);
	         }
	        return selfDiv;

	 }
}
