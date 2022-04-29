import java.io.*;
import java.util.StringTokenizer;

public class LevelA_33 {
	public static void main(String[] args) throws IOException {
		int[][] score = new int[5][4];
		int[] sum = new int[5];
		int max_i=0;
		int max = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		for(int i=0; i<5; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());
				sum[i] += score[i][j];
			}
		}
		
		for(int i=0; i<5; i++) {
			if(sum[i]>max) {
				max_i = i+1; 
				max = sum[i];
			}
		}
		
		bw.write(max_i + " " + max);
		bw.flush();
		bw.close();
	}

}
