package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber {
	
	/* 1) Sort  the array and added to list
	 * 2) check for the condition if arr[i]==arr[i+1] 
	 * 3) if yes remove the value from list
	 * 4) get the list.size and -2 from the value
	*/

	public static void main(String[] args) {
		int[] arr=new int[] {100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89,101 };
		Arrays.sort(arr);
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
		}
		System.out.println(list);
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]==arr[i+1]) {
				list.remove(i);
			}
		}
		int n=list.size();
		System.out.println("Second Largest Number : "+ list.get(n-2));
	}

}
