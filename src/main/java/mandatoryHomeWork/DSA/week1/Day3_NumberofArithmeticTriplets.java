package mandatoryHomeWork.DSA.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Day3_NumberofArithmeticTriplets {
	
	/*  https://leetcode.com/problems/number-of-arithmetic-triplets/description/
	 *  
	 * 
	 */
	
	@Test
	public void test1() {
		int numberofArithmeticTriplets = numberofArithmeticTriplets(new int[] {0,1,4,6,7,10},3);
		Assert.assertEquals(numberofArithmeticTriplets,2);
	}
	
	@Test
	public void test2() {
		int numberofArithmeticTriplets = numberofArithmeticTriplets(new int[] {4,5,6,7,8,9},2);
		Assert.assertEquals(numberofArithmeticTriplets,2);
	}

	public int numberofArithmeticTriplets(int[] arr, int k) {
		int count=0,left=0,right=1;
		boolean flag=true;
		while(right<arr.length-1) {
		if(arr[right]-arr[left]==k) {
			right++;
			count++;
			flag=true;

			while(flag) {
				if(arr[right]-arr[left]==k*2 && right<arr.length) {
				flag=false;
			}
			else {
				right++;
			}
		}
		}
		else if(arr[right]-arr[left]<k) {
			right++;
		}
		else if(arr[right]-arr[left]>k) {
			left++;
			right=left+1;
		}
		}
		
		return count;
		
	}

}
