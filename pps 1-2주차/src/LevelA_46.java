/*
 * 문자열변수 += 해서 문자열에 문자열을 더하고 싶다면 무조건 그 문자열 변수를 처음에 ""로 초기화해야 
 * 아니면 에러
 * 
 * 질문) 아니 왜 sc.nextLine().charAt(0)하면 에러뜸?????
 */


import java.util.Scanner;

public class LevelA_46 {
	public static void main(String args[]) {
		int num;
		int [] alpa = new int[26];
	    String possible="";
	    int count=0;
	    
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=0; i<num; i++) {
			char firstName = sc.next().charAt(0);
			alpa[(int)firstName-97]++;
		}
		
		for(int i=0; i<alpa.length; i++) {
			if(alpa[i] >= 5) {
				possible += Character.toString((char)i+97);
				count++;
			}
		}
		if(count==0) possible+="PREDAJA";
		System.out.println(possible);
		
		sc.close();
	}

}
