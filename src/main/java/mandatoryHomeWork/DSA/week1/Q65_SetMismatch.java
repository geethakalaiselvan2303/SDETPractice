package mandatoryHomeWork.DSA.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Q65_SetMismatch {
	
	/*  1. Declare the empty array with size as 2
		2. Sort the given array
		3. Iterate with array and check for the condition 1 and i+1 are equal
		4. If equal the add the duplicate value in the empty array
		5. Then add 1 into duplicate value and added in to the empty array
	 */
	
	@Test
	public void test1() {
		System.out.println(Arrays.toString(setMismatch(new int[] {2,2})));
	}
	 
	public int[] setMismatch(int[] nums) {
		Arrays.sort(nums);  //nlogn
		int[] newArr=new int[nums.length];
		int[] result=new int[2];
		int newArrSum=0,AnrArrSum=0;
		for (int i = 0; i < nums.length; i++) { //o[n]
			newArr[i]=i+1;  
			newArrSum=newArrSum+newArr[i];
		}
		Set<Integer> set = new HashSet<>();  
		for (int i = 0; i <nums.length; i++) { //o[n]
			set.add(nums[i]);
		}
		
		List<Integer> list=new ArrayList<Integer>(set); 
		for (int i = 0; i < set.size(); i++) { //o[n]
			AnrArrSum=AnrArrSum+list.get(i);
		}
				
		for (int i = 1; i < nums.length; i++) { //o[n]
		    if (nums[i] == nums[i - 1]) {
		        result[0] = nums[i];
		}
		result[1] =newArrSum-AnrArrSum;
		
	}
		return result;


	}


}
