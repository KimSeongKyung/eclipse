import java.io.*;

public class LevelA_52 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int caseNum = Integer.parseInt(br.readLine());
        String [] ox = new String[caseNum];
        int oCount=0;
        int score=0;
        
        for(int i=0; i<caseNum; i++) {
        	ox[i] = br.readLine();
            char[] answers = ox[i].toCharArray();
            oCount=0;
            score=0;
            
            for(int j=0; j<answers.length; j++) {
            	if(answers[j]=='X') oCount=0;
            	else score += (++oCount);
    	    }
            
            bw.write(Integer.toString(score)+"\n");
        }
        
        bw.flush();
        bw.close(); 
	}

	
}
