package mandatoryHomeWork.Foundation;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/** https://leetcode.com/problems/distribute-candies/description/
 * 1) Input int array
 * 2) output int
 * 3) initialize eatcandies=0 totalCandiesperday=array.length/2
 * 3) use the map concept and use the key and value pair
 * 4) Iterate through map using if(entry.getValue()>=1)
 * 5) Iterate through each value and check if(eatcandies<totalCandiesperday)
 * 6)  
 *
 */

public class Q13_DistributeCandies_way2 {
//	@Test
//	public void text1() {
//		Assert.assertEquals(3, candies(new int[] {1,1,2,2,3,3}));
//		
//	}
	@Test
	public void text2() {
		Assert.assertEquals(2, candies(new int[] {1,1,2,3}));		
	}
//	@Test
//	public void text3() {
//		Assert.assertEquals(1, candies(new int[] {6,6,6,6}));
//		
//	}

	public int candies(int[] arr) {
		 int totalCandiesperday=arr.length/2;
		 Set<Integer> set=new HashSet<>();
		 for (int i : arr) {
			set.add(i);
		 }
		if(totalCandiesperday<=set.size()) {
			 System.out.println(totalCandiesperday);
			 return totalCandiesperday;}
		else {
			System.out.println(set.size());
			return set.size();}
}}
