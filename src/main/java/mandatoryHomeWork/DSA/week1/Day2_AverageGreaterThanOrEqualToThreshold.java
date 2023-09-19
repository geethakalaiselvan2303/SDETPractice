package mandatoryHomeWork.DSA.week1;

import org.junit.Test;
import org.testng.Assert;

public class Day2_AverageGreaterThanOrEqualToThreshold {

	/*  https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
	 *  1. Initialize count variable
	 *  2. Iterate with array with the length of k 
	 *  	a. first take the sum of k length 
	 *  		check for the condition avg is greater than or equal to the threshold
	 *  		if yes increment the count
	 *  	b. check for the condition pointer is less than the arr length
	 *  	    if yes add the current index value and remove the first index value
	 *  		calculate the average if it's greater than or equal to the threshold	 
	 *  	    if yes increment count 
	 *  3. return the count
	 *  
	 *  Time Complexity-----> o[n]
	 */
	@Test
	public void test1() {
		int averageGreaterThanOrEqualToThreshold = averageGreaterThanOrEqualToThreshold(new int[] {2,2,2,2,5,5,5,8},3,4);
		Assert.assertEquals(3, averageGreaterThanOrEqualToThreshold);
	}
	
	@Test
	public void test2() {
		int averageGreaterThanOrEqualToThreshold = averageGreaterThanOrEqualToThreshold(new int[] {11,13,17,23,29,31,7,5,2,3},3,5);
		Assert.assertEquals(6, averageGreaterThanOrEqualToThreshold);
	}
	@Test
	public void test3() {
		int averageGreaterThanOrEqualToThreshold = averageGreaterThanOrEqualToThreshold(new int[] {},3,5);
		Assert.assertEquals(0, averageGreaterThanOrEqualToThreshold);
	}

	public int averageGreaterThanOrEqualToThreshold(int[] arr, int k, int threshold) {
		int count=0,pointer=0,sum=0;
		if(arr.length<k) {
			return 0;
		}
		while(pointer < k)
			 sum=sum+arr[pointer++];
		
		if(sum/k>=threshold) {
			count++;
		}
		while(pointer<arr.length) { 
			int minus=arr[pointer-k];//7-3
			sum=sum+arr[pointer++]-minus;
			if(sum/k>=threshold) {
				count++;
			}
		}
		
		return count;
		
	}
}
