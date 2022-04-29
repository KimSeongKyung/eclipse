import java.util.Scanner;

public class LevelA_29 {
	public static void main(String[] args) {
		int doorNum;
		int[] open;
		boolean isValid = true;
		
		Scanner sc = new Scanner(System.in);
		doorNum = sc.nextInt();  //만약 문의 개수가 int의 범위를 넘어가면 long으로 받아야하는데..
		open = new int[doorNum];
		open[0] = sc.nextInt();
		
		
		for(int i=1; i<doorNum; i++) {
			if(open[0]==0) {
				if((i+1)%2==0) open[i]=1;
				else open[i]=0;
			}
			else {
				if((i+1)%2==0) open[i]=0;
				else open[i]=1;
			}
		}
		
		for(int i=1; i<=doorNum/3; i++) {
			for(int j=1; j<i; j++) {
				if(open[3*i]!=open[j]) isValid = false;
			}
		}
		if(isValid) {
			for(int i=1; i<doorNum; i++) {
				System.out.println(open[i]);
			}
		}
		else System.out.println("Love is open door");
		sc.close();
	}

}
