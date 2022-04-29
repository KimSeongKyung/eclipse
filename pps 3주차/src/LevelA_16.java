import java.util.List;
import java.util.ArrayList;

public class LevelA_16 {
	public static void main(String args[]) {
		int[] people = {70,80,50};
		int limit = 100;
		int result = solution(people, limit);
		System.out.println(result);
		
		
	}
	
	public static int solution(int[] people, int limit) {
        int answer;
        int count=0;
        boolean find = false;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<people.length; i++) {
        	list.add(people[i]);
        }
        
        while(!list.isEmpty()) {
        	find = false;
        	for(int j=1; j<list.size(); j++) {
        		if(limit - list.get(0) >= list.get(j)){
        			list.remove(j);
        			list.remove(0);
        			count++;
        			find = true;
        			break;
        		}
        	}
        	if(!find) {
        		count++;
        		list.remove(0);
        	}
        }
        
        answer = count;
        return answer;
        
        
    }

}
