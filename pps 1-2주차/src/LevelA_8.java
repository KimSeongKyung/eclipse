/*
 * 소수점 아래 n번째 자리까지 반올림하여 나타내기
 * --> String.format("%.2f", a)
 *
 */
import java.util.Scanner;

public class LevelA_8 {
	public static void main(String[] args) {
		int[][] score;
		int caseNum;
		int[] studentNum;
		int[] sum;
		int count;
		double percentage;
		
	    Scanner sc = new Scanner(System.in);
		caseNum = sc.nextInt();
		score = new int[caseNum][];
		studentNum = new int[caseNum];
		sum = new int[caseNum];
		
		for(int i=0; i<caseNum; i++) {
			studentNum[i] = sc.nextInt();
			score[i] = new int[studentNum[i]];
			for(int j=0; j<studentNum[i]; j++) {
				score[i][j] = sc.nextInt();
				sum[i]+= score[i][j];
			}
		
		}
		
		for(int i=0; i<caseNum; i++) {
			count=0;
			for(int j=0; j<studentNum[i]; j++) {
				if(score[i][j] > sum[i]/(studentNum[i])) count++;
			}
			percentage = ((count)/(studentNum[i]*1.0))*100;
		    //에러해결!!!  - 정수랑 정수 나누면 뒤에 소수점 다 날라감. 피연산자 중 하나이상을 실수로 바꿔야함->*1.0
		    
			System.out.println(String.format("%.3f", percentage)+"%");
		}
		sc.close();
		
	}

}

