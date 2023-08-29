package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class RobotReturntoOrigin {
	@Test
	public void test1() {
		boolean robotReturntoOrigin = RobotReturntoOrigin("LL");
		Assert.assertEquals(robotReturntoOrigin, false);
	}
	
	@Test
	public void test2() {
		boolean robotReturntoOrigin = RobotReturntoOrigin("UD");
		Assert.assertEquals(robotReturntoOrigin, true);
	}

	public boolean RobotReturntoOrigin(String s) {
		int ud=0,lr=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='U') {
				ud++;
			}
			else if(s.charAt(i)=='D') {
				ud--;			
						}
			else if(s.charAt(i)=='L') {
				lr--;
			}
			else if(s.charAt(i)=='R') {
				lr++;
			}
		}
		
		return lr==0 && ud==0;
		
		
	}

}
