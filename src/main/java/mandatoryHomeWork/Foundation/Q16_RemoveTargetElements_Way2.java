package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q16_RemoveTargetElements_Way2 {
	/* Remove the target element in the array
							
	example 1: input = [2, 3, 3, 4, 5], target=3
			   output = [2, 4, 5]
			   explanation: when 3 is removed from input array, 
							output is [2, 4, 5]
	
	example 2: input = [2, 2], target=2
			   output = []
			   explanation: when 2 is removed, output would be empty array/	
	 * 
	 */
	@Test
	public void text1() {
		int[] deleteTargetElements = deleteTargetElements(new int[] {2, 3, 3, 4, 5},3);
		 Assert.assertArrayEquals(new int[]{2,4,5}, deleteTargetElements);
		
		
	}
	@Test
	public void test2() {
		int[] deleteTargetElements = deleteTargetElements(new int[] {2,2},2);
		 Assert.assertArrayEquals(new int[]{}, deleteTargetElements);
		
	}

	@Test
	public void test3() {
		int[] deleteTargetElements = deleteTargetElements(new int[] {1,2,8,5},5);
		 Assert.assertArrayEquals(new int[]{1,2,8}, deleteTargetElements);
	
	} 

	public int[] deleteTargetElements(int[] arr,int target) {
		int count=0;
		for (int i = 0; i < arr.length; i++) { //o[n2]
			if(arr[i]==target) {
				count++;
			}
		}
		int[] arr2=new int[arr.length-count]; 
		int arr2Index = 0;
		for (int j = 0; j < arr.length; j++) { 
			if(arr[j]!=target) {
				arr2[arr2Index]=arr[j];
				arr2Index++;
			}
		}
		System.out.println(Arrays.toString(arr2));
		return arr2;
		

}
}