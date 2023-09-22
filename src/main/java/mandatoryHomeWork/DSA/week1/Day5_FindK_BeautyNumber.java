package mandatoryHomeWork.DSA.week1;

import org.junit.Test;
import org.testng.Assert;

public class Day5_FindK_BeautyNumber {
	
	/*  https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/
	 *  1. initialize the count  and pointer variable
	 *  2. Convert the integer to string
	 *  3. Get the digit count based on the k value and divide the values from given values
	 *  4. Check the remainder is zero
	 *  	if yes increment the count
	 *  
	 *  Time Complexity--->
	 *  Space Complexity--->
	 * 
	 */

	@Test
	public void test1() {
		int divisorSubstrings = divisorSubstrings(430043, 2);
		Assert.assertEquals(divisorSubstrings, 2);
	}

	public int divisorSubstrings(int num, int k) {
		String s = Integer.toString(num);
		int count = 0, pointer = 0, left = 0;
		String result = "";
		while (pointer < k) {
			result = result + s.charAt(pointer++);
		}
		while (pointer <= s.length()) {
			pointer++;
			int n = Integer.parseInt(result);
			if (n != 0) {
				if (num % n == 0) {
					count++;
				}
			}
			if (pointer < s.length()) {
				result = s.substring(++left, pointer);
			}
		}
		System.out.println(count);
		return k;

	}
}
