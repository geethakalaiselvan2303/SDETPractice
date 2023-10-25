package mandatoryHomeWork.DSA.week6;

import java.util.Arrays;

import org.junit.Test;

public class Day3_SortColors {
	
	/* https://leetcode.com/problems/sort-colors/description/
	 *  1. Declare the variable as start=0,mid=0,end=arr.length-1;
	 *  2. Check for the condition mid<=end
	 * 	3. if mid is '0' swap the start and middle pointer value
	 *     if mid is '1' only mid++;
	 *     if mid is '2' the swap the mid and end pointer value then end--;
	 *     
	 *     Time complexity--->o[n]
	 *     space Complexity-->o[1]
	 * 
	 */
	
	@Test
	public void test1() {
		sortColors(new int[] {2,0,2,1,1,0});
	}
	
	public void sortColors(int[] arr) {
		int start=0,mid=0,end=arr.length-1;
		while(mid<=end) {
			switch (arr[mid]) {
			case 0:
				swapElement(arr,start,mid);
				start++;
				mid++;
				break;
			case 1:
				mid++;
				break;

			case 2:
				swapElement(arr,mid,end);
				end--;
				break;

			}
		}
    }

	public int[] swapElement(int[] arr, int start, int mid) {
		int temp=arr[start];
		arr[start]=arr[mid];
		arr[mid]=temp;
		return arr;
		
	}

}
