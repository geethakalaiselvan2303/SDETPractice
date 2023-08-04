package MandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class MissingNumbers_withoutSorting {
	
	/**
	 *  1. Sort the given array and iterate with given arr[]
	 *  2) check for the condition if(arr[i]!=i) then return the value
	 */
	
	@Test
	public void test1() {
		int missingNumber = missingNumber(new int[] {1,2,3,4});
		Assert.assertEquals(5, missingNumber);
	}
	public int missingNumber(int[] arr){
		int n=0,sum=0,result;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			n++;
		}
		n=n+1;
		int formula=n*(n+1)/2; 
		result=formula-sum;
		System.out.println(result);
		return result;
	}
}
