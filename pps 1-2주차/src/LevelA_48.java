/*
 * int -> String 방법!!
 * 1) Integer.toString()
 * 2) String.valueOf()
 * 3) String str = int + ""
 */

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class LevelA_48 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		String [] words = new String[num];
		boolean[] isValid = new boolean[num];
		int count=0;
		
		for(int i=0; i<num; i++) {
			isValid[i] = true;   //  boolean 타입 초기화 해야함..!! 자동으로 true로 초기화 안됨.
		}
		
		for(int i=0; i<num; i++) {
			words[i] = br.readLine(); 
			char[] array = words[i].toCharArray();
			List<Character> list = new ArrayList<>();
			
			for(int j=0; j<array.length; j++) {
				if(!list.contains(array[j])) list.add(array[j]);
				else {
					if(array[j-1]!=array[j]) {
						isValid[i] = false;
						break;
					}
				}
			}
		}
		
		for(int i=0; i<num; i++) {
			if(isValid[i]) count++;
		}
	
		bw.write(Integer.toString(count));
		bw.flush();
		bw.close();
		
		
	}

}
