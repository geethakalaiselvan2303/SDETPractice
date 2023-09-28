package mandatoryHomeWork.DSA.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Day4_FindAllAnagramsString {
	
	/*  https://leetcode.com/problems/find-all-anagrams-in-a-string/
	 *  1. initialize the left and right variable
	 *  2. Declare the integer array with the length of 26
	 *  3. Iterate with string(s) and store it in char_s[]
	 *     Iterate with string(p) and store it in char_p[]	
	 *  4. Take the character based on the length of P
	 *  5. add the 3 character in the integer array
	 *  		check for the condition whether each letter in p should be equal to 1
	 *  		if yes store the corresponding index value in the list 
	 *  6. decrement the character in the array list when moving to next window
	 *  7. Compare with window char_s[] with char_p[]
	 *  	if equals take the starting index and added it in the list
	 *  
	 *  Time Complexity--->
	 *  space complexity--> o[n]
	 * 
	 */
	
	@Test
	public void test1() {
		List<Integer> findAnagrams = findAnagrams("cbaebabacd","abc");
		System.out.println(findAnagrams);
		Assert.assertEquals(Arrays.asList(0,6), findAnagrams);
	}
	
	@Test
	public void test2() {
		List<Integer> findAnagrams = findAnagrams("abab","ab");
		System.out.println(findAnagrams);
		Assert.assertEquals(Arrays.asList(0,1,2), findAnagrams);
	}
	
	@Test
	public void test3() {
		List<Integer> findAnagrams = findAnagrams("baa","aa");
		System.out.println(findAnagrams);
		Assert.assertEquals(Arrays.asList(1), findAnagrams);
	}
 
	// abc, bae,aeb, eba, aba, bac, acd
	public List<Integer> findAnagrams(String s, String p) {
		int spointer=0,ppointer=0;
		int k=p.length();
		List<Integer> list=new ArrayList<Integer>();
		int[] c=new int[26];
		int[] pp=new int[26];
		while(ppointer<p.length()) {
			pp[p.charAt(ppointer++)-'a']++;
		}
		while(spointer<s.length() && spointer<k ) {
			c[s.charAt(spointer++)-'a']++;
		}
		if(isFindAnagram(c,pp)) {
			list.add(spointer-k);
		}
		while(spointer<s.length()) {
			c[s.charAt(spointer-k)-'a']--;
			c[s.charAt(spointer++)-'a']++;
			if(isFindAnagram(c,pp)) {
				list.add(spointer-k);
			}
			
			}
		System.out.println(list);
		return list;
		}
	

	public boolean isFindAnagram(int[] c, int[] pp) {
		
		return Arrays.equals(c, pp);
		
		
		
	}
	
	

}
