package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q79_ReverseWordsStringIII {
	
	/*  1. Declare the string rev=""
	 *  2. Split the string based on space and store it in string array
	 *  3. Iterate to each string and reverse
	 *  4. concat the string with rev
	 *  5. return rev
	 *  
	 *  edge--->empty string ""
	 *  
	 *  Time complexity-->
	 * 
	 */
	
	@Test
	public void test1() {
		String reverseWordsString = reverseWordsString("Let's take LeetCode contest");
		Assert.assertEquals(reverseWordsString, "s'teL ekat edoCteeL tsetnoc");
	}
	
	@Test
	public void test2() {
		String reverseWordsString = reverseWordsString("");
		Assert.assertEquals(reverseWordsString, "");
	}

	public String reverseWordsString(String s) {
		String rev="";
		String[] str = s.split(" ");
		for (String s1 : str) {
			rev=rev+reverseString(s1)+" ";
		}
		return rev.trim();
	}

	public String reverseString(String s1) {
		String r1="";
		for(int i=s1.length()-1;i>=0;i--) {
			r1=r1+s1.charAt(i);
		}
		return r1;
	}

}
