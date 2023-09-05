package mandatoryHomeWork.Foundation;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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

public class Q13_DistributeCandies_way3 {
	@Test
	public void text1() {
		Assert.assertEquals(3, candies(new int[] {1,1,2,2,3,3}));
		
	}
	@Test
	public void text2() {
		Assert.assertEquals(2, candies(new int[] {1,1,2,3}));		
	}
	@Test
	public void text3() {
		Assert.assertEquals(1, candies(new int[] {6,6,6,6}));
		
	}

	public int candies(int[] arr) {
		 Arrays.sort(arr);
		 int eatcandies=0;
		 int totalCandiesperday=arr.length/2;		
		 for (int i = 0; i < arr.length; i++) {
				if(arr[i]==arr[i+1]) {
					eatcandies++;
				}
			}
		 if(eatcandies>totalCandiesperday)
			 return totalCandiesperday;
		 else
			 return eatcandies;
		
}}
