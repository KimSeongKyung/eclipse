
public class LevelA_44 {
	public static void main(String args[]) {
		String s = "PPALLL";
		boolean isPass = checkRecord(s);
		System.out.println(isPass);
		
	}
	
	
	
	 public static boolean checkRecord(String s) {
		 boolean isPass = true;
		 char[] record = s.toCharArray();
		 int aCount =0;
		 
		 for(int i=0; i<record.length; i++) {
			 if(record[i]=='A') aCount++;
			 else if(record[i]=='L' && i<record.length-2) {
				 if(record[i+1]=='L' && record[i+2]=='L') {
					 isPass = false;
					 break;
				 }
			 }
		 }
		 if(aCount>=2) isPass = false;
		 return isPass;
	        
	    }

}
