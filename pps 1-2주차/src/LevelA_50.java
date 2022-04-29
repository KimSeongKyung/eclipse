/*
 * 이건 그냥 알아두면 좋은거!
 *  Java에서 배열을 문자열로 변환하는 방법
 *  1. Arrays.toString()
 *     String str = Arrays.toString(array)
 *  2. String.join()
 *     String str = String.join(" ",array)
 *  3. Arrays.stream()
 *     String str = Arrays.stream(array).collect(Collectors.joining())
 *     
 *  새로운걸 알게됨!! 3개 다 가능
 *  
 *  Charcter.toString((char)((int)karray[i]-3)) -> 정석,,?
 *  
 *  Charcter.toString((char)(karray[i]-3))     -> karray[i]-3을 하면 int형이 나옴.
 *                                                문자-정수 = 정수 
 *  											  karray[i]를 알아서 아스키코드상 숫자로 변경
 *  
 *  Character.toString((karray[i]-3))  ->karray[i]-3은 int형인 앞에 있는 Character.toString 때문에
 *   									 char형이라고 알아서 변경한다음 문자열로 변경해줌...!
 *  
 */


import java.util.Scanner;

public class LevelA_50 {
	public static void main(String args[]) {
		String kword;
		String newWord="";
		
		Scanner sc = new Scanner(System.in);
		kword = sc.nextLine();
		char[] karray = kword.toCharArray();
		
		for(int i=0; i<karray.length; i++) {
			String s;
			if(karray[i]=='A') s = Character.toString('X');
			else if(karray[i]=='B') s = Character.toString('Y');
			else if(karray[i]=='C') s = Character.toString('Z');
			else s = Character.toString((karray[i]-3));
			newWord +=  s;
		}
		
		System.out.println(newWord);
		sc.close();
	}

}
