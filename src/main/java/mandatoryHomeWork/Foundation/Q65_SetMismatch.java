package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Q65_SetMismatch {
	
	/* 	https://leetcode.com/problems/set-mismatch/
	 *  1. Declare the empty array with size as 2
		2. Sort the given array
		3. Iterate with array and check for the condition 1 and i+1 are equal
		4. If equal the add the duplicate value in the empty array
		5. Then add 1 into duplicate value and added in to the empty array
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(setMismatch(new int[] {1,2,2,4})));
	}
	 
	public int[] setMismatch(int[] nums) {
		Arrays.sort(nums);  
		int add1=0;
		int[] result=new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				result[0]=nums[i];
			}
		}
		Set<Integer> set=new HashSet<Integer>();
		for(int sum:nums) {
			set.add(sum);
		}
		 for (int num : set) {
	            add1 += num;
	        }
		int add2=nums.length*(nums.length+1)/2;
		result[1] =add2-add1;
		return result;


	}


}
