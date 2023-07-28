package MandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Q22_ShuffleString {

	/**
	 * 1) Input string(s) and integer array in[]
	 * 2) output string
	 * 3) convert the s to character array
	 * 4) 
	 * 
	 */
	@Test
	public void test1() {
		String shufflestring = shufflestring("codeleet",new int[] {4,5,6,7,0,2,1,3});
		Assert.assertEquals("leetcode", shufflestring);
	}
//	@Test
//	public void test() {
//		String shufflestring = shufflestring("abc",new int[] {0,2,1});
//		Assert.assertEquals("acb", shufflestring);
//	}

	public String shufflestring(String s, int[] indices) {
		char[] ch=new char[s.length()];
		String replaceAll = s.replaceAll(s, s);
		if(s.length()==replaceAll.length())
		for (int i = 0; i < indices.length; i++) {
			ch[indices[i]]=s.charAt(i);
		}
		System.out.println(String.valueOf(ch));
		return String.valueOf(ch);
	}
	
}
