package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class CheckIfTheSentenceIsPangram {
	
	/*	https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
	 * 	1. create the length array with 128 arr
		2. iterate with each char and make it as 1 for the corresponding
		3. check for condition(>97 and <=122) if arr have the zero's in it
		4. if yes return false else return true
			 * 
	 */

	@Test
	public void test1() {
		boolean checkIfPangram = checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
		Assert.assertEquals(checkIfPangram, true);
	}
	
	@Test
	public void test2() {
		boolean checkIfPangram = checkIfPangram("leetcode");
		Assert.assertEquals(checkIfPangram, false);
	}

	public boolean checkIfPangram(String s) {
		int[] arr = new int[128];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			arr[c] = 1;
		}
		for (int j = 97; j<=122; j++) {
			if (arr[j] == 0) {
				return false;
			}
		}
		return true;
	}
}
