package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q21_ValidPalindrome {
	
	@Test
	public void test1() {
		boolean ispalindrome = ispalindrome("A man, a plan, a canal: Panama");
		Assert.assertEquals(true,ispalindrome);
	}
	
	@Test
	public void test2() {
		boolean ispalindrome = ispalindrome("race a car");
		Assert.assertEquals(false,ispalindrome);
	}

	public boolean ispalindrome(String str) {
		String rev="";  
		String replaceAll = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String excepted=replaceAll;
		char[] ch = replaceAll.toCharArray();
				for (int i = ch.length-1; i>=0; i--) {
			 rev=rev+ch[i];  
		}
		System.out.println(rev);
		System.out.println(excepted);
		
		if(excepted.equals(rev))
			return true;
		else
			return false;
	}
}
