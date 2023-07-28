package MandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Q24_FindFirstPalindromicStringArray {
	@Test
	public void test1() {
		String findFirstPalindromicString = FindFirstPalindromicString(new String[] {"abc","car","ada","racecar","cool"});
		Assert.assertEquals("ada", findFirstPalindromicString);
	}

	@Test
	public void test2() {
		String findFirstPalindromicString = FindFirstPalindromicString(new String[] {"notapalindrome","racecar"});
		Assert.assertEquals("racecar", findFirstPalindromicString);
	}
	
	@Test
	public void test3() {
		String findFirstPalindromicString = FindFirstPalindromicString(new String[] {"def","ghi"});
		Assert.assertEquals("", findFirstPalindromicString);
	}
	public String FindFirstPalindromicString(String[] str) {
		String actual="";
		for (String s1 : str) {
	       String[] splitArray = s1.split(",");
	       for (String s2 : str) {
	    	   if(isPalindrome(s2)) { 
	    		  actual=s2;
	    		  break;
	    	   }
	    	 }
		}
 
		System.out.println(actual);
		return actual;
		}

	public boolean isPalindrome(String splitArray) {
		String excepted=splitArray;
		String rev="";
		for (int i =splitArray.length()-1 ; i >=0; i--) {
			 rev=rev+splitArray.charAt(i);
		}
		return excepted.equals(rev);
	 }
	}
		

