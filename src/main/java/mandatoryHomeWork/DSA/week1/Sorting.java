package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;

public class Sorting {
		
	//O[m*n]
	
	public static void main(String[] args) {
		int[] arr=new int[] {67,65,23,56,87,98,90,34}; 
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					count++;
				}
			}
			count++;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

}
