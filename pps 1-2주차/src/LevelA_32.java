/*
 *  (1,3) -> (0,1) + (0,2) + (0,3) 
 *  
 *  (2,3) -> (1,1) + (1,2) + (1,3)
 *        -> (0,1) + (0,1)+(0,2) + (0,1)+(0,2)+(0,3)
 *        
 */
import java.util.Scanner;

public class LevelA_32 {
	public static void main(String[] args) {
		int caseNum;
		int floor;
		int num;
		int peopleNum;
		Scanner sc = new Scanner(System.in);
		caseNum = sc.nextInt();
		
		for(int i=0; i<caseNum; i++) {
			floor = sc.nextInt();
			num = sc.nextInt();
			peopleNum = getPeopleNum(floor, num);
			System.out.println(peopleNum);
		}
		
		sc.close();
	}
	
	public static int getPeopleNum(int floor, int num)
	{
		int result=0;
		if(floor==0) {
			return num;
		}
		for(int i=1; i<=num; i++) {
			result += getPeopleNum(floor-1, i);
		}
		return result;
	}

}
