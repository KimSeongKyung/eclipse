/*
 * 헷갈렸던 거 정리!
 * -> 문자열 str길이 -> str.length()
 * -> 배열 str길이 -> str.length
 * 
 * 문자열을 모두 대문자로 바꿔준 것을 새로운 문자열에 할당을 해야함!!
 * 
 */
public class LevelA_40 {
	public static void main(String args[]) {
		String s = "textbook";
		boolean result = halvesAreAlike(s);
		System.out.println(result);
	}
	
	
	public static boolean halvesAreAlike(String s) {
        String str = s.toUpperCase();
        boolean isAlike=true;
        
        int aCount=0;
        int bCount=0;
        String a = str.substring(0,str.length()/2);
        String b = str.substring(str.length()/2);
        
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        
        for(int i=0; i<aArray.length; i++){
        	System.out.println("aArray["+i+"]: "+aArray[i]);
            if(aArray[i]=='A'|| aArray[i]=='E' ||aArray[i]=='I'||aArray[i]=='O'
              ||aArray[i]=='U') aCount++;
            
            System.out.println("bArray["+i+"]: "+bArray[i]);
            if(bArray[i]=='A'|| bArray[i]=='E' ||bArray[i]=='I'||bArray[i]=='O'
              ||bArray[i]=='U') bCount++;
        }
        
        if(aCount!=bCount) isAlike = false;
        return isAlike;
    }

}
