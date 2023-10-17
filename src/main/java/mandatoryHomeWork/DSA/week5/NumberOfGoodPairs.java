package mandatoryHomeWork.DSA.week5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
	
	/* https://leetcode.com/problems/number-of-good-pairs/description/
	 * 
	 */

	public static void main(String[] args) {
		int[] n= {1,2,3,1,1,3};
		int count=0;
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i : n) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
			Collection<Integer> values = map.values(); //3,1,2
			for (int j : values) {
				if(j>1) {
					int val=j*(j-1)/2;
					count=count+val;
				}
			}
			System.out.println(count);
		}
		
	}


