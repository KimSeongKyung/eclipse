import java.io.*;
import java.io.IOException;
import java.util.StringTokenizer;

public class S15649 {
	public static boolean[] visited;
	public static int[] nums;
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String args[]) throws IOException {
		
		int N,M;
	
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
	    N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		visited = new boolean[N];
		nums = new int[M];
		
	    for(int i=0; i<N; i++) {
	    	visited[i] = false;
	    }
	
		sequence(N, M, 0);
		
		bw.flush();
		bw.close();
		
	}
	
	public static void sequence(int N, int M, int depth) throws IOException {
		
		if(depth == M) {
			for(int i=0; i<M; i++) {
				bw.write(nums[i] + " ");
			}
			bw.write("\n");
			return;
		}
		
		for(int i=0; i<N; i++) {
			
			if(visited[i] == false) {
				visited[i] = true;
				nums[depth] = i+1;
				sequence(N,M,depth+1);
				
				
				visited[i] = false;
			}
			
		}

	}

}
