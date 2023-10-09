package mandatoryHomeWork.DSA.week4;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Day1_NumberEquivalentDominoPairs {
	
	/* https://leetcode.com/problems/number-of-equivalent-domino-pairs
	 *  1. Iterate with nodes
		2. check for the condition whether head node not equal to null and head node value is equal to the remove values
			if yes then change the head position as head=head.next
			
		3. Declare the previous node as null and currentnode as head
		4. Iterate with node and check for the condition currentnode val is equal to the removal node value
			if yes then assign the previousNode next to currentnode next and currentNode = currentNode.next;
			else then assign the previousNode to currentnode and currentNode = currentNode.next;
	    5. Return head 
	 */
	
	@Test
	public void test1() {
		numEquivDominoPairs(new int[][] {{1,2},{2,1},{3,4},{5,6}});
	}

	 public int numEquivDominoPairs(int[][] n) {
			int count = 0;
			Map<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i < n.length; i++) {
				String temp = "";
				if (n[i][0] > n[i][1]) {
					temp = temp + n[i][1];
					temp = temp + n[i][0];
				} else {
					temp = temp + n[i][0];
					temp = temp + n[i][1];
				}
				if (map.containsKey(temp)) {
					count = count + map.get(temp);
				}
				map.put(temp, map.getOrDefault(temp, 0) + 1);
			}
			return count;
	        
	    }
}
