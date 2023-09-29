package mandatoryHomeWork.DSA.week2;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class PalindromeOrNot {
	
	/*   Question 2 : Check if characters of a given string can be rearranged to form a palindrome.
		Given a string, Check if the characters of the given string can be rearranged to form a palindrome. 
		
		For example characters of "dsaodsa"  can be rearranged to form a palindrome "dsaoasd". 
		but characters of "dsaondsa" cannot be arranged to form a palindrome
	 * 
	 */

	@Test
	public void test1() {
		boolean checkpalindrome = checkpalindrome("dsaondsa");
		Assert.assertEquals(checkpalindrome, false);
	}
	
	@Test
	public void test2() {
		boolean checkpalindrome = checkpalindrome("dsaodsa");
		Assert.assertEquals(checkpalindrome, true);
	}
	
		public boolean checkpalindrome(String s) {
		boolean flag=false;
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] c = s.toCharArray();
		for (char d : c) {
			if(map.containsKey(d)) {
				map.put(d, map.get(d)+1);
			}
			else {
				map.put(d, 1);
			}
		}
		int oddCount = 0;

	    for (int count : map.values()) {
	        if (count % 2 != 0) {
	            oddCount++;
	        }

	        if (oddCount > 1) {
	            return false; 
	        }
	    }

	    return true;
	}
	
}
		

	
	