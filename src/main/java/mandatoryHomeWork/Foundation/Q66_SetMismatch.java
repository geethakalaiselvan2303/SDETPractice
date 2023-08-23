package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;

public class Q66_SetMismatch {
	
	/*  1. Declare the empty array with size as 2
		2. Sort the given array
		3. Iterate with array and check for the condition 1 and i+1 are equal
		4. If equal the add the duplicate value in the empty array
		5. Then add 1 into duplicate value and added in to the empty array
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(setMismatch(new int[] {2,2})));
	}
	 
	public int[] setMismatch(int[] nums) {
		int[] empty = new int[2];
	    Arrays.sort(nums);
	    
	    int duplicate = -1;
	    int missing = 1;
	    
	    for (int i = 1; i < nums.length; i++) { //o[n]
	        if (nums[i] == nums[i - 1]) {
	            duplicate = nums[i];
	        } else if (nums[i] > nums[i - 1] + 1) {
	            missing = nums[i - 1] + 1;
	        }
	    }
	    
	    if (nums[nums.length - 1] != nums.length) {
	        missing = nums.length;
	    }
	    
	    empty[0] = duplicate;
	    empty[1] = missing;
	    
	    return empty;


	}


}
