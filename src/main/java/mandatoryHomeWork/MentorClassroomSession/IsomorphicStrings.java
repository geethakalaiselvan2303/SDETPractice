package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

public class IsomorphicStrings {
	
	/* https://leetcode.com/problems/isomorphic-strings/description/
	 * 1. create 2 array with length 256
	 * 2. iterate with each character then store i+1 in the 2 arrays(arr_s,arr_t)
	 * 3. check for the condition whether 2 arrays(arr_s,arr_t) are not equal 
	 * 4. if yes false else true
	*/
	
	@Test
	public void test1() {
		boolean isomorphicStrings = isomorphicStrings("egg","add");
		Assert.assertEquals(isomorphicStrings, true);
	}
	
	@Test
	public void test2() {
		boolean isomorphicStrings = isomorphicStrings("foo","bar");
		Assert.assertEquals(isomorphicStrings, false);
	}
	
	@Test
	public void test3() {
		boolean isomorphicStrings = isomorphicStrings("badc","kikp");
		Assert.assertEquals(isomorphicStrings, false);
	}
	
	public boolean isomorphicStrings(String s, String t) {
		int[] arr_s=new int[256];
		int[] arr_t=new int[256];
		for (int i = 0; i < s.length(); i++) {
		
		if(arr_s[s.charAt(i)]!=arr_t[t.charAt(i)]) {
			return false;
		}
		else {
			int index_s=(int)s.charAt(i);
			int index_t=(int)t.charAt(i);
			arr_s[index_s]=i+1;
			arr_t[index_t]=i+1;
		}	
		}
		
	return true;
	}
}
