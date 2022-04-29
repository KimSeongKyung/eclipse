/*2월 29일은 그레고리력으로 윤년의 60번째 날이다.
  이 날은 윤년에만 존재하는데, 윤년은 보통 서기의 해가 4의 배수인 해에 해당된다. 그러나 400의 배수인 경우를 제외하면 100의 배수인 해에는 이 날이 없다. 
*/

import java.util.Scanner;

public class LevelA_72 {
	public static void main(String args[]) {
		String date;
		int result;
		
		Scanner sc = new Scanner(System.in);
		date = sc.nextLine();
		result = dayOfYear(date);
		System.out.println(result);
		sc.close();
	}
	
	
	public static int dayOfYear(String date) {
        String[] str = date.split("-");
        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        int result=0;
        
        for(int i=0; i<month-1; i++) {
        	result += days[i];
        }
        
        result +=day;
        if(month>2 && year%4==0 && ((year%100!=0) || (year%400==0))) result++;
        return result;
        
    }

}
