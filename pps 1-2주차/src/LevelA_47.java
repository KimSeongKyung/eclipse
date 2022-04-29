import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class LevelA_47 {
	public static void main(String args[])throws IOException {
		List<String> list = new ArrayList<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String word = br.readLine();
		
		for(int i=0; i<word.length()/10; i++) {
			String s = word.substring(i*10, (i+1)*10);
			list.add(s);
		}
		if(word.length()%10!=0) {
			String s = word.substring((word.length()/10)*10);
			list.add(s);
		}
		
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i)+"\n");
		}
		bw.flush();
		bw.close();
	}

}
