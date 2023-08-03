package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q56_CalculateMoneyLeetcodeBank {
	//56) https://leetcode.com/problems/calculate-money-in-leetcode-bank/
	
	/* 1. declare the variable days=0 and input n=10
	   2. check for the while condition (count<n) the declare count=0
	   3. check for condition if(days==7) then add the days+1 and count++
	   4. else days++
	   5. return days
	 */
	
	@Test
	public void test1() {
		int result=CalculateMoneyLeetcodeBank(10);
		Assert.assertEquals(37, result);
	}
	@Test
	public void test2() {
		int result=CalculateMoneyLeetcodeBank(4);
		Assert.assertEquals(10, result);
	}
	@Test
	public void test3() {
		int result=CalculateMoneyLeetcodeBank(20);
		Assert.assertEquals(96, result);
	}

	public int CalculateMoneyLeetcodeBank(int n) {
		int amount=0,count=0,saving=0,i=0,days=0;
		while(count<n) {
			saving++;
			amount=amount+saving;  
			count++; 
			days++;
			if(days==7) {
			 saving=i+1;
			 i++;
			 days=0;
			}
		
	}
		System.out.println(amount);
		return amount;
}
}