package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Test;

public class RansomNote_HashMap {
	
	/*  https://leetcode.com/problems/ransom-note/description/
	 * 
	 */
	
	@Test
	public void test1() {
		boolean ransomNote = ransomNote("ac","aa");
		System.out.println(ransomNote);
	}

	public boolean ransomNote(String ransomNote, String magazine) {
		ConcurrentHashMap<Character,Integer> map=new ConcurrentHashMap<Character,Integer>();
		int magazineOccurance=0,ransomNoteOccurance=0;
		for (int i = 0; i < magazine.length(); i++) {
			magazineOccurance= map.getOrDefault(magazine.charAt(i), 0);
			ransomNoteOccurance= map.getOrDefault(ransomNote.charAt(i), 0);
			map.put(magazine.charAt(i), magazineOccurance+1);
			map.put(ransomNote.charAt(i), ransomNoteOccurance-1);
		}
			
		
		
//		for (char c1 : ransomNote.toCharArray()) { 
//			map.put(c1, map.getOrDefault(c1, 0)-1);
//			if(map.get(c1)<0) {
//				return false;
//			}
//			}
//		
		return true;
		
	}

}
