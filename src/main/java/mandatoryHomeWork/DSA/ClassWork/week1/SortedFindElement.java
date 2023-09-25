package mandatoryHomeWork.DSA.ClassWork.week1;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortedFindElement {
	
	@Test
	public void test1() {
		int[] output= {0,3};
		int[] sortedFindElement = sortedFindElement(new int[] {2,3,5,7},9);
		Assert.assertEquals(Arrays.toString(sortedFindElement),Arrays.toString(output));
	}

	public int[] sortedFindElement(int[] arr,int target) {
		int[] result=new int[2];
		int left=0,right=arr.length-1,sum=0;
		while(left<right) {
			sum=arr[left]+arr[right];
			if(sum==target) {
				result[0]=left;
				result[1]=right;
				break;
			}
			else if(sum>target) {
				right--;
			}
			else if(sum<target) {
				left++;
			} 
			
		}
		return new int[] {left,right};
	}

}
