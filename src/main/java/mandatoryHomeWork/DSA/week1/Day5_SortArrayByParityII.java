package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Day5_SortArrayByParityII {
	 
	/*  https://leetcode.com/problems/sort-array-by-parity-ii/description/
	 *  1. Declare left=0,right=1;
	 *  2. Iterate with length of the arr
	 *  3. check for the condition odd / even 
	 *  	if yes keep increment with odd and even
	 *  4. if not swap the odd and even element
	 *  
	 *  Time Complexity--->o[n]
	 *  space complexity--> o[1]
	 */
	
	@Test
	public void test1() {
		int[] sortArrayByParityII = sortArrayByParityII(new int[] {4,2,5,7});
		Assert.assertEquals(sortArrayByParityII, new int[] {4,5,2,7});
	}
	
	@Test
	public void test2() {
		int[] sortArrayByParityII = sortArrayByParityII(new int[] {4,5,2,7});
		Assert.assertEquals(sortArrayByParityII, new int[] {4,5,2,7});
	}
	
	@Test
	public void test3() {
		int[] sortArrayByParityII = sortArrayByParityII(new int[] {888,505,627,846});
		Assert.assertEquals(sortArrayByParityII, new int[] {888,505,846,627});
	}

	public int[] sortArrayByParityII(int[] arr) {
		int even=0,odd=1;
		int n=arr.length;
		while (even < n && odd < n) {
			while(even < n && arr[even]%2==0) {
				even=even+2;
			}
			while(odd < n && arr[odd]%2!=0) {
				odd=odd+2;
			}
			if(even<n && odd<n) {
				int temp=arr[even];
				arr[even]=arr[odd];
				arr[odd]=temp;
				even=even+2;
				odd=odd+2;
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}
	
}
