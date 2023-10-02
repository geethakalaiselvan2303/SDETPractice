package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Test;
import org.testng.Assert;

public class TwoSum_Hashing_way2 {
	
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
		List<List<Integer>> twosum = TwoSum(new int[] {1,1,0,3},4);
		System.out.println(twosum);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 3));
		Assert.assertEquals(twosum, expected);
	}
	
	public List<List<Integer>> TwoSum(int[] n,int target) {
		List<List<Integer>> result = new ArrayList<>();	
		int left=0,right=1;
		

		while(right<n.length) {
			if(n[left]+n[right]==target) {
			  List<Integer> pair = new ArrayList<>();
			  pair.add(left);
			  pair.add(right);
			  result.add(pair);
			  }
			if(right==n.length-1) {
				left++;
				right=left+1;
			}
			else {
				right++;
			}
		}
		return result;
	    }
	}

			
