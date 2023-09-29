package mandatoryHomeWork.DSA.week2;

import org.junit.Test;
import org.testng.Assert;

public class Day5_ReverseStringII {
	
	/* https://leetcode.com/problems/reverse-string-ii/
	 * Declare string Builder to the append the reverse string
	 * 1. Fecth the string based on k size
	 * 2. create helper function to reverse the string
	 * 3. return the same
	 * 
	 * Time Complexity---> o[n]
	 * space complexity--> o[1]
	 * 
	 */
	
	@Test
	public void test1() {
		String reverseStr = reverseStr("abcdefg",2);
		Assert.assertEquals(reverseStr, "bacdfeg");
		
	}
	
	@Test
	public void test2() {
		String reverseStr = reverseStr("a",2);
		Assert.assertEquals(reverseStr, "a");
		
	}
	@Test
	public void test3() {
		String reverseStr = reverseStr("abcdefg",2);
		Assert.assertEquals(reverseStr, "bacdfeg");
		
	}
	
	@Test
	public void test4() {
		String reverseStr = reverseStr("abcdefg",8);
		Assert.assertEquals(reverseStr, "gfedcba");
		
	}

	public String reverseStr(String s, int k) {
		int i=0; int n=s.length();
	      char[] ch=s.toCharArray();
	      while(i<n){
	          int j=Math.min(i+k-1,n-1);
	          reverseString(ch,i,j);
	          i=i+2*k;
	      }
		return String.valueOf(ch);
		}
		
		
	

	public void reverseString(char ch[],int start,int end) {
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
	} 

}
