package mandatoryHomeWork.Foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q14_ElementInX {
	
	/*	Given an integer array arr, count how many elements x there are, 
   such that x + 1 is also in arr. 
   If there are duplicates in arr, count them separately. 
   
   
   example 1: input = [1, 2, 3]
			  output = 2
			explanation: when x is 1, we see x+1 (2) is present in input
						 when x is 2, we see x+1 (3) is present in input
						 when x is 3, we see x+1 (4) is not present in input
						so no of presence of x+1 is 2
   example 2: input = [1, 1, 3, 3, 5, 5, 7, 7]
			  output = 0
			  explanation: no occurence of x+1 for x
			  
   example 3: input = [1, 1, 2]
			  output = 2
			  explanation: when x is 1, we see x+1 (2) is present in input
						   when x is 1, we see x+1 (2) is present in input
						   when x is 2, we see x+1 (3) is not present in input"

	 * 
	 */
	@Test
	public void test1() {
		int xElements = xElements(new int[] {1, 2, 3});
		Assert.assertEquals(2, xElements);
	}
	
	@Test
	public void test2() {
		int xElements = xElements(new int[] {1, 1, 3, 3, 5, 5, 7, 7});
		Assert.assertEquals(0, xElements);
	}
	
	@Test
	public void test3() {
		int xElements = xElements(new int[] {1, 1, 2});
		Assert.assertEquals(2, xElements);
	}

	public int xElements(int[] arr) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j]+1) {
					count++;
			}
				}
		}
		System.out.println(count);
		return count;
		
	}
}
