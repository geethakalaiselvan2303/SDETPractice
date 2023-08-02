package MandatoryHomeWork.Foundation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

public class Q55_AlternatingDigitSum {
	
	// https://leetcode.com/problems/alternating-digit-sum/description/
	
	/**
	 * 1) Create the variable as sum=0
	 * 1) convert the interger to string
	 * 2) Create the int[] digit[st.length]
	 * 3) Iterate through the sting array
	 * 4) convert the each character as number using Character.getNumerricValue()
	 * 5) check for the condition if(i%2==0) then sum=sum+digit[i]
	 * 6) else then sum=sum-digit[i]
	 */
	@Test
	public void test1() {
		int alternatingDigitSum = AlternatingDigitSum(521);
		Assert.assertEquals(4, alternatingDigitSum);
	}
	@Test
	public void test2() {
		int alternatingDigitSum = AlternatingDigitSum(111);
		Assert.assertEquals(1, alternatingDigitSum);
	}
	@Test
	public void test3() {
		int alternatingDigitSum = AlternatingDigitSum(886996);
		Assert.assertEquals(0, alternatingDigitSum);
	}

	public int AlternatingDigitSum(int n) {
		int sum=0;
		String st = Integer.toString(n);
		int[] digit=new int[st.length()]; // 5 2 1
		for (int i = 0; i < digit.length; i++) {
			digit[i]=Character.getNumericValue(st.charAt(i));
			if(i%2==0) {
				sum=sum+digit[i];
			}
			else {
				sum=sum-digit[i];
			}
				
		} 
		System.out.println(sum);
		return sum;
	}

}
