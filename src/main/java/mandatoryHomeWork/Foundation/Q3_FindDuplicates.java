package mandatoryHomeWork.Foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q3_FindDuplicates {
	
	/** https://leetcode.com/problems/contains-duplicate/description/
	 *  1) Input int [] and find number x
	 *  2) output int
	 *  3) data set--> {1, 1, 2, 2, 2, 2, 3}-->2,{-1,-1,0,2,3,4,}-->-1,{1,2,3,4}--> x=0
	 *  	for loop --> if check
	 *  4) check the element is empty
	 *  5) initialize count=0
	 *  6) iterate with each element check if the element present 
	 *  	if present then increase the count by 1
	 *  7) Then print the count	  
	*/
	@Test
	public void positive() {
		int findDuplicateCount = findDuplicateCount(new int[] {1, 1, 2, 2, 2, 2, 3},2);
		Assert.assertEquals(4, findDuplicateCount);
	}
	
	@Test
	public void negative() {
		int findDuplicateCount = findDuplicateCount(new int[] {2, 2, 3},1);
		Assert.assertEquals(0, findDuplicateCount);
	}
	
	@Test
	public void edge() {
		int findDuplicateCount = findDuplicateCount(new int[] {1, 1, -2, 2, 2, 2, 3},2);
		Assert.assertEquals(3, findDuplicateCount);
	}
	
	public int findDuplicateCount(int[] arr, int num) {
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
	
}
