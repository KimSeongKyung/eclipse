import java.util.List;
import java.util.ArrayList;

public class LevelA_42 {
	public static void main(String args[]) {
		String s = "a#c";
		String t = "b";
		boolean result = backspaceCompare(s,t);
		System.out.println(result);
		
		
	}
	
	public static boolean backspaceCompare(String s, String t) {
        boolean isEqual = true;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        List<Character> slist = new ArrayList<>();
        List<Character> tlist = new ArrayList<>();
        
        for(int i=0; i<sArray.length; i++) {
        	if(sArray[i]=='#') {
        		if(!slist.isEmpty()) {
        			slist.remove(slist.size()-1);    //에러! 없는 인덱스의 요소를 지우라고 하는 거임
        			                                 //list의 사이즈를 이용해서 마지막 값에 접근할 수 있
        		    //System.out.println("after remove slist "+ slist);
        		}
        	}
        	else {
        		slist.add(sArray[i]);
        		//System.out.println("after add slist " + slist);
        	}
        }
        
        for(int i=0; i<tArray.length; i++) {
        	if(tArray[i]=='#') {
        		if(!tlist.isEmpty()) {
        			tlist.remove(tlist.size()-1);
        			//System.out.println("after remove tlist " + tlist);
        		}
        	}
        	else {
        		tlist.add(tArray[i]);
        		//System.out.println("after add tlist "+ tlist);
        	}
        }
        
        if(slist.size()!=tlist.size()) isEqual = false;
        else {
        	for(int i=0; i<slist.size(); i++){
        		if(slist.get(i) != tlist.get(i)) isEqual = false;
        		break;
        	}
        }
        
        return isEqual;
        
    }
 

}
