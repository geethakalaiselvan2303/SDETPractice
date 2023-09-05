package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q16_RemoveTargetElements {
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
		List<Integer> deleteTargetElements = deleteTargetElements(new int[] {1,2,2,3,3},1);
		Assert.assertEquals(Arrays.asList(2,2,3,3),deleteTargetElements);
		
		
	}
	@Test
	public void test2() {
		List<Integer> deleteTargetElements = deleteTargetElements(new int[] {1,2,2},2);
		Assert.assertEquals(Arrays.asList(1),deleteTargetElements);
		
	}

	@Test
	public void test3() {
		List<Integer> deleteTargetElements = deleteTargetElements(new int[] {1,2,8,5},5);
		Assert.assertEquals(Arrays.asList(1,2,8),deleteTargetElements);
	
	} 

	public List<Integer> deleteTargetElements(int[] arr,int target) {
		List<Integer> list=new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);
		}
		for (int i = 0; i < arr.length; i++) {
			if(list.get(i).equals(target)) {
				list.remove(i);
		}
	}
		
		return list ;

}
}