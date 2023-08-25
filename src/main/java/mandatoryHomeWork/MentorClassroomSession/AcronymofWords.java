package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AcronymofWords {
	
	/*https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/*/
	
	/* 	1. Spilit the words into an string (split[])
		2. Then get the first character from split[] 
		3. compare the first character from split[0] with first character from s[0] 
		4. if yes return true
	 */
			
	
	@Test
	public void test1() {
		acronymofWords(Arrays.asList("alice","bob","charlie"),"abc");
	}

	public boolean acronymofWords(List<String> list, String s) {
		 if (list.size()!=s.length()) return false;
	        for (int i=0;i<s.length();i++){
	            if (s.charAt(i)!=list.get(i).charAt(0)) return false;
	        }
	        return true; 
		
	} 
	
}