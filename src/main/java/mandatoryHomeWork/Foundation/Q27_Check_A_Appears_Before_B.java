package mandatoryHomeWork.Foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q27_Check_A_Appears_Before_B {
	
	/*  https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/description/
	 * input -> String Op -> Boolean Constrain --> a should appears only before b
	 * 
	 * --- TD: s = "aaabbb" / True s = "abab" / False
	 * 
	 * Psudeo code:
	 * 
	 * 1. covert the string into a charArray 2. create iteration with the size of
	 * the charArray 3. if(charArray[i] == 'b' && charArray[i+1]=='a'){ return
	 * false; } retrun true;
	 * 
	 * 
	 */

	@Test
	public void test() {
		boolean checkBPresent = checkBPresent("aaabbb");
		System.out.println(checkBPresent);
		Assert.assertEquals(true, checkBPresent);
	}

	@Test
	public void test1() {
		boolean checkBPresent = checkBPresent("abab");
		System.out.println(checkBPresent);
		Assert.assertEquals(false, checkBPresent);
	}

	@Test
	public void test2() {
		boolean checkBPresent = checkBPresent("aaa");
		System.out.println(checkBPresent);
		Assert.assertEquals(true, checkBPresent);
	}

	public boolean checkBPresent(String input) {

		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == 'b' && charArray[i + 1] == 'a') {
				return false;
			}
		}
		return true;

	}


}
