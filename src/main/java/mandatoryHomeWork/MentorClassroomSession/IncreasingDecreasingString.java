package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

public class IncreasingDecreasingString {
	
	/* 1. Declare string builder,and empty array with length 26, n=s.lenght()
	 * 2. Iterate with loop 
	 * 3. increment the charAt with each char value
	 * 4. check for the condition whether n>0
	 * 5. Iterate with loop,starts with zero and end <26 in the empty array 
	 * 6. Then check for the condition whether and empty>0
	 * 		append the value in the stringBuilder then decrement the empty array corresponding position
	 * 		then n--;
	 * 7. Then check for the condition whether and empty>0
	 * 8. Iterate with loop,starts with 25 then  
	 * 		append the value in the stringBuilder then decrement the empty array corresponding position
	 * 		n--
	 * 9. return sb
	 */
	
	@Test
	public void test1() {
		String increasingDecreasingString = increasingDecreasingString("aaaabbbbcccc");
		Assert.assertEquals(increasingDecreasingString, "abccbaabccba");
	}

	public String increasingDecreasingString(String s) {
		int n=s.length();
		StringBuilder sb=new StringBuilder();
		int[] empty=new int[26];
		for (int i = 0; i < s.length(); i++) {
			empty[s.charAt(i)-'a']++;
	    }
		while(n>0) {
			for (int i = 0; i <26; i++) {
				if(empty[i]>0) {
					sb.append((char) (i + 'a'));
					empty[i]--;
					n--;
				}
			}
			for (int i = 25; i>=0; i--) {
				if(empty[i]>0) {
					sb.append((char) (i + 'a'));
					empty[i]--;
					n--;
				}
			}
		}
		return sb.toString();
		
		}
		}
	
		

