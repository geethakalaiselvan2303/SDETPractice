package mandatoryHomeWork.Foundation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Q45_ReverseWordsStringIII{
	//https://leetcode.com/problems/reverse-words-in-a-string-iii/

	@Test
	public void test1() {
		String sortingSentence = sortingSentence("God Ding");
		System.out.println(sortingSentence);
		Assert.assertEquals("doG gniD", sortingSentence);
	}
	@Test
	public void test2() {
		String sortingSentence = sortingSentence("Let's take LeetCode contest");
		System.out.println(sortingSentence);
		Assert.assertEquals("s'teL ekat edoCteeL tsetnoc", sortingSentence);
	}

 	public String sortingSentence(String s) {
 		StringBuilder result=new StringBuilder();
 		String reversedWord = null;
 		  String[] split = s.split(" ");
 		  for(String word:split) {
 			  reversedWord=reverseString(word);
 			 result.append(reversedWord).append(" ");
 		  }
		 
		 return result.toString().trim();
 		
		
	}

	public String reverseString(String word) {
		String rev="";
		for (int i =word.length()-1; i>=0; i--) {
			rev=rev+word.charAt(i);
		}
		return rev;
	}


}

