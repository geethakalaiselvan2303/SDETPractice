package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q20_PowerofThree {

	@Test
	public void test1() {
	 isPalindrome("A man, a plan, a canal: Panama");
//		Assert.assertEquals(false, power3);
	}
	

//	public boolean powerThree(int n) {
		public boolean isPalindrome(String s) {
	        String st=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
	        System.out.println(st);
	        String empty="";
	        char[] ch=st.toCharArray();
	        for(int i=ch.length-1;i>=0;i--){
	            empty=empty+ch[i];
	        }
	        System.out.println(empty);
	        return st.equals(empty);
	    }
}
