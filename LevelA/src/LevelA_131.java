import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LevelA_131 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> maps = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		int[] nums = new int[N];
		double mean; 
		int medianVal, mode=0, range;
		int sum=0, max=0;
		
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		medianVal = nums[N/2];
		range = nums[N-1]-nums[0];
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
			if(!maps.containsKey(nums[i])) maps.put(nums[i], 1);
			else maps.put(nums[i], maps.get(nums[i])+1);
		}
		
		//mean = sum/N; <- 에러해결!! 정수랑 정수 나누면 소수점 밑에 날라가잖아ㅜㅜㅜ
		mean = sum/(N*1.0);
		
		for(Integer i : maps.keySet()) {
			if(max < maps.get(i)) {
				list.clear();
				list.add(i);
				max = maps.get(i);
			}
			else if(max == maps.get(i)) list.add(i);
		}
		if(list.size()==1) mode = list.get(0);
		else {
			Collections.sort(list);
			mode = list.get(1);
		}
		//System.out.println(String.format("%.1f", mean));
		//System.out.println(Math.round(mean*10)/10.0);
		
	    System.out.println(Math.round(mean));
		System.out.println(medianVal);
		System.out.println(mode);
		System.out.println(range);
		
		sc.close();
	}

}
