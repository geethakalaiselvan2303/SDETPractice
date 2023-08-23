package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;

import org.junit.Test;

public class Q66_ArrayPartition {
	
	/* 1. Sort the array and declare the variable maxSum=0
	 * 2. check for the condition whether the index value mod 2 not equal to zero
	 * 3. if yes add the arr value + maxSum
	 * 4. return sum
	 */
	
	@Test
	public void test1() {
		System.out.println(ArrayPartition(new int[] {1,4,3,2}));
	}
	// n[logn] + o[n] == n[logn]
	public int ArrayPartition(int[] arr) {
		int maxSum=0; //n[logn]
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) { // o[n]
			if(i%2==0) {
				maxSum=maxSum+arr[i];
			}
		}
		return maxSum;
	}

}
