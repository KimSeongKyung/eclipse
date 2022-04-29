import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class LevelA_81 {
	public static void main(String args[]) throws IOException{
		int caseNum;
		Integer[][] num;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		caseNum = Integer.parseInt(br.readLine());
		num = new Integer[caseNum][10];
		
		for(int i=0; i<caseNum; i++) {
			String number = br.readLine();
			StringTokenizer st = new StringTokenizer(number);
			
			for(int j=0; j<10; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(num[i], Collections.reverseOrder());
			bw.write(Integer.toString(num[i][2])+"\n");
		}
		
		bw.flush();
		bw.close();
		
	}

}
