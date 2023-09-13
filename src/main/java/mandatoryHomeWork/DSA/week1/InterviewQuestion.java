package mandatoryHomeWork.DSA.week1;

import java.util.HashMap;
import java.util.Map;

public class InterviewQuestion {

	public static void main(String[] args) {
		int[] input= {1,2,3,1,2,4,3};
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for (int n : input) {
			if(map.containsKey(n)) {
				map.put(n, map.get(n)+1);
			}
			else {
				map.put(n, 1);
			}
			
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue().equals(1)) {
				System.out.println(entry.getKey());
			}
		}
		
				
	}

}
