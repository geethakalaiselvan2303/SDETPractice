package mandatoryHomeWork.MentorClassroomSession;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class IsomorphicStrings_Way2 {
	
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
	
	/* https://leetcode.com/problems/isomorphic-strings/description/
	 * 1. Declare the map with <charcter,Character>
	 * 2. Iterate with loop woth the length s
	 * 3. Get the ith character for both s(original)-->key and t(replacement)-->value
	 * 4. Check for the condition whether s(original) contains the key in the map 
	 * 5. 	Check for the condition whether t(replacement) contains the value in the map 
	 * 			if not add the original and replacement in the map
	 * 			else return false
	 * 6. check for the condition whether the key is already present in the map 
	 * 7. Then get the value and check if already present in the map
	 * 8. If it not equals then return false 
	 * 
	*/

	public boolean isomorphicStrings(String s, String t) {
		
		if(s.length()!=t.length()){
			return false;
		}
		Map<Character,Character> map=new HashMap<Character,Character>();
		for (int i = 0; i < s.length(); i++) {
			char original = s.charAt(i);
			char replacement = t.charAt(i);
			if(!map.containsKey(original)) {
				if(!map.containsValue(replacement))
					map.put(original, replacement);
				else 
					return false;
			}
				else {
					char checkChar=map.get(original);
					if(checkChar!=replacement) 
						return false;
				}
		}
		return true;
	}
}
