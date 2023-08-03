package MandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class Reversedigits {
	/*
	 * 1) 122%10=2
	 * 2) declare the temp=0 variable and concat the number
	 * 2) 122/10=12
	 * 
	 */
	@Test
	public void test1() {
		int reversedigit = reversedigit(122);
		Assert.assertEquals(221,reversedigit);
	}

	public int reversedigit(int n) {
		int rem=0;
		String rev="";
		while(n>0){
			rem=n%10;
			rev=rev+rem;
			n=n/10;
		}
		System.out.println(rev);
		return Integer.parseInt(rev);
	}

}
