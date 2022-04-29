import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class LevelA_54 {
	public static void main(String args[]) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves  = {1,5,3,5,1,2,1,4};
	
		int result = solution(board, moves);
		System.out.println(result);
	}
	
	
	public static int solution(int[][] board, int[] moves) {
        int count = 0;
        
        List<Stack<Integer>> lists = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<board.length; i++) {
        	Stack<Integer> list = new Stack<>();
        	
        	for(int j=0; j<board[i].length; j++) {
        		if(board[i][j]!=0) list.push(board[i][j]);
        	}
        	
        	lists.add(list);
        }
        
        for(int i=0; i<moves.length; i++) {
        	Stack<Integer> s= lists.get(moves[i]-1);
        	System.out.println(i+1+"번째 move to: " + moves[i]);
        	
        	if(!s.isEmpty()) {
        		int newTop = s.peek();
        		System.out.println("newTop: "+ newTop);
        		if(stack.isEmpty()) {
        			stack.push(newTop);
        			s.pop();
        		}
        		else {
        			int top = stack.peek();
        			System.out.println("top: "+ top);
        			stack.push(newTop);
        			s.pop();
        
        			if(top==newTop) {
        		        System.out.println("same!!");
        				System.out.println("top: "+ top);
            			System.out.println("newTop: "+ newTop);
        				stack.pop();
        				stack.pop();
        				count+=2;
        			}
        		}
        	}
        	
         }
       return count;
    }

}
