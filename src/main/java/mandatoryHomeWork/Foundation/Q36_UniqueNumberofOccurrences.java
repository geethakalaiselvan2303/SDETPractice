package mandatoryHomeWork.Foundation;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Test;
import org.testng.Assert;

public class Q36_UniqueNumberofOccurrences {
	
	/** https://leetcode.com/problems/unique-number-of-occurrences/description/
	 * 1)convert to map and have the key and value pairs
	 * 2) Get the value also 
	 * 3) put in set
	 * 4) compare the map size and set size
	 * 5) if equal return true else false
	 */
	@Test
	public void test1() {
		boolean uniqueNumberofOccurrences = uniqueNumberofOccurrences(new int[] {1,2});
		Assert.assertEquals(false, uniqueNumberofOccurrences);
	}
	@Test
	public void test2() {
		boolean uniqueNumberofOccurrences = uniqueNumberofOccurrences(new int[] {1,2,2,1,1,3,4,4,4,4});
		Assert.assertEquals(true, uniqueNumberofOccurrences);
	}
	@Test
	public void test3() {
		boolean uniqueNumberofOccurrences = uniqueNumberofOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		Assert.assertEquals(true, uniqueNumberofOccurrences);
	}

	public boolean uniqueNumberofOccurrences(int[] arr) {
		Map<Integer,Integer> map=new HashedMap<Integer,Integer>();
		for (int i : arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}
			else {
				map.put(i, 1);
			}
		}
		System.out.println(map.size());
		Set<Integer> set=new HashSet<>(map.values());
		System.out.println(set.size());
		return set.size()==map.size();
	}
	

}
