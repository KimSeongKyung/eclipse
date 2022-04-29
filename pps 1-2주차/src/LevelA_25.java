
public class LevelA_25 {
	public static void main(String args[]) {
		int n =16;
		boolean result = isPowerOfFour(n);
		System.out.println(result);
		
	}
	
	public static boolean isPowerOfFour(int n) {
        boolean isPower = true;
        
        if(n<=0) isPower = false;
        else{
            while(n!=1){
            if(n%4!=0) {
                isPower= false;
                break;
                }
            n = n/4;
            }
        }   
        return isPower;
        
    }

}
