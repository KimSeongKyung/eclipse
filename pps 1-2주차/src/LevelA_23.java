
public class LevelA_23 {
	public static void main(String args[]) {
		int num = 128;
		int result = addDigits(num);
		System.out.println(result);
	}
	
	public static int addDigits(int num) {
        int[] n;
        int sum=0;
        int len = (int)(Math.log10(num)+1);
        //n = new int[len]; <--왜 여기다가 선언하면 안되는지 분명한 이유 찾기
        
        while(len>1){
            n = new int[len];
            sum =0;
            for(int i=0; i<len; i++){
                n[i]  = num % 10;
                num = num/10;
            }
            for(int i=0; i<len; i++){
                 sum += n[i];
             }
            num = sum;
            len = (int)(Math.log10(num)+1);
        }
        
        if(len==1) sum=num;
        return sum;
    }

}
