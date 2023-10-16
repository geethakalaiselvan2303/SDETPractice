package mandatoryHomeWork.DSA.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Day1_FirstUniqueCharacterString {
	
	/* https://leetcode.com/problems/first-unique-character-in-a-string/description/
	 * 1. Add the value in the map
	 * 2. Get the single key anf get the index of the character
	 * 3. store the index in the list
	 * 4. sort the list
	 * 5. return the first index value
	 * 		if the values doesn't have <1 the return -1
	 *  
	 *  Time complexity--->Nlog[N]
	 *  Space Complexity--> o[M+N]
	 * 
	 */

	@Test
	public void test1() {
		firstUniqChar("leetcode");
	}

	public int firstUniqChar(String s) {
		int output = -1;
		List<Integer> list = new ArrayList<Integer>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		char ch = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue().equals(1)) {
				ch = entry.getKey();
				list.add(s.indexOf(ch));
			}
		}
		Collections.sort(list);
		if (list.size() < 1) {
			return -1;
		} else {
			output = list.get(0);
		}

		return output;

	}

}
