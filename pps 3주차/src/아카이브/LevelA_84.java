import java.util.*;

public class LevelA_84 {
	public static void main(String args[]) {
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		
		char[] array = s.toCharArray();
		String[] suffixs = new String[array.length];
		
		for(int i=0; i<suffixs.length; i++) {
			String suf = "";
			for(int j=0+i; j<suffixs.length; j++) {
				suf += array[j];
			}
			suffixs[i] = suf;
		}
		Arrays.sort(suffixs);
		
		for(String str : suffixs) {
			System.out.println(str);
		}
		
		sc.close();
	}

}
