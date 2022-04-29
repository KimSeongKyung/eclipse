import java.util.*;

public class LevelA_83 {
	public static void main(String args[]) {
		int n;
		List<Integer> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(!list.contains(num)) list.add(num);
		}
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		sc.close();
	}

}
