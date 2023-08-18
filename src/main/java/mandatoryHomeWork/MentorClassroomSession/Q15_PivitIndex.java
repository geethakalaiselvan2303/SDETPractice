package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class Q15_PivitIndex {
	
	@Test
	public void test1() {
		System.out.println(pivotIndex(new int[] {1,7,3,6,5,6}));
	}
	
	@Test
	public void test2() {
		System.out.println(pivotIndex(new int[] {1,2,3}));
	}
	
	@Test
	public void test3() {
		System.out.println(pivotIndex(new int[] {2,1,-1}));
	}

	public int pivotIndex(int[] arr) {
		int left=0,right=0,pivot=-1;
		for (int i=0;i<arr.length;i++){
		right=right+arr[i];
		}
		for (int i=0;i<arr.length;i++)
		{
		right=right-arr[i];
		if(left==right){
			pivot=i;
		}
		left=left+arr[i];
		
		}
		return pivot;
	}
}
