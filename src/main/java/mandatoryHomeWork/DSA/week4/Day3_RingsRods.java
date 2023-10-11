package mandatoryHomeWork.DSA.week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class Day3_RingsRods {
	
	/*  https://leetcode.com/problems/rings-and-rods/
	 *  1. Declare the hashMap with character and set of character
	 *  2. Iterate with given string 
	 *  	assign the odd index as key and even index as value
	 *  3. check or the condition map contains the key already
	 *  		if yes get the key then add the value in the set then put in the map
	 * 			if not add the values in the set and put in the map
	 *  4. Iterate with map and get the entr.getValues()
	 *  5. check for the condition values.size is equal to 3
	 *  	if yes increment count
	 *  6. Return count 
	 */
	
	@Test
	public void test1() {
		System.out.println(countPoints("B0B6G0R6R0R6G9"));
	}

	public int countPoints(String rings) {
		int count=0;
		 Map<Character, Set<Character>> map = new HashMap<>();	
	        Set<Character> set = new HashSet<>();
		for (int i = 0; i < rings.length()-1; i+=2) {
			 char key = rings.charAt(i + 1);
			    char value = rings.charAt(i);
			    if (!map.containsKey(key)) {
			        set.add(value);
			        map.put(key, set);
			    } else {
			        Set<Character> existingSet = map.get(key);
			        existingSet.add(value);
			        map.put(key, existingSet);
			    }
		    }
		System.out.println(map);
		
		for (Map.Entry<Character, Set<Character>> entry : map.entrySet()) {
			Set<Character> value = entry.getValue();
			if(value.size()==3) {
				count++;
			}
			
		}
	  return count;
	}
}
