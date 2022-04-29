import java.util.Scanner;
import java.util.HashMap;

public class LevelA_51 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
	    char[] array = word.toCharArray();
	    HashMap<Character, Integer> maps = new HashMap<>();
	    int count=-1;
	    int[] number = new int[array.length];
	    int time=0;
	    
 		for(int i=2; i<10; i++) {
 			if(i!=7 && i!=9) {
 				for(int j=0; j<3; j++) {
 					maps.put((char)((65+(++count))), i);
 				}
 			}
 			else {
 				for(int k=0; k<4; k++) {
 					maps.put((char)((65+(++count))), i);
 				}
 			}
 			
 		}
 		
 		for(int i=0; i<array.length; i++) {
 			number[i] = maps.get(array[i]); //!!!!주의!! 여기서 Integer 객체->내용물(int) 변환하기 위해
 											//자동으로 Integer클래스 안에 있는 intValue()가 사용됨.!!
 		}
 		
 		for(int i=0; i<number.length; i++) {
 			time += 1+number[i];
 		}
 		
 		System.out.println(time);
 		sc.close();
	}

}
