package mandatoryHomeWork.MentorClassroomSession.Mentor_DSA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class LongestSubString {
	
	/* https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
	 * 1. Declare the set
	 * 2. declare the left and right pointer ad 0
	 * 3. Iterate with each character 
	 * 4. If the set not contains the character then add the character into the set the increment the right pointer
	 * 5. If set already contains the character the remove then increment the left pointer
	 * 6. Each iteration calculate the substring length
	 * 
	 */
	
	@Test
	public void test1() {
		lengthOfLongestSubstring("abcabcbb");
	}

	public int lengthOfLongestSubstring(String s) {
		int left=0,right=0,maxLength=0;
		int[] n=new int[256];
		while(right<s.length()) {
			n[s.charAt(right)]++;
			while(n[s.charAt(right)]>1) {
				n[s.charAt(left)]--;
				left++;
			}
			maxLength=Math.max(maxLength, right-left+1);
			right++;
		}
		System.out.println(maxLength);
		return maxLength;
		
		
	}
	

		



}