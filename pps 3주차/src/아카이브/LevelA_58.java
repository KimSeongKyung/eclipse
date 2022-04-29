/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


import java.util.Stack;


public class LevelA_58 {
	public static void main(String args[]){
		int[] array = {1,2,3,4,5};
		ListNode head;
		
		ListNode reverse = reverseList(head);
		
		

		
	}
	
	
	public static ListNode reverseList(ListNode head) {
		Stack<ListNode> stack = new Stack<>();
		ListNode position = head;
		while(position!=null)
		{
			stack.push(position);
			position = position.next;
		}
		head = stack.peek();
		position = head;
		stack.pop();
		while(stack.isEmpty()) {
			position.next = stack.peek();
			stack.pop();
			position = position.next;
		}
		position.next = null;
        
		return head;
		
		
		
		
    }
	
	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode() {}
		 ListNode(int val) { this.val = val; }
		 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}

