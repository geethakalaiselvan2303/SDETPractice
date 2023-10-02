package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.bson.assertions.Assertions;
import org.junit.Test;
import org.testng.Assert;

public class AnagramUsingHashMap {
	
	@Test
	public void test1() {
		boolean findAnngarm = findAnngarm("anagram","nagaram");
		Assert.assertEquals(findAnngarm, true);
	}
	
	@Test
	public void test2() {
		boolean findAnngarm = findAnngarm("rat","car");
		Assert.assertEquals(findAnngarm, false);
	}

	public boolean findAnngarm(String s, String t) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for (char c : s.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		for (char c1 : t.toCharArray()) {
			if(map.containsKey(c1)) {
				map.put(c1, map.get(c1)-1);
			}
			
			else {
				map.put(c1, 1);
			}
			if(map.get(c1)==0)	{
				map.remove(c1);
			}
			}
		
		return map.isEmpty();
		
		
		
	}

	
}
