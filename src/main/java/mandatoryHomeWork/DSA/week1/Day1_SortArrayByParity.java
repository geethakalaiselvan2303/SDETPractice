package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;

import org.junit.Test;

public class Day1_SortArrayByParity {
	
	/*  https://leetcode.com/problems/sort-array-by-parity/description
	 *  1. Declare the starting variable left and length as right
	 *  2. iterate with array
	 *  	a. check for the condition left is odd and right is even
	 *  	the swap the element increment the left and decrement right
	 *  	b. check for the condition left is even and right is odd
	 *  		then increment incre left and decrement right
	 *  	c. check for the condition if left and right are odd
	 *  		if yes decrement the right and check again
	 *  	d. check for the condition if left and right are even
	 *  		if yes increment the left and check again
	 *  3. return the arr
	 * 
	 */
	
//	@Test
//	public void test1() {
//		sortArrayByParity(new int[] {3,1,2,4});
//	}
	
//	@Test
//	public void test2() {
//		sortArrayByParity(new int[] {-3,1,-2,4});
//	}
	
//	@Test
//	public void test3() {
//		sortArrayByParity(new int[] {});
//	}
//	
	@Test
	public void test4() {
		sortArrayByParity(new int[] {2,4,6,7,5,1});
	}

	public void sortArrayByParity(int[] arr) { //3,1,2,4
		int left=0,right=arr.length-1;
		while(left<right && left<arr.length) {
			if(arr[left]%2!=0 && arr[right]%2==0 ) {
				int temp=arr[left];
				arr[left]=arr[right];
				arr[right]=temp;
				left++;
				right--;
			}
			else if(arr[left]%2==0 && arr[right]%2!=0 ) {
				left++;
				right--;
			}
			else if(arr[left]%2==0 && arr[right]%2==0 ) {
				left++;
			}
			else if(arr[left]%2!=0 && arr[right]%2!=0 ) {
				right--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
