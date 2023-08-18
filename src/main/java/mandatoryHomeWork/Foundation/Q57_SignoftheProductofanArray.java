package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q57_SignoftheProductofanArray {
	//https://leetcode.com/problems/sign-of-the-product-of-an-array/
	
	/*  1)declare the variable as result=0
		2)Iterate through loop and get the product of the arr
		3)check for the condtion if(result==0) then return 0
			else if(result>0) the return 1
			else return -1
	 */
	@Test
	public void test1() {
		long signoftheProductofanArray = SignoftheProductofanArray(new int[] {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100});
		Assert.assertEquals(1, signoftheProductofanArray);
	}
	@Test
	public void test2() {
		long signoftheProductofanArray = SignoftheProductofanArray(new int[] {1,5,0,2,-3});
		Assert.assertEquals(0, signoftheProductofanArray);
	}
	@Test
	public void test3() {
		long signoftheProductofanArray = SignoftheProductofanArray(new int[] {-1,1,-1,1,-1});
		Assert.assertEquals(-1, signoftheProductofanArray);
	}
	
	public long SignoftheProductofanArray(int[] arr) {
		long result=1,re=0;
		for (int i = 0; i < arr.length; i++) {
			result=result*arr[i];
		}
		System.out.println(result);
		if(result==0) {
			re=0;
		}
		else if(result>0) {
			re=1;
		}
		else {
			re=-1;
		}
		System.out.println(re);
	return re;
	}
}
