
public class LevelA_24 {
	public static void main(String args[]) {
		int[] bills  = {5,5,5,10,20};
		boolean result = lemonadeChange(bills);
		System.out.println(result);
	}
	
	public static boolean lemonadeChange(int[] bills) {
        int[] change = new int[3];
        boolean result = true;
        
        for(int i=0; i<bills.length; i++) {
            if(bills[i]==5) change[0]++;
            else if(bills[i]==10){
                change[1]++;
                if(change[0]>0) change[0]--;
                else {
                    result= false;
                    break;
                }
            }
            else{
                change[2]++; //15줘야함 -> 10+5 || 5+5+5
                if(change[1]>0 && change[0]>0){
                    change[1]--;
                    change[0]--;
                }
                else if(change[0]>2) change[0] -=3;
                else {
                    result=false;
                    break;
                }
            }
        }
        return result;
        
    }

}
