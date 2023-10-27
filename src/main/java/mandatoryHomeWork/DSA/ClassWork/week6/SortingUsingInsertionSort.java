package mandatoryHomeWork.DSA.ClassWork.week6;

import java.util.Arrays;

public class SortingUsingInsertionSort {

	public static void main(String[] args) {

		int[] arr= {5,4,1,8,2,6,0};
		 int n = arr.length;
	        for (int i = 1; i < n; ++i) {
	            int key = arr[i];
	            int j = i - 1;
	              
	            while (j >= 0 && arr[j] > key) {
	                arr[j + 1] = arr[j];
	                j = j - 1;
	            }
	            arr[j + 1] = key;
	        }
	        System.out.println(Arrays.toString(arr));
	    	
	    }
	
	}


