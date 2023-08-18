package mandatoryHomeWork.Foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q2_ArrangingCoins {
	
	/**
	 *  https://leetcode.com/problems/arranging-coins/description/
	 *  1) Input int  take the coins n=8
	 *  2) output int
	 *  3) iterate with index 1 still length
	 *     int temp=0
	 *     take if condition if (temp>=i)
	 *  4) print i  
	 *  8-1 = 7
		7-2 = 5
		5-3 = 2
		2-4 = 0 or negative is failed
	 */
	
	@Test
	public void test1() {
		 int arrangingCoins = ArrangingCoins(10);
		Assert.assertEquals(4, arrangingCoins);
	}
	@Test
	public void test2() {
		 int arrangingCoins = ArrangingCoins(2);
		Assert.assertEquals(1, arrangingCoins);
	}
	public int ArrangingCoins(int n) {
		int count=0;
		for (int i = 1; i <=n; i++) {
			count++;
			n=n-count;
			}
		
	  System.out.println(count);
	  return count;
}
}