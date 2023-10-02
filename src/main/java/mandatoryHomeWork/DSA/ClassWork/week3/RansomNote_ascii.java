package mandatoryHomeWork.DSA.ClassWork.week3;

import org.junit.Test;

public class RansomNote_ascii {
	
	/*  https://leetcode.com/problems/ransom-note/description/
	 * 
	 */
	
	@Test
	public void test1() {
		boolean ransomNote = ransomNote("aa","aab");
		System.out.println(ransomNote);
	}

	public boolean ransomNote(String ransomNote, String magazine) {
		int[] result=new int[26];
		for (int i = 0; i < magazine.length(); i++) {
				result[magazine.charAt(i)-'a']++;
			}
		for (int i = 0; i < ransomNote.length(); i++) {
			result[ransomNote.charAt(i)-'a']--;
			if(result[ransomNote.charAt(i)-'a']<0) {
				return false;
			}
			
		}
		return true;
	}

}
