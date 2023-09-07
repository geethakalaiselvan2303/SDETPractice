package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class MatchingTargetWithArray_MakemyTrip {
	
	/* Return 1st and last index of the matching target with array int[] arr= {0,0,0,1,1,1,2,2,3,4,5,5}; 
		int target=1; op:3 & 5  makemytrip Question
 		1. Declare list 
	 *  2. iterate with given array if it's equal to target then add it in to the list
	 *  3. return the list first index value and last index values
	 */
	
	@Test
	public void test1() {
		int[] matchingTargetWithArray = matchingTargetWithArray(new int[] {0,0,0,1,1,1,2,2,3,4,5,5},1);
		System.out.println(Arrays.toString(matchingTargetWithArray));
	}

	public  int[] matchingTargetWithArray(int[] arr, int target) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
		if(arr[i]==target){
		list.add(i);
		}
		}
		int a=list.get(0);
		int b=list.get(list.size()-1);
		int[] result ={a,b};
		return result;

	}
	
	

}
