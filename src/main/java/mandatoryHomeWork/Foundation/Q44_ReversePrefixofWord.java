package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q44_ReversePrefixofWord {
//	https://leetcode.com/problems/reverse-prefix-of-word/
	
	@Test
	public void test1(){
		String reversePrefixofWord = reversePrefixofWord("abcdefd",'d');
		System.out.println(reversePrefixofWord);
		Assert.assertEquals("dcbaefd", reversePrefixofWord);
	}
	@Test
	public void test2(){
		String reversePrefixofWord = reversePrefixofWord("xyxzxe",'z');
		System.out.println(reversePrefixofWord);
		Assert.assertEquals("zxyxxe", reversePrefixofWord);
	}
	@Test
	public void test3(){
		String reversePrefixofWord = reversePrefixofWord("abcd",'y');
		System.out.println(reversePrefixofWord);
		Assert.assertEquals("abcd", reversePrefixofWord);
	}

	public String reversePrefixofWord(String s, char c) {
		String rev="";
		String s1=null,s2 = null;
		if(s.contains(String.valueOf(c))) {
			int indexOf = s.indexOf(c);
			s1=s.substring(0, indexOf+1);
			s2=s.substring(indexOf+1);
			for (int i = s1.length()-1; i>=0; i--) {
				rev=rev+s1.charAt(i);
			}
		}
		else {
			return s;
		}
		
		
		return rev.concat(s2);
}
	

}
