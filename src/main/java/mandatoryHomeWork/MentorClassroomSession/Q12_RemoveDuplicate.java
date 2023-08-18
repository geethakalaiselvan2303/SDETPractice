package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;

public class Q12_RemoveDuplicate {
	@Test
	public void test1() {
		removeDuplicate(new int[] {1, 2, 2, 3, 3, 4});
	}
	public int[] removeDuplicate(int[] arr){	
		int[] empty=new int[arr.length];	
		for(int i=0;i<arr.length-1;i++){
		if(arr[i]!=arr[i+1]){
		empty[i]=arr[i];
		}
		}
		System.out.println(Arrays.toString(empty));
		return empty;
}
}