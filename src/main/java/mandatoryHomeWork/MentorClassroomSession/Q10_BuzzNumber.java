package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class Q10_BuzzNumber {
	/*
	 * 7. n=35
		1.divide the number quo=n/10, rem=n%10
		2.check for the condition if quo=0 or rem=7
		3.if yes return true
			else false
	 */
	
	@Test
	public void test1() {
		boolean buzznumber = buzznumber(107);
		System.out.println(buzznumber);
	}
	@Test
	public void test2() {
		boolean buzznumber = buzznumber(35);
		System.out.println(buzznumber);
	}
	@Test
	public void test3() {
		boolean buzznumber = buzznumber(99);
		System.out.println(buzznumber);
	}
	public boolean buzznumber(int n) {
		if(n==0) {
			return false;
		}
		int rem=n%10;
		int quo=n%7;
		return rem==7 || quo==0;
	}
}
