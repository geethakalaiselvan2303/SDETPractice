package mandatoryHomeWork.Foundation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Q80_CheckIfNumberHasEqualDigitCountAndDigitValue {
	
	/*  https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/submissions/
	 *  1. Declare the count variable, create array with length of given string
	 *  2. Return false if the length is equal and length is <=1
	 *  3. Iterate with 2 loops
	 *  4. check for the condition whether index value is equal to the each character
			 *  5. if it's equal the count++
			 *  6. Add the count value to created array
			 *  7. then reset count=0
	 *  8. iterate still the string length
	 *  9. convert the new array to string
	 *  10. Return true if new array and given string is equal
	 *  
	 *  Time Complexity----> O[m+n]
	 * 
	 */
	
	@Test
	public void test1() {
		boolean checkIfNumberHasEqualDigitCountAndDigitValue = checkIfNumberHasEqualDigitCountAndDigitValue("42101000");
		Assert.assertEquals(checkIfNumberHasEqualDigitCountAndDigitValue, true);
	}
	
	@Test
	public void test2() {
		boolean checkIfNumberHasEqualDigitCountAndDigitValue = checkIfNumberHasEqualDigitCountAndDigitValue("");
		Assert.assertEquals(checkIfNumberHasEqualDigitCountAndDigitValue, false);
	}
	
	@Test
	public void test3() {
		boolean checkIfNumberHasEqualDigitCountAndDigitValue = checkIfNumberHasEqualDigitCountAndDigitValue("0");
		Assert.assertEquals(checkIfNumberHasEqualDigitCountAndDigitValue, false);
	}

	public boolean checkIfNumberHasEqualDigitCountAndDigitValue(String s) {
		int count=0;
		int[] empty=new int[s.length()];
		if(s.length()<=1) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				int val=(int)s.charAt(j)-'0';
				if(i==val) {
					count++;
				}
			}
			empty[i]=count;
			count=0;
		}
		System.out.println(Arrays.toString(empty));
		String rev="";
		for (int k = 0; k < empty.length; k++) {
			rev=rev+empty[k];
		}
		System.out.println(rev);
		return s.equals(rev);
	    
   
	}
	
}
