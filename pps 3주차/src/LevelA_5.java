import java.util.List;
import java.util.ArrayList;

public class LevelA_5 {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		int result = solution(skill, skill_trees);
		
		System.out.println(result);
	}

	
	
	
	
	public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        boolean isValid;
        int count=0;
        char[] s = skill.toCharArray();
        
        for(int i=0; i<skill_trees.length; i++){
        	   isValid = true;
        	  // count=0;
        	   char[] tree = skill_trees[i].toCharArray();
        	   List<Integer> list  = new ArrayList<>();
        	   
        	   for(int j=0; j<s.length; j++) {
        		   for(int k=0; k<tree.length; k++) {
        			   if(s[j]==tree[k]) {
        				  // count++;
        				   list.add(k);
        			   }
        		   }
        	   }
        	   System.out.print("list"+i+": ");
        	   for(Integer h : list) {
        		   System.out.print(h+ " ");
        	   }
        	   
        	  
    		   for(int l=0; l<list.size()-1; l++) {
            	   if(list.get(l)>list.get(l+1)) {
            		   isValid = false;
            		   
            		   System.out.println(list.get(l) + ">" + list.get(l+1));
            		   break;
            	   }
               }	   
        	   
              
               if(isValid) {
            	   System.out.println("isValid: " + i);
            	   answer++;
               }
           
        }
        
        
        return answer;
    }
}
