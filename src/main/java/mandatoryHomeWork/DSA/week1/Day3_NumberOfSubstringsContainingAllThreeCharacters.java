package mandatoryHomeWork.DSA.week1;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Day3_NumberOfSubstringsContainingAllThreeCharacters {
	
	
	/*  https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
	 *  1. declare the pointer=0	
		2. Add the first three character.	
		3. Add the helper function to check the not to have the duplicates	
		4. keep on iterating the character still the length of the string	
		5. remove the first index and add the last index value. Iterate the still length of the length	
			Check for the condition whether each stirng have the abc values

	 *   Time Complexity---> o[n]
	 *   Space Complexity---> o[n]
	 */
	
	@Test
	public void test1() {
		int sumberOfSubstringsContainingAllThreeCharacters = sumberOfSubstringsContainingAllThreeCharacters("abcabc");
		Assert.assertEquals(10, sumberOfSubstringsContainingAllThreeCharacters);
	}
	public int sumberOfSubstringsContainingAllThreeCharacters(String s) {
		int[] empty=new int[3];
		int left=0,right=0,count=0;
		while(right<s.length()) {
			empty[s.charAt(right)-'a']++;
			while(empty[0]>0 && empty[1]>0 && empty[2]>0) {
				empty[s.charAt(left++)-'a']--;
				count=count+s.length()-right;
			}
			right++;
		}
		
			return count;
		}
		
		
		
	

	
	
}
