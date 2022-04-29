
public class LevelA_26 {
	public static void main(String args[]) {
		int x = 10;
		boolean result = solution(x);
		System.out.println(result);
	}
	
	public static boolean solution(int x) {
        boolean answer = true;
        int len = (int)(Math.log10(x)+1);
        int[] num = new int[len];
        int sum=0;
        int temp =x;
        
        for(int i=0; i<len; i++){
            num[i] = temp%10;
            temp = temp/10;
        }
        for(int i=0; i<len; i++) {
            sum += num[i];
        }
        if(x%sum!=0) answer=false;
        return answer;
    }

}
