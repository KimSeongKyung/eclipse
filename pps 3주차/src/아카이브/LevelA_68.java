import java.io.*;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class LevelA_68 {
	public static void main(String args[]) throws IOException{
		int N,n;
		Queue<Integer> queue = new LinkedList<>();
		int last=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			StringTokenizer st = new StringTokenizer(s);
			switch(st.nextToken())
			{
			case "push": 
			    n = Integer.parseInt(st.nextToken());
				queue.add(n);
				last = n;
				break;
				
			case "pop":
				if(!queue.isEmpty()) {
					n = queue.poll();
					bw.write(Integer.toString(n)+"\n");
				}
				else bw.write(Integer.toString(-1)+"\n");
				break;
				
			case "size":
				bw.write(Integer.toString(queue.size())+"\n");
				break;
				
			case "empty":
				if(queue.isEmpty()) bw.write(Integer.toString(1)+"\n");
				else bw.write(Integer.toString(0)+"\n");
				break;
			
			case "front":
				if(!queue.isEmpty()) bw.write(Integer.toString(queue.peek())+"\n");
				else bw.write(Integer.toString(-1)+"\n");
				break;
				
			case "back":
				if(!queue.isEmpty()) bw.write(String.valueOf(last)+"\n");
				else bw.write(String.valueOf(-1)+"\n");
				break;
			}
		}
		
		bw.flush();
		bw.close();
		
	}

}
