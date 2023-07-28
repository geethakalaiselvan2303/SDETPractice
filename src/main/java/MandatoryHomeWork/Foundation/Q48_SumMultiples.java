package MandatoryHomeWork.Foundation;

import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

public class Q48_SumMultiples {
	// https://leetcode.com/problems/sum-multiples/
	@Test
	public void test1() {
		int sumMultiples = sumMultiples(7);
		Assert.assertEquals(21, sumMultiples);
	}
	@Test
	public void test2() {
		int sumMultiples = sumMultiples(10);
		Assert.assertEquals(40, sumMultiples);
	}
	@Test
	public void test3() {
		int sumMultiples = sumMultiples(9);
		Assert.assertEquals(30, sumMultiples);
	}

	public int sumMultiples(int n) {
		int sum=0;
		int[] arr= {3,5,7};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j <= n; j++) {
				if(j%arr[i]==0) {
					sum=sum+j;
			}
		}
		
	}
		System.out.println(sum);
		return sum;
	}	

}
