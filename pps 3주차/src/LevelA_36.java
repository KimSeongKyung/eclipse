
import java.util.Scanner;
import java.util.HashMap;

class LevelA_36 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
    
			Answer = 0;
	
			int n = sc.nextInt();
			HashMap<Integer,Integer> maps = new HashMap<>();
			for(int i=0; i<n; i++){
			    int num = sc.nextInt();
			    if(!maps.containsKey(num)) maps.put(num,1);
			    else maps.put(num, maps.get(num)+1);
			}
			for(Integer i : maps.keySet()){
			    if(maps.get(i)%2!=0) Answer ^= i;   // XOR연산기호 : ^
			}
			

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			
		}
		sc.close();
	}
}