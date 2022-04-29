import java.util.*;

public class LevelA_86 {
	public static void main(String args[]) {
		int n,m;
		int num;
		
		Map<String, Integer> maps = new HashMap<>();
		String[] engs = {"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		int[] values = new int[m-n+1];
		
		for(int i=0; i<m-n+1; i++) {
			num = n+i;
			String eng="";
			if(num<10) {
				eng += engs[num];
			}
			else {
				eng += engs[num/10] + " " + engs[num%10];
			}
			maps.put(eng, num);
		}
	
	    Object[] keys = maps.keySet().toArray();
	    
	    Arrays.sort(keys);
	    
	    int i=0;
	    for(Object s: keys) {
	    	 values[i] = maps.get(s);
	    	 i++;
	    }
	    
	    for(int j=0; j<values.length/10; j++) {
	    	for(int k=0; k<10; k++) {
	    		System.out.print(values[10*j+k] +" ");
	    	}
	    	System.out.println();
	    }
	    
	    for(int j=(10*(values.length/10)); j<values.length; j++) {
	    	System.out.print(values[j]+" ");
	    }
	    sc.close();
	}

}







/* for(Object s : keys) {
	    	System.out.println(s);
	    }*/
/*for(String s : maps.keySet()) {
	System.out.print(maps.get(s)+ " ");
}*/
 