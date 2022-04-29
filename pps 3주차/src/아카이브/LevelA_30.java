import java.util.Scanner;
/*
 * 0 -> 0 
 * 0 -> 1
 * 1 -> 0
 * 1 -> 1
 */
public class LevelA_30 {
	public static void main(String[] args) {
		int day;
		int today;
		double[][] p;
		double p0=0;
		double p1=0;
		
		Scanner sc = new Scanner(System.in);
		day = sc.nextInt();
		p = new double[day][];
		
		for(int i=0; i<day; i++) {
			p[i] = new double[(int) Math.pow(2, i+1)];
		}
		
		today = sc.nextInt();
		if(today==0) {
			p[0][0] = 0.70;
			p[0][1] = 0.30;
		}
		else {
			p[0][0] = 0.50;
			p[0][1] = 0.50;
		}
		
		for(int i=1; i<day; i++) {
			for(int j=0; j<p[i].length-3; j+=4) {
				p[i][j] = p[i-1][j/2] *0.70;
			    p[i][j+1] = p[i-1][j/2] *0.30;
			    p[i][j+2] = p[i-1][j/2+1] *0.50;
			    p[i][j+3] = p[i-1][j/2+1] *0.50;
			}
		}
		
		for(int i=0; i<p[day-1].length; i++) {
			if(i%2==0) p0 += p[day-1][i];
			else  p1 += p[day-1][i];
		}
	    p0*=1000;
	    p1*=1000;
		System.out.println(Math.round(p0*10)/10);
		System.out.println(Math.round(p1*10)/10);
		sc.close();		
		
	}

}  
/* 
 *       /0
 *    / 0
    -0   \1
     
      \ 1
   1  
      / 0
    -1  
      \ 1
*/


