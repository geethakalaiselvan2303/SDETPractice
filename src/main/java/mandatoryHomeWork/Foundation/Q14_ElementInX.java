package mandatoryHomeWork.Foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q14_ElementInX {
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
