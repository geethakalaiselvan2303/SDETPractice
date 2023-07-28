package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q34_FindPivotIndex {
	
	@Test()
	public void test1() {
		int findPivotIndex = findPivotIndex(new int[] {1,7,3,6,5,6});
		System.out.println(findPivotIndex);
		Assert.assertEquals(3, findPivotIndex);
	
	}
	@Test()
	public void test2() {
		int findPivotIndex = findPivotIndex(new int[] {1,2,3});
		System.out.println(findPivotIndex);
		Assert.assertEquals(-1, findPivotIndex);
	}
	@Test()
	public void test3() {
		int findPivotIndex = findPivotIndex(new int[] {-1,-1,0,0,-1,-1});
		System.out.println(findPivotIndex);
		Assert.assertEquals(0, findPivotIndex);
	}

	public int findPivotIndex(int[] arr) {
		int leftsum=0;
		int rightsum=0;
		int pivotIndex=-1;
		for (int i = 0; i < arr.length; i++) {
			rightsum=rightsum+arr[i];
		}
		for (int j = 0; j <arr.length; j++) {
//			rightsum=rightsum-arr[j];
			if(leftsum==rightsum) {
				pivotIndex= j;
			}
			rightsum=rightsum-arr[j];
			leftsum=leftsum+arr[j];
		}
		return pivotIndex;
	}
	

}
