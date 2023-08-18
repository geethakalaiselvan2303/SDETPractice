package mandatoryHomeWork.Foundation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

public class Q19_SquaresSortedArray {
	@Test
	public void test1() {
		int[] squaresSortedArray = squaresSortedArray(new int[] {-4,-1,0,3,10});
		Assert.assertEquals(new int[] {0, 1, 9, 16, 100}, squaresSortedArray);
	}
	@Test
	public void test2() {
		int[] squaresSortedArray = squaresSortedArray(new int[] {-7,-3,2,3,11});
		Assert.assertEquals(new int[] {4,9,9,49,121}, squaresSortedArray);
	}

	public int[] squaresSortedArray(int[] arr) {
		int[] arr1=new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=arr[i]*arr[i];
		}
		for (int j = 0; j < arr1.length; j++) {
			for (int k = j+1; k < arr1.length-1; k++) {
				if(arr1[j]>arr1[k]) {
					int temp=arr1[j];
						arr1[j]=arr1[k];
						arr1[k]=temp;
						
					}
			}
			
			}
		System.out.println(Arrays.toString(arr1));
		return arr1;
			
		}
		
	}


