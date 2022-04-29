/*
 * 
// public static void main(String []) {
//		Map<Integer,Integer> maps = new HashMap<>();
//	     sum=0;
//		Scanner  = new Scanner(System.in);
//		
//		for( i=0; i<8; i++) {
//			 score = sc.nextInt();
//		    maps.put(score,i+1);
//		}
//		
//	//Object[] keys = maps.keySet().toArray(); keys[i]가 Object타입이라 인와 연산 안됨
//		
//		Integer[] keys = (Integer[]) maps.keySet().toArray();
//		/// 이거 타입 케스트 안된다는 데 어캄........???
//		Arrays.sort(keys);
//		
//		for( i=0; i<5; i++) {
//			sum += keys[i];
//		}
//		
//		System.out.println(sum);
//		
//		for( i=0; i<5; i++) {
//			System.out.println(maps.get(keys[i]));
//		}
//	    sc.close();
//	}
//	


 * 
 * 
 * 
 * 
 * 
 */
//import java.util.Map;
//import java.util.HashMap;

import java.util.Scanner;
import java.util.Arrays;

public class LevelA_77 {
	public static void main(String args[]) {
		int sum=0;
		int[] nums = new int[8];
		int[] temp = new int[8];
		int[] index = new int [5];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<8; i++) {
			nums[i] = sc.nextInt();
		//	temp[i] = sc.nextInt();    이렇게하면 temp[i]에는 다음 정수가 저장됨 
		    temp[i] = nums[i];
		}
		
		Arrays.sort(temp);
		
		for(int i=3; i<8; i++) {
			sum += temp[i];
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<8; j++) {
				if(temp[3+i] == nums[j]) {
					index[i] = j+1;
					break;
				}
			}
		}
		Arrays.sort(index);
		
		System.out.println(sum);
		
		for(int i=0; i<5; i++) {
			System.out.print(index[i]+" ");
		}
		
		sc.close();
	}
}


