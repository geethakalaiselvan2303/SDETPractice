package mandatoryHomeWork.DSA.ClassWork.week6;

import java.util.Arrays;

public class SortingUsingInsertionSort {

	public static void main(String[] args) {

		int[] n= {5,4,1,8,2,6,0};
		for (int i = 1; i < n.length; i++) {
			int j=i-1;
			while(j >= 0 && n[i] < n[j]) {
			  if(n[i]<n[j]) {
				int temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
			  j--;
			  if(j<i) {
				  i--;
			  }
			}
		}
		System.out.println(Arrays.toString(n));
	}

}
