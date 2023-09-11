package mandatoryHomeWork.AsssessmentQuestion;

import org.junit.Test;
import org.testng.Assert;

public class Q1_UDRL {
	
	/* 1. Declare UD=0,RL=0;
	 * 2. Iterate with each character 
	 * 3. check for the condition 
	 		*if 'U' then UD++ 
	 		*if 'D' then UD-- 
	 		*if 'R' then RL++ 
	 		*if 'L' then RL-- 
	 	4. add the RL and UD and minus from the string length 
	 	5. return the result
	 	
	 	Time Complexity---> o[n]
	 * 
	 */
	
	@Test
	public void test1() {
		int upDownRightLeft = upDownRightLeft("RUDRL");
		Assert.assertEquals(upDownRightLeft, 4);
	}
	
	@Test
	public void test2() {
		int upDownRightLeft = upDownRightLeft("URDR");
		Assert.assertEquals(upDownRightLeft, 2);
	}

	public int upDownRightLeft(String s) {
		int UD=0,RL=0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='U') {
				UD++;
			}
			else if(ch[i]=='D') {
				UD--;			
						}
			else if(ch[i]=='L') {
				RL--;
			}
			else if(ch[i]=='R') {
				RL++;
			}
		}
		int result=s.length()-(RL+UD);
		return result;
	}

}
