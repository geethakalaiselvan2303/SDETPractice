package mandatoryHomeWork.DSA.ClassWork.week6;

import java.util.Arrays;

public class SortingBubble {

	public static void main(String[] args) {

		int[] n= {3,2,9,5,4,1,8};
		for (int i = 0; i < n.length; i++) {
			for (int j = i+1; j < n.length; j++) {
				if(n[i]>n[j]) {
				int temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
			}
		}
		System.out.println(Arrays.toString(n));
	}

}
