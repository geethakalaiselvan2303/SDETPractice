package MandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class MissingNumbers {
	
	/**
	 *  1. Sort the given array and iterate with given arr[]
	 *  2) check for the condition if(arr[i]!=i) then return the value
	 */
	
	@Test
	public void test1() {
		int missingNumber = missingNumber(new int[] {1,2,3,5});
		Assert.assertEquals(4, missingNumber);
	}

	
	public int missingNumber(int[] arr){
		
		int value=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
		if(arr[i]!=i+1){ 
			value=i+1;
			break;
		}
	}
		return value;
	}
}
