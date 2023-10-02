package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q25_MergeStringsAlternately {
	
	/*  https://leetcode.com/problems/merge-strings-alternately/description/
	 *  1. Initialize variable the left as 0 and right as 0
	 *  2. Create the char[] with the length of word1+word2
	 *  3. Iterate with condition left should be less than the word1 length and right should be less than the word2 length
	 *  4. Add the each first letter from the word1 and word2
	 *  5. increment left and right still the condition fails
	 *  6. add the left over letters from word1/word2 to char[]
	 *  7. Return the char[] as stirng
	 */

	@Test
	public void test1() {
		String mergeAlternately = mergeAlternately("abc","pqr");
		System.out.println(mergeAlternately);
		Assert.assertEquals("apbqcr", mergeAlternately);
	}
	
	
	public String mergeAlternately(String word1, String word2) {
		 int left=0,right=0;
	        int n=word1.length()+word2.length();
	        char[] c=new char[n];
	        int i=0;
	        while(left<word1.length() && right<word2.length()){
	            c[i++]=word1.charAt(left++);
	            c[i++]=word2.charAt(right++);
	        }

	        while(left<word1.length()){
	            c[i++]=word1.charAt(left++);
	        }
	        while(right<word2.length()){
	            c[i++]=word2.charAt(right++);
	        }

	        return String.valueOf(c);		
	}
}
