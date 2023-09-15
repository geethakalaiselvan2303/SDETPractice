package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class NewYearChaos_Way2 {

	/*
	 * https://www.hackerrank.com/challenges/new-year-chaos
	 * 1. Iterate with last index of the list
	 * 2. check for the condition whether arr[i-1]=i+1
	 * 		if yes increase bribes count++
	 * 		swap the element
	 * 3.check for the condition whether arr[i-2]=i+1
	 *    	if yes increase bribes count++
	 * 		swap the element
	 * 4.check for the condition whether bribes count>2
	 * 		return as "Too chaotic"
	 * 		break the loop
	 *   
	 *  Time Complexity--->o[n2]   
	 */

	@Test
	public void test1() {
		newYearChaos(Arrays.asList(1,2,5,3,7,8,6,4));
	}

	public void newYearChaos(List<Integer> list) {
		int bribes=0;
		int[] arr=new int[list.size()];
		for (int i = 0; i <arr.length ; i++) {
			arr[i]=list.get(i);
		}
		
		for (int j = arr.length-1; j >0 ; j--) {
			if(arr[j]!=j+1) {
			if(arr[j-1]==j+1) {
				bribes=bribes+1;
				swapValues(arr, j - 1, j);
			}
			else if(arr[j-2]==j+1){
				bribes=bribes+2;
				swapValues(arr, j - 2, j);
				swapValues(arr, j - 2, j-1);
				
			}
			else {
				System.out.println("Too chaotic");
				return;
			}
		}
		}	
			System.out.println(bribes);
		}
	
		
		public int[] swapValues(int[] arr, int index1, int index2) {
			int temp=arr[index1];
			arr[index1]=arr[index2];
			arr[index2]=temp;
			return arr;
			
				

	}

}
