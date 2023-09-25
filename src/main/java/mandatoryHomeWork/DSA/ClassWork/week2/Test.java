package mandatoryHomeWork.DSA.ClassWork.week2;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int[] arr= {11,13,17,23,29,31,7,5,2,3};
		int k=3,threshold=5;
		 int sum=0,count=0,pointer=0;
		    while(pointer<k){
	            sum=sum+arr[pointer++];
	           
	        }
	        if(sum/k>=threshold){
	            count++;
	        }
	       
	        while(pointer<arr.length){
	            sum=sum+arr[pointer++]-arr[pointer-k];
	            if(sum/k>=threshold){
	            count++;
	        }
	        }
	        System.out.println(count);
	}

}
