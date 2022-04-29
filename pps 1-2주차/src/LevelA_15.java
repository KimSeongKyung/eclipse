import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class LevelA_15 {
	public static void main(String[] args) throws IOException {
		int[] num = new int[5];
		int lastNum = 0;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		
		
		for(int i=0; i<5; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<5; i++) {
			lastNum += Math.pow(num[i], 2);
		}
	    lastNum %=10;
	    
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(String.valueOf(lastNum)); /*BufferedWriter는 문자열 밖에 출력못함. 따라서
		bw.write()안에 정수를 넣는다면 아스키코드 값으로 인식해 그에 해당하는 문자를 출력함. */
		bw.flush();
		bw.close();
		
	}	

}
