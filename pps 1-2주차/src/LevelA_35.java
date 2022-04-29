/*
 * 에러해결!!
 * -> 자바에서는 다른 언어와 다르게 ==로 문자열이 같은지 확인하지 않는다. 
 *    ==는 객체가 같은지를 비교하지만 객체가 갖고 있는 문자열을 비교하지는 않음
 *    방법1) str1.equals(str2) || 방법2) str1.compareTo(str2)
 */

import java.io.*;
import java.util.StringTokenizer;


public class LevelA_35 {
	public static void main(String args[]) throws IOException {
		int caseNum;
		double num;
		String operator;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		caseNum = Integer.parseInt(br.readLine());
		
		for(int i=0; i<caseNum; i++) {
			st = new StringTokenizer(br.readLine());
			num = Double.parseDouble(st.nextToken());
			
			while(st.hasMoreTokens()) {
				operator = st.nextToken();
				if(operator.equals("@")) { 
					num *=3;
				}
				else if(operator.equals("%")) {
					num+=5;
				}
				else {
					num-=7;
				}
			}
			bw.write(String.format("%.2f",num));
			bw.write("\n");
		}
		bw.flush();
		bw.close();		
	}

}
