import java.io.*;

public class LevelA_85 {
	public static void main(String args[]) throws IOException {
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		String[] serialNums = new String[n];
	
	    for(int i=0; i<n; i++) {
	    	serialNums[i] = br.readLine();
	    }
	    
	    String[] sortedNums = stringArraySort(serialNums);
	    
		for(String s : sortedNums) {
			bw.write(s+"\n");
		}
		bw.flush();
		bw.close();
	}
	
     public static String[] stringArraySort(String[] nums) {
    	 
    	 for(int i=0; i<nums.length-1; i++) {
    		 for(int j=i+1; j<nums.length; j++) {
    			 if(compareStrings(nums[i],nums[j]) > 0) {
    				 String temp = nums[i];
    				 nums[i] = nums[j];
    				 nums[j] = temp;
    			 }
    		 }
    	 }
    	 return nums;
     }
     
     public static int compareStrings(String str1, String str2) {
    	 
    	 if(str1.length() != str2.length()) return str1.length()-str2.length();
    	 else {
    		 int sum1=0, sum2=0;
    		 
    		 for(int i=0; i<str1.length(); i++) {
    			 if(str1.charAt(i)>='0' && str1.charAt(i)<='9')
    				 sum1 += str1.charAt(i)-48;    //에러해결!!  - str1.charAt(i)는 문자이므로 아스키코드 숫자-48을 한 정수를 sum에 더해야함.
    			 if(str2.charAt(i)>='0' && str2.charAt(i)<='9') 
    				 sum2 += str2.charAt(i)-48;
    		 }
    		 if(sum1 != sum2) {
    			 return sum1 - sum2;
    		 }
    		 else {
    			 for(int i=0; i<str1.length(); i++) {
    				 if((int)str1.charAt(i) != (int)str2.charAt(i))
    					 return (int)str1.charAt(i) - (int)str2.charAt(i);
    			 }
    			 return 0;
    		 }
    	 }
    	 
     }

}
