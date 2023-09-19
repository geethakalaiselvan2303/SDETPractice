package mandatoryHomeWork.DSA.week1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Day1_SubstringsOfSizeThreeWithDistinctCharacters_Way2 {

	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 * 
	 */

	@Test
	public void test1() {
		SubstringsOfSizeThreeWithDistinctCharacters("xyzzaz");
	}
	
	@Test
	public void test2() {
		SubstringsOfSizeThreeWithDistinctCharacters("aababcabc");
	}

	public int SubstringsOfSizeThreeWithDistinctCharacters(String s) {
		List<Character> list = new ArrayList<Character>();
        int pointer = 0, count = 0;
        
        // Make sure the input string has at least 3 characters
        if (s.length() < 3) {
            return 0;
        }

        while (pointer < 3) {
            list.add(s.charAt(pointer++));
        }

        if (isCheck(list)) {
            count++;
        }

        while (pointer < s.length()) {
            list.remove(0);
            list.add(s.charAt(pointer++));
            if (isCheck(list)) {
                count++;
            }
        }
        return count;
    }

    public boolean isCheck(List<Character> list) {
        Set<Character> set = new HashSet<Character>(list);
        return set.size() == 3;
    }
}


