/*
import java.io.*;

public class LevelA_34 {
	public static void main(String args[]) throws IOException{
		int[] remainder = new int[10];
		int[] count = new int[42]; //0~41
		int result=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    for(int i=0; i<10; i++) {
	    	remainder[i] = (Integer.parseInt(br.readLine()))%42;
	    	//System.out.println("remainder["+i+"]: " + remainder[i]);
	        count[remainder[i]] ++;
	    }
	    
	    for(int i=0; i<42; i++) {
	    //	System.out.println(count[i]);
	    	if(count[i]>1) result+=count[i]-1;
	    }
	    bw.write(10-result);
	    bw.flush();
	    bw.close();
	}
}
*/

import java.util.Scanner;

public class LevelA_34{
	public static void main(String args[]) {
		int[] remainder = new int[10];
		int[] count = new int[42]; //0~41
		int result=0;
		Scanner sc = new Scanner(System.in);
		
	    for(int i=0; i<10; i++) {
	    	remainder[i] = (sc.nextInt())%42;
	    	//System.out.println("remainder["+i+"]: " + remainder[i]);
	        count[remainder[i]] ++;
	    }
	    
	    for(int i=0; i<42; i++) {
	    //	System.out.println(count[i]);
	    	if(count[i]>1) result+=count[i]-1;
	    }
	    System.out.println(10-result);
	    sc.close();
	}
}
