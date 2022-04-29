import java.io.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Comparator;

public class LevelA_82 {
	public static void main(String args[]) throws IOException{
		int N;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		String[][] members  = new String[N][2];
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str);
			members[i][0] = st.nextToken();
			members[i][1] = st.nextToken();
		}
		
		Arrays.sort(members, new Comparator<String[]>() {
			
			@Override
			public int compare(String[] o1,String[] o2) {
				if(Integer.parseInt(o1[0]) != Integer.parseInt(o2[0]))
					return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
				else return 0;
				
			}
		});
		
		for(int i=0; i<N; i++) {
			bw.write(members[i][0] + " "  +members[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		
		
	}
	
	

}
