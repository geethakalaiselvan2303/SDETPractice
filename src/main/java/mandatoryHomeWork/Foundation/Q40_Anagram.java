package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;

public class Q40_Anagram {
	// https://leetcode.com/problems/valid-anagram/description/
	@Test
	public void test1() {
		anagram("anagram","nagaram");
	}
	@Test
	public void test2() {
		anagram("rat","car");
	}

	public boolean anagram(String s,String t) {
		char[] ch1=s.toCharArray();
	       char[] ch2=t.toCharArray(); 
	       Arrays.sort(ch1);
	       Arrays.sort(ch2);
	       if(Arrays.equals(ch1,ch2)){
	           return true;
	       }
	       else{
	           return false;
	       }
	}
}
