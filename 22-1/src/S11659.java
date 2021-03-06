import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class S11659 {
	public static void main(String args[]) throws IOException{
		
		int N,M;
		int sum;
		int i,j;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		int[] nums = new int[N];
		
		String s = br.readLine();
		StringTokenizer stn = new StringTokenizer(s);
		
		for(int k=0; k<N; k++) {
			nums[k] = Integer.parseInt(stn.nextToken());
		}
		
		for(int k=0; k<M; k++) {
			sum = 0;
			String index = br.readLine();
			StringTokenizer stIndex = new StringTokenizer(index);
			i = Integer.parseInt(stIndex.nextToken());
			j = Integer.parseInt(stIndex.nextToken());
			
			for(int l=i; l<=j; l++) {
				sum += nums[l-1];
			}
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	
		
	}

}
