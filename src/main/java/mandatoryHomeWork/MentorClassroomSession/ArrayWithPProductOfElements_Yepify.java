package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

public class ArrayWithPProductOfElements_Yepify {

	public static void main(String[] args) {
		int[] arr= {1,2,3};
		int[] empty=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			int n=1;
			for(int j=0;j<arr.length;j++){
			if(i!=j){
			n=n*arr[j];
			}
		}
			empty[i]=n;
		}
		System.out.println(Arrays.toString(empty));

	}

}
