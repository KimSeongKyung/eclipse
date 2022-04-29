/*
 * answer는 문자열인데 max값을 찾을 때마다 문자열의 값을 바꿀 수 없음 그래서
 * 해당 문자를 저장하는 것이 아니라 해당 문자의 아스키코드 값을 저장해서 나중에 
 * 그 아스키코드값을 문자로 바꾸는 걸로 해결함
 * ------>??????? 내가 왜 이렇게 썼지,,,,,???
 * 
 * answer를 char형으로 하면 값을 계속 그 값을 변경할 수 있음. 문자열이면 안되겠지만.
 * 
 * 
 * <에러해결>!!!!
 * 문제조건: 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * 근데 나는 이렇게 코드짬 -> 만약 최대값이 4인데 반복문안에서 임의의 최대값이 2일때 
 * 2랑 같은게 또 나오면 break걸고 ?를 출력하게 함...ㅎㅎ
 * 
 */

import java.io.*;
import java.util.HashMap;

public class LevelA_45{
	public static void main(String args[]) throws IOException{
		char answer='?';
		HashMap<Character,Integer> maps = new HashMap<>();
		int max = 0;
		int count=0;
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		
		String newWord = word.toUpperCase();
		char[] array = newWord.toCharArray();
		
		for(int i=0; i<array.length; i++) {
			if(maps.containsKey(array[i])) maps.replace(array[i], maps.get(array[i])+1);
			else maps.put(array[i], 1);
		}
		
		for(Character c : maps.keySet()) {
			if(max < maps.get(c)) {
				count=0;         //새로운 max값 생성되며 중복 초기화  
				max = maps.get(c);
			    answer = c;
			}
			else if(max == maps.get(c)) count++;  //중복처리  
		}
		
		if(count>0) {
			answer = '?';
		}
	
		bw.write(String.valueOf(answer));
	    bw.flush();
	    bw.close();
		
	}

}




/*(else if(max == maps.get(c)) {
ans = (int)'?';
break;
}*/
