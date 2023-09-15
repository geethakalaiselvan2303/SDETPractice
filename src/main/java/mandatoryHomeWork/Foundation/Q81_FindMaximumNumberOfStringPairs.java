package mandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q81_FindMaximumNumberOfStringPairs {
	
	/*  https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/
	 *  1. Create the empty string rev=""
	 *  2. Iterate with each string reverse the string 
	 *  		check with the next string[] 
	 *  		if it's equal count++
	 *  3. Return the count
	 *  
	 *  Time complexity--->o[n2]
	 *  
	 */
	@Test
	public void test1() {
		int findMaximumNumberOfStringPairs = findMaximumNumberOfStringPairs(new String[] {"cd","ac","dc","ca","zz"});
		System.out.println(findMaximumNumberOfStringPairs);
	}

	public int findMaximumNumberOfStringPairs(String[] s) {
		int count=0;
		for (int i = 0; i < s.length; i++) {
			String s1=reverse(s[i]);
			for (int j = i+1; j < s.length; j++) {
				if(s1.equals(s[j])) {
					count++;
				}
			}
		}
			return count;	
				
	}
	
	public String reverse(String s2) {
		String rev="";
		for (int i = s2.length()-1; i>=0 ; i--) {
			rev=rev+s2.charAt(i);
		}
		
		return rev;
		
	}
}
