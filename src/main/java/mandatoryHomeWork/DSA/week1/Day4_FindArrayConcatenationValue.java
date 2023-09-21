package mandatoryHomeWork.DSA.week1;

import org.junit.Test;
import org.testng.Assert;

public class Day4_FindArrayConcatenationValue {
	/* https://leetcode.com/problems/find-the-array-concatenation-value/description/
	 * 1. initialize the sum variable
	 * 2. Declare left=0,right=arr.length-1
	 * 3. concat the left and right and store it in variable 
	 * 4. then move the left++ and right--
	 * 5. concat the value and add the exist values
	 * 6. Check for the condition given array is even or odd
	 * 		if it's odd the we need to add the odd value at last
	 * 6. Return the sum.
	 * 
	 *  Time Complexity--> o[n]
	 *  space Complexity--> O[logN]
	 * 
	 */

	@Test
	public void test1() {
		long findTheArrayConcVal = findTheArrayConcVal(new int[] {7,52,2,4});
		Assert.assertEquals(596, findTheArrayConcVal);
	}
	
	@Test
	public void test2() {
		long findTheArrayConcVal = findTheArrayConcVal(new int[] {5,14,13,8,12});
		Assert.assertEquals(673, findTheArrayConcVal);
	}
	
	public long findTheArrayConcVal(int[] nums) {
		int left=0,right=nums.length-1;
		long sum=0;
		String concat="";  //O[logN] each concat takes place
		while(left<right) {
			concat=nums[left]+""+nums[right];
			if(concat!=null) {
				sum=sum+Integer.parseInt(concat);
			}
			left++;
			right--;
			concat="";
		}
		if(nums.length%2 != 0)
            sum=sum+ nums[left];
		
		System.out.println(sum);
		return sum;
		
	}
}
