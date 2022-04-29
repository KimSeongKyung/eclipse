import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LevelA_65 {
	public static void main(String args[]) {
		int N;
		int[][] points;
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
	    points = new int[N][2];
	    
	    for(int i=0; i<N; i++) {
	    	points[i][0] = sc.nextInt();
	    	points[i][1] = sc.nextInt();
	    }
	    
	    Arrays.sort(points, new Comparator<int[]>() {
	    	
	    	@Override
	    	public int compare(int[] o1, int[] o2) {
	    		if(o1[0] != o2[0]) return o1[0] - o2[0];
	    		else return o1[1] - o2[1];
	    	}
	    });
	    
	    for(int i=0; i<N; i++) {
	    	System.out.println(points[i][0] + " " + points[i][1]);
	    }
	    
	    sc.close();
	    
	}

}
