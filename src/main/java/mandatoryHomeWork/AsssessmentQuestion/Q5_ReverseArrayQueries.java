package mandatoryHomeWork.AsssessmentQuestion;

import java.util.Arrays;
import java.util.List;

public class Q5_ReverseArrayQueries {
	
	/* arr = [5, 2, 5, 1] operation=((1,2),(1,1))
		(1,2)==> arr=5,5,2,1
		(1,2)==> arr=5,5,2,1
	 * 
	 */

	public static void main(String[] args) {
		 List<List<Integer>> operations = Arrays.asList(
	                Arrays.asList(0, 9),
	                Arrays.asList(4, 5),
	                Arrays.asList(3, 6),
	                Arrays.asList(2, 7),
	                Arrays.asList(1, 8),
	                Arrays.asList(0, 9));
		 int[] arr= {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		 for (List<Integer> list : operations) {
	            int left = list.get(0);
	            int right = list.get(1);
	            while(left<right) {
	            	int temp=arr[left];
	            	arr[left]=arr[right];
	            	arr[right]=temp;
	            	left++;
	            	right--;
	            }
			
		}
		 System.out.println(Arrays.toString(arr));
		 }
	
	

}
