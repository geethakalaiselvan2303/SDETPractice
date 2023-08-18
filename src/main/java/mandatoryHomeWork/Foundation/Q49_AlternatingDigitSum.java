package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q49_AlternatingDigitSum {
	//https://leetcode.com/problems/alternating-digit-sum/
	@Test
	public void test1() {
		int alternatingDigitSum = alternatingDigitSum(521);
		Assert.assertEquals(4, alternatingDigitSum);
	}
	@Test
	public void tes2() {
		int alternatingDigitSum = alternatingDigitSum(111);
		Assert.assertEquals(1, alternatingDigitSum);
	}
	@Test
	public void test3() {
		int alternatingDigitSum = alternatingDigitSum(886996);
		Assert.assertEquals(0, alternatingDigitSum);
	}

	public int alternatingDigitSum(int n) {
		int sum =0;
		String st = Integer.toString(n);
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int digit = Character.getNumericValue(ch[i]);
			if(i%2==0) {
				sum=sum+digit;
			}
			else
				sum=sum-digit;
		}
		System.out.println(sum);
		return sum;
		
	}

}
