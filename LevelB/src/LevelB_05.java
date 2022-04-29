
import java.util.List;
import java.util.ArrayList;

public class LevelB_05 {
	List<Integer> list = new ArrayList<>();
	public static void main(String args[]) {
		
		
		
		
	}
	
	 public boolean findTarget(TreeNode root, int k) {
		 boolean find = false;
	       inorder(root, list);
	       for(int i=0; i<list.size(); i++){
	           if(k-list.get(i) != list.get(i) && list.contains(k - list.get(i))){
	               find  = true;
	               break;
	           }
	       }
	       return find;
	 }
	 
	 public void inorder(TreeNode root, List list) {
	        if(root == null) return;
	        inorder(root.left, list);
	        list.add(root.val);
	        inorder(root.right, list);
	    }
	 
	 
	 
	 private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	 

}

/* inorder의 리턴 타입을 List로 하려 했는데 그러면 처음 if문에서 그냥 리턴하지 못하고 list를 리턴해야하므로
tree에서 순회할 때는 무조건 리턴타입 void로 해야함.(아.. 생각해보니깐 리턴타입 list로 해도 불가능은 아닐듯,,
근데 굳이..?) 그리고 list를 전역변수로 선언하고 inorder 함수 파라미터에 list 추가. 

만약 tree가 1 밖에 없어 list안에 1만 있을 경우, k가 2일때 자칫 2-1=1로 합이 2가 되는 다른 정수가 있다고 착각할 수 있음
그걸 방지하기 위해 k-list.get(i) != list.get(i) 라는 조건을 추가함.

질문) 포인터로 주고 받고 싶은데 왜 안되는지 모르겠음


*/


