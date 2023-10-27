package mandatoryHomeWork.DSA.week6;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ProductofArrayExceptSelf {
	
	/* https://leetcode.com/problems/product-of-array-except-self/submissions/
	 * 1. Declare the left and right array with size of nums
	 * 2. Iterate with nums and get the right and left value of each number 
 			store the value in left and right array
 	   3. Create new array 
 	   4. product of left and right array each index value and store it in newly created array
 	   5. return result
 	   
 	   	Time complexity-->O[n]
 	   	space complexity-->O[n]
	 * 
	 */
	
	@Test
	public void test1() {
		productExceptSelf(new int[] {1,2,3,4});
	}
	
	public int[] productExceptSelf(int[] nums) {
		
		int[] right=new int[nums.length];
		int[] left=new int[nums.length];
		
		left[0]=1;
		for (int i = 0; i < nums.length; i++) {
			left[i]=left[i-1]*nums[i-1];
		}
		right[nums.length-1]=1;
		for (int j = nums.length-2; j >=0; j--) {
			right[j]=right[j+1]*nums[j+1];
		}
		
		int[] ans=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i]=left[i]*right[i];
		}
		
		return ans;
		
            }

}
