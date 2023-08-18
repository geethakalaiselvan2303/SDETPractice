package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class Q31_MissingNumber {
	
	/** 	{3,0,1}
	 * 1)  Declare the variable as num=0
	 * 2) input -->int arr[] 
	 * 3) output--> int 
	 * 3) Sort the array  {0,1,3}
	 * 4) Iterate with for loop <=n
	 * 5) check for the condition if(array[i]!=i)
	 * 		then return the particular index value num=i;
	 * 6) check for the condition if(num==length of the array) the return the length
	 */
	@Test
	public void test1() {
		int missingNumber = MissingNumber(new int[] {3,0,1});
		Assert.assertEquals(2, missingNumber);
	}
	@Test
	public void test2() {
		int missingNumber = MissingNumber(new int[] {0,1});
		Assert.assertEquals(2, missingNumber);
	}
	@Test
	public void test3() {
		int missingNumber = MissingNumber(new int[] {9,6,4,2,3,5,7,0,1});
		Assert.assertEquals(8, missingNumber);
	}
	public int MissingNumber(int[] arr) {
		int num=0;
		int len=arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < len; i++) {
			if(arr[i]!=i) {
				num=i;
			}
		}
		 if (num == 0) {
		    num = len;
		  }
		System.out.println(num);
		return num;
		
		
	}

}
