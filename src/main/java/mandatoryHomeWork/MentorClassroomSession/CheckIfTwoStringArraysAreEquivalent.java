package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class CheckIfTwoStringArraysAreEquivalent {
	
	/*  Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
		Output: true
	 * 
	 * 
	 * 1. If length is 1 then assign the concat
		Iterate with word1 and concat1
		2. If length is 1 then assign the concat
			Iterate with word2 and concat2
		3. compare concat1 and concat1
	 * 
	 */
	
	@Test
	public void test1() {
		boolean arrayStringsAreEqual = arrayStringsAreEqual(new String[] {"a", "cb"},new String[] {"ab", "c"});
		Assert.assertEquals(arrayStringsAreEqual, true);;
	}

	 public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String concat1="",concat2="";
		if(word1.length>1) {
			for (int i = 0; i < word1.length; i++) {
				concat1=concat1+word1[i];
			}
		}
		else {
			concat1=word1[0];
		}
		
		if(word2.length>1) {
			for (int i = 0; i < word2.length; i++) {
				concat2=concat2+word2[i];
			}
		}
		else {
			concat2=word2[0];
		}
		
		return concat1.equals(concat2);
		
	}

}
