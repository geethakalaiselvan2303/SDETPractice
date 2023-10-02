package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.HashMap;
import java.util.Map;

import org.bson.assertions.Assertions;
import org.junit.Test;
import org.testng.Assert;

public class AnagramUsingHashMap_Way2 {
	
	@Test
	public void test1() {
		boolean findAnngarm = findAnngarm("rat","car");
		Assert.assertEquals(findAnngarm, false);
	}

	public boolean findAnngarm(String s, String t) {
		Map<Character, Integer> map1 = anagram(s);
		Map<Character, Integer> map2 = anagram(t);
		return map1.equals(map2);
		
	}

	public static Map<Character, Integer> anagram(String s) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		return map;
	}

}
