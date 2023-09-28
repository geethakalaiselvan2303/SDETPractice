package mandatoryHomeWork.DSA.week2;

import org.junit.Test;

public class PalindromeOrNot {

	@Test
	public void test1() {
		checkpalindrome("dsaodsa");
	}
	
		public boolean checkpalindrome(String s) {
			int n=s.length();
			boolean flag=false;
			int[] ascii=new int[256];
			for (int i = 0; i < s.length(); i++) {
				ascii[s.charAt(i)]++;
			}
			if(ispalindrome(s,n)) {
				flag=true;
			}
			return flag;
			
		}

	
		

	public static boolean ispalindrome(String s, int n) {
		
//		while()
		return false;
	}

}
