package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Test;
import org.testng.Assert;

public class TwoSum_Hashing {
	
	/*  https://leetcode.com/problems/two-sum/description/
	 *  1. Declare the variable left=0 and right=1
	 *  2. Keep the left static position until the right reaches the end of the array
	 *  3. Once the right reaches the pointer end of the array the increment the left 
	 *  4. keep iterating until the left reaches the end of the array
	 *  5. each time check for the condition left+right==target
	 *  6. if yes return the same
	 * 
	 */
	
	@Test
	public void test1() {
		int[] twosum = TwoSum(new int[] {2,5,12,2},7);
		System.out.println(Arrays.toString(twosum));
		Assert.assertEquals(twosum, new int[] {0,1});
	}
	
	public int[] TwoSum(int[] n,int target) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for (int i = 0; i < n.length; i++) {
			if(map.containsKey(target-n[i])) {
				return new int[] {map.get(target-n[i]),i};
			}
			else {
				map.put(n[i],i);
			}
		}
		return n;
		
	}
}
			
