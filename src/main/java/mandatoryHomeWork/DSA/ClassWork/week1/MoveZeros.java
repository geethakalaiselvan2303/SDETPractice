package mandatoryHomeWork.DSA.ClassWork.week1;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeros {
	
	@Test
	public void test1() {
		int[] arr= {0,1,0,3,12}; 
	}
	
	@Test
	public void test2() {
		int[] arr= {0,1,0,3,12}; 
		int start=0,end=0;
		while(end<arr.length && start<arr.length) {
			if(arr[start]==0 && arr[end]==0) {
				end++;
			}
			else if(arr[end]!=0) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
