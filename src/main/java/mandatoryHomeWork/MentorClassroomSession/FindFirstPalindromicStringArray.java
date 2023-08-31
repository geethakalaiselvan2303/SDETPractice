package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class FindFirstPalindromicStringArray {
	/* 	Input: words = ["abc","car","ada","racecar","cool"]
		Output: "ada"
		1. Iterate with words
		2. reverse each word and check with actual input whether both are equal
		3. if it's equal then break the loop
		4. return the string
	 */
	
	@Test
	public void test1() {
		String findFirstPalindromicStringArray = FindFirstPalindromicStringArray(new String[] {"abc","car","ada","racecar","cool"});
		Assert.assertEquals("ada", findFirstPalindromicStringArray);
	}
	
	@Test
	public void test2() {
		String findFirstPalindromicStringArray = FindFirstPalindromicStringArray(new String[] {"notapalindrome","racecar"});
		Assert.assertEquals("racecar", findFirstPalindromicStringArray);
	}
	
	@Test
	public void test3() {
		String findFirstPalindromicStringArray = FindFirstPalindromicStringArray(new String[] {"notapalindrome","racecar","ada"});
		Assert.assertEquals("racecar", findFirstPalindromicStringArray);
	}

	public String FindFirstPalindromicStringArray(String[] words) {
		String result="";
		for(int i=0;i<words.length;i++){
			  if(isPalidrome(words[i])){
				  result=words[i];
				  break;
			  }
			  }
		return result;
			  }
			  
			  public boolean isPalidrome(String s){
			  String s1=s;	  
			  String s2="";
			  for(int i=s.length()-1;i>=0;i--){
			  s2=s2+s.charAt(i);
			  }
			  return s1.equals(s2);
			  }
			  

}
