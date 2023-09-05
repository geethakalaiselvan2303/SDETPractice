package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Q69_StringIsanAcronymofWords
 {
	
	/* https://leetcode.com/problems/isomorphic-strings/description/
	 * 1. Iterate with each string array 
	 * 2. Get the index of the each words index position and compare with s
	 * 3. if both are equals the return true
	 * 
	 */
	
	@Test
	public void test1() {
		System.out.println(stringIsanAcronymofWords(Arrays.asList("alice","bob","eharlie"),"abc"));
	}

	public boolean stringIsanAcronymofWords(List<String> words, String s) {
		if(words.size()!=s.length()) return false;
		for (int i = 0; i < words.size(); i++) {
			String st = words.get(i);
			if(st.charAt(0)!=s.charAt(i)) {
				return false;
			}
		}
			
		return true;
        
	}

}
