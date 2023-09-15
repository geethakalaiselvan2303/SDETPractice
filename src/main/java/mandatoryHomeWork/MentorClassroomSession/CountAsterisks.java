package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class CountAsterisks {

	/* https://leetcode.com/problems/count-asterisks/description/
	 * 1. Declare the verticalBar=0,asterisksCount=0
	 * 2. Iterate with string
	 * 3. check for the condition whether the character is '|'  If yes then verticalBar++;
	 * 4. check for the condition verticalBar%2==0 if yes the asterisksCount++
	 * 
	 * Time Complexity--->o[n] 		
	 * 
	 */
	
	@Test
	public void test1() {
		int countAsterisks = countAsterisks("l|*e*et|c**o|*de|");
		System.out.println(countAsterisks);
	}
	
	@Test
	public void test2() {
		int countAsterisks = countAsterisks("l|*e*et|c|*de|");
		System.out.println(countAsterisks);
	}
	
	@Test
	public void test3() {
		int countAsterisks = countAsterisks("leetcode");
		System.out.println(countAsterisks);
	}
	
	@Test
	public void test4() {
		int countAsterisks = countAsterisks("");
		System.out.println(countAsterisks);
	}

	public int countAsterisks(String s) {
		int verticalBar=0,asterisksCount=0;
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='|')  {
				verticalBar++;
			}
			if(verticalBar%2==0) {
				if(ch[i]=='*') {
					asterisksCount++;
				}
		}
		}
		return asterisksCount;
		
	}
}
