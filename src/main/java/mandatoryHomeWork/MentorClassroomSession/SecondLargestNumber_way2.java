package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestNumber_way2 {

	public static void main(String[] args) {
		int result=0;
		int[] arr = new int[] {4,3,1,202,100,85,2,122,200};
		int temp = arr[0];
		int temp1 = arr[0];
		int rev = 0;
		for (int i = 1; i < arr.length; i++) {
			if (temp<arr[i]) {
				temp1=temp;
				temp=arr[i];
			}
			else if(arr[i]>temp1) {
				temp1 = arr[i];
				}
			}
		System.out.println(temp1);
	}

}
