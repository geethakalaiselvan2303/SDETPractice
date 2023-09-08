package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class Hack_spaceexplorerMars {
	
	/*  https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true
	 *  1. Iterate with each character and check for if S,O,S not present in the string 
	 *  2. count the not present count and return the count
	 *  time complexity o[n]
	 */
	
	@Test
	public void test1() {
		int spaceexplorerMars = spaceexplorerMars("SOSSOT");
		System.out.println(spaceexplorerMars);
//		Assert.assertEquals(2, 2);
	}

	public int spaceexplorerMars(String s) {
		int count=0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i+=3) { 
			if(ch[i]!='S') {
				count++;
			}
			if(ch[i+1]!='O') {
				count++;
			}
			if(ch[i+2]!='S') {
				count++;
			}

		}
		return count;
	}

}
