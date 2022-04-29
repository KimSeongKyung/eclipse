import java.io.*;
//import java.io.FileInputStream;
import java.util.List;
import java.util.ArrayList;


public class LevelA_76_2 {
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T;
		T = Integer.parseInt(br.readLine());
		

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = Integer.parseInt(br.readLine());
			List<String> list = new ArrayList<>();
			
			for(int i=0; i<N; i++) {
				String name = br.readLine();
				if(!list.contains(name)) list.add(name);
			}
			//근데 String[0]의 값을 바꿀 수 있나..?
			
			for(int i=0; i<list.size()-1; i++) {
				for(int j=i+1; j<list.size(); j++) {
					if(compareStrings(list.get(i), list.get(j)) > 0) {
						String temp = list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}			
				}
			}
		   bw.write("#"+test_case+"\n");
		    
			for(String s : list) {
				bw.write(s+"\n");
			}
			//sc.nextLine();
		}
		bw.flush();
		bw.close();
	    
	}
	
	public static int compareStrings(String s1, String s2) {
		if(s1.length() != s2.length())
			return s1.length() - s2.length();
		else {
			for(int i=0; i<s1.length(); i++) {
				if((int)s1.charAt(i) != (int)s2.charAt(i))
					return (int)s1.charAt(i) - (int)s2.charAt(i);
			}
			return 0;  //근데 이건 일어날 일이 없음. 같은 문자가 없으니깐 그냥 
			           // 리턴안한다고 에러뜨길래;;;
		}
	}

}

