package mandatoryHomeWork.DSA.week6;

import org.junit.Test;

public class Day5_BinarySearch {
	
	/* https://leetcode.com/problems/binary-search/description/
	 * 
	 */
	
	@Test
	public void test1() {
		search(new int[] {-1,0,3,5,9,12},9);
	}
	
	 public int search(int[] nums, int target) {
		  int output=-1;
	       for(int i=0;i<nums.length;i++){
	           if(nums[i]==target){
	               output=i;
	           }
	         }
	       return output;
	 }

}
