package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q6_BestTimeBuySellStock {
	
	@Test
	public void test() {
		int buysell = buysell(new int[] {7,1,5,3,6,4});
		System.out.println(buysell);
		Assert.assertEquals(5, buysell);
	}

	public int buysell(int[] prices) {
		int maxprofit=0;
		int buy=prices[0];
		for (int i = 0; i < prices.length; i++) {
			if(buy>prices[i]) {
				buy=prices[i];
			}
			else if(prices[i]-buy>maxprofit){
				maxprofit=prices[i]-buy;
			}
		}
		return maxprofit;
	}

}
