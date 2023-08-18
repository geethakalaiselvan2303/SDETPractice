package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

public class SquareArray {
	
	/* Psedo
		arr=[-4,-1,0,3,10]
		1. Iterate with arr and square the values in the array and store it in same array.
		2. Iterate with the squared arr (i amd j)
		3. check for the condition arr[i]<arr[j]
		4. if yes swap the values
		5. return the arr
	 */

	public static void main(String[] args) {
		int[] arr=new int[] {-7,-3,2,3,11};
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]*arr[i];
			}
		System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
			if(arr[i]<arr[j]){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
			}
			}
			System.out.println(Arrays.toString(arr));
	}

}
