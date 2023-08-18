package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class FindMaxNumber {
	/* 
	 * 1) declare the max=arr[0]
 * 2) Iterate through the for loop`	`! 
	 * 3) check for the condition if(arr[i]>max) return max
	 */

	@Test
	public void test1() {
		maxNum(new int[] {8,7,0,5,4,3,1,9});
	}

	public void maxNum(int[] arr) {
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			}
		System.out.println(max);
	}
}
