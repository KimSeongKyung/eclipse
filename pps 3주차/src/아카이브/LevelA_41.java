import java.util.StringTokenizer;

public class LevelA_41 {
	public static void main(String args[]) {
		String s = "3people   Unfollowed Me";
	    String jadenCase = solution(s);
	    System.out.println(jadenCase);
	}
	
	public static String solution(String s) {
        String answer="";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreElements()) {
        	String str = st.nextToken();
        	
        }
        
        return answer;
    }

}

/* 공백이 여러개인 경우 split으로 하면 공백만 가지는 문자열도 배열에 저장되고 그거에 대한
 * 예외 처리를 해야함 
 */

/* public static String solution(String s) {
        String answer="";
        String[] str = s.split(" ");
        //String[] newStr = new String[str.length]; //배열 초기화할 때 크기 지정해야 함.
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0; i<str.length; i++) {
        	System.out.println("str["+i+"]: "+ str[i]);
        }
        for(int i=0; i<str.length; i++) {
        	String first = str[i].substring(0,1);
        	String rest = str[i].substring(1);
        	String newFirst = first.toUpperCase();
        	String newRest = rest.toLowerCase();
        	
        	sb.append(newFirst);
        	sb.append(newRest+" ");
        	
        }
        answer = sb.substring(0,sb.length()-1);
        
        return answer;
    }

*/