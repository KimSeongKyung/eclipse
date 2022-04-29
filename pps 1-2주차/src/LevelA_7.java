/* <ArrayList와 배열 비교하는 방법>
 * 1. ArrayList : array1.equals(array2)
 * 2. 배열 : Arrays.equals(array1, array2)
 *    배열의 내용을 비교하려면, java.util.Arrays에 있는 Arrays.equals()클래스 메소드를 사용해야 함
 *  cf) 2차원 이상의 배열 비교
 *  Arrays.deepEquals(array1,array2)
 *  
 *  !!!! 내림차순 Arrays.sort(array, Collections.reverseOrder())사용하려면
 *       primitive data type이 아니라 객체의 배열을 이용해야함 -> wrapper class
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class LevelA_7 {
	public static void main(String[] args)
	{
		int result=-1;
		Scanner keyboard = new Scanner(System.in);
		int[] pitch = new int[8];
		int[] temp = new int[8];
		Integer[] temp2 = new Integer[8];
		int[] ascending = new int[8];
		int[] descending = new int[8];
		//boolean yn=true;
		
		for(int i=0; i<8; i++) {
			pitch[i] = keyboard.nextInt();
		}
		for(int i=0; i<8; i++) {
			temp[i] = pitch[i];
			temp2[i] = pitch[i];
		}
		Arrays.sort(temp);
		for(int i=0; i<8; i++) {
			ascending[i] = temp[i];
		}
		Arrays.sort(temp2, Collections.reverseOrder());
		for(int i=0; i<8; i++) {
			descending[i] = temp2[i];
		}
		
		for(int i=0; i<8; i++) {
			if(Arrays.equals(pitch, ascending)) result=0;
			else if(Arrays.equals(pitch, descending)) result=1;
			else result=3;
		}
		
		/* 더 간단한 방법!
		 * for(int i=0; i<7; i++) {
			if(pitch[i]>pitch[i+1]) yn=false;
		}
		if(yn) result=0;
		
		yn=true;
		for(int i=0; i<7; i++) {
			if(pitch[i]<pitch[i+1]) yn=false;
		}
		if(yn) result=1;
		if(result!=0 && yn==false) result=3;
		
		*/
		if(result==0) System.out.println("ascending");
		else if(result==1) System.out.println("descending");
		else System.out.println("mixed");
		keyboard.close();
	}

}
