
public class LevelA_62 {
	public static void main(String args[]) {
		int a = 5;
		int b = 24;
		String result = solution(a,b);
		System.out.println(result);
		
	}
	
    public static String solution(int a, int b) {
        String answer;
        String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        int[] dayCount = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<a-1; i++) {
        	b += dayCount[i];
        }
        
        answer = day[b%7];
        return answer;
        
    }

}
