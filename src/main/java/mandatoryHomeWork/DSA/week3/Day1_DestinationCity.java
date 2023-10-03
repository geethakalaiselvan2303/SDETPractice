package mandatoryHomeWork.DSA.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Day1_DestinationCity {
	
	/* https://leetcode.com/problems/destination-city/description/
	 * 1. Declare list and set
	 * 2. Add the source to the list and destination to the set
	 * 3. Iterate with list 
	 * 4. Check for the if the list contains the then
	 * 		 remove the values from the set
	 * 5. Convert the set into string and return
	 * 
	 * Time Complexity--->O{N]
	 * Space Complexity--->O{N]
	 * 
	 */
	
	@Test
	public void test1() {
		String destCity = destCity(Arrays.asList(
				   Arrays.asList("B", "C"),
		           Arrays.asList("D", "B"),
		           Arrays.asList("C", "A")));
		System.out.println(destCity);
		
	}
		
	public String destCity(List<List<String>> paths) {
		 List<String> list = new ArrayList<>();
	     Set<String> set = new HashSet<>();
		for (List<String> li : paths) { //O{N]
			list.add(li.get(0));
			set.add(li.get(1));
		}
		int i=0;
		while(i<list.size()) {  //O{N]
			String s = list.get(i);
			if(set.contains(s)) {
				set.remove(s);
			}
			i++;
		}
		
		return set.iterator().next();
		
	}

}
