package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

/* Question: Remove the target element in the array
example 1: input = [2, 3, 3, 4, 5], target=3
                           output = [2, 4, 5]
                           
 */
public class RemoveTargetElement {
	
	/** 1) add the values in the list
	 * 	2) use removeAll method to remove the target value
	 */
	@Test
	public void test1() {
		List<Integer> removeTargetElement = RemoveTargetElement(new int[] {2, 3, 3, 4, 5},3);
		Assert.assertEquals(Arrays.asList(2,4,5),removeTargetElement);
	}

	public List<Integer> RemoveTargetElement(int[] arr, int target) {
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
		list.add(arr[i]);
		}
		if(list.contains(target)){
			list.removeAll(Arrays.asList(target));
			}
		System.out.println(list);
		return list;
	}

}
