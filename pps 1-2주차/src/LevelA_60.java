/*
 * 에러해결!!!!
 * 진짜 어이가 없어가지고;;;
 * 자바에서 문자열 비교할때 == 쓰면 안됨
 *  .equals()로 비교해야 됨 ㅜㅜㅜㅜㅜㅜㅜ
 * 
 */


import java.util.List;
import java.util.ArrayList;

public class LevelA_60 {
	public static void main(String args[]) {
		
		String[] ops = {"5","-2","4","C","D","9","+","+"};
		int result = calPoints(ops);
		System.out.println(result);
	}
	
	public static int calPoints(String[] ops) {
        int sum=0;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("C")) list.remove(list.size()-1);
            else if(ops[i].equals("D")) list.add( 2*(list.get(list.size()-1)));
            else if(ops[i].equals("+")) list.add((list.get(list.size()-1))+ (list.get(list.size()-2)));
            else list.add(Integer.parseInt(ops[i]));
        }
        
        for(int i=0; i<list.size(); i++) {
        	sum += list.get(i);
        }
        
        return sum;
    }

}
