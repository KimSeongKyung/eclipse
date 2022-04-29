import java.util.ArrayList;

public class LevelA_27 {
	public static void main(String[] args) {
	  String answer;
      answer = solution("1924", 2);
      System.out.println(answer);
	
    }
	public static String solution(String number, int k) {
	    ArrayList <String> list = new ArrayList<>();
	    char[] num = number.toCharArray();
	    int max=0;
	    String answer;
	    
	    for(int i=0; i<(num.length)-1-(k-2); i++){
	    	String str;
	    	str = String.valueOf(num[i]);
	        for(int j=i+1; j<num.length; j++){
	           str += String.valueOf(num[j]);
	           list.add(str);  
	           if()
	        }
	    }
	    
	    for(int i=0; i<list.size(); i++){
	        if(max < Integer.parseInt(list.get(i)))
	            max = Integer.parseInt(list.get(i));
	    }
	    answer = String.valueOf(max);
	
	    return answer;
	}
}