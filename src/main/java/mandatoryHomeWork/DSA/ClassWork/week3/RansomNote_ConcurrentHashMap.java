package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class RansomNote_ConcurrentHashMap {
	
	/*  https://leetcode.com/problems/ransom-note/description/
	 * 
	 */
	
	@Test
	public void test1() {
		boolean ransomNote = ransomNote("ac","aa");
		System.out.println(ransomNote);
	}

	public boolean ransomNote(String ransomNote, String magazine) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char c : magazine.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		
		for (char c1 : ransomNote.toCharArray()) { 
			map.put(c1, map.getOrDefault(c1, 0)-1);
			if(map.get(c1)<0) {
				return false;
			}
			}
		
		return true;
		
	}

}
