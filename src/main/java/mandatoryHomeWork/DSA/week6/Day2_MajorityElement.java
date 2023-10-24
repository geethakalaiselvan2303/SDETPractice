package mandatoryHomeWork.DSA.week6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Day2_MajorityElement {
	
	/* https://leetcode.com/problems/majority-element 
	 */
	
	@Test
	public void test1() {
		majorityElement(new int[] {2,2,1,1,1,2,2});
	}
	
	public int majorityElement(int[] nums) {
		int output=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int n : nums) {
			if(map.containsKey(n)) {
				map.put(n, map.get(n)+1);
			}
			else {
				map.put(n, 1);
			}
		}
		int max = Collections.max(map.values());
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue().equals(max)) {
				output=entry.getKey();
			}
			
		}
		return output;
        
    }

}
