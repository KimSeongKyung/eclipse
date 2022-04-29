
public class LevelA_6 {
	public static void main(String args[]) {
		String s = "pPoooyY";
		boolean result = solution(s);
		System.out.println(result);
	}
	
	public static boolean solution(String s) {
        boolean answer = true;
        int pCount=0;
        int yCount=0;
        String str = s.toUpperCase();
        char[] array = str.toCharArray();
        for(int i=0; i<array.length; i++){
            if(array[i]=='P') pCount++;
            if(array[i]=='Y') yCount++;
        }
        if(pCount!=yCount) answer=false;
        //System.out.println(answer);
        
        return answer;
    }

}
