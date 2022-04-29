
public class LevelA_9 {
	public static void main(String args[]) {
		String s = "a234";
		boolean result = solution(s);
		System.out.println(result);
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        char[] str = s.toCharArray();
        if(!(str.length==4 || str.length==6)) answer= false;
        else{
            for(int i=0; i<str.length; i++){
            if(!(str[i]>='0' && str[i]<='9')) answer=false;
            }
        }
        return answer;
    }

}
