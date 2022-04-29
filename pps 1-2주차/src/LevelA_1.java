import java.util.Arrays;

public class LevelA_1 {
	public static void main(String args[]) {
		int[] g = {1,2,3};
		int[] s = {1,1};
		int result = findContentChildren(g,s);
		System.out.println(result);
	}
	
	
	public static int findContentChildren(int[] g, int[] s) {
        int count=0;
        int k=0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i=0; i<g.length; i++){
            for(int j=k; j<s.length; j++) {
                if(g[i] <= s[j]) {
                    count++;
                    k=j+1;
                    break; 
                }
                    
            }
        }
        return count;
    }

}



