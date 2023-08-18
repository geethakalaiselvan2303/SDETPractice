package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class Q1_NumberOfOccurance {
	@Test
	public void test1() {
		boolean occurances = occurances(new int[] {1,2,2,1,1,3});
		Assert.assertEquals(true, occurances);
	}
	@Test
	public void test2() {
		boolean occurances = occurances(new int[] {2,1,2,3});
		Assert.assertEquals(false, occurances);
	}
	public boolean occurances(int[] n) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i : n) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else
				map.put(i, 1);
	
		}
		Set<Integer> set=new HashSet<Integer>(map.values());
		
		return map.size()==set.size();
		
	}
	
	

}
