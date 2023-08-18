package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q30_JewelsAndStones {
   
	@Test
	public void test1() {
		int jewelsAndStones = jewelsAndStones("aA","aAAbbbb");
		Assert.assertEquals(3, jewelsAndStones);
	}
	@Test
	public void test2() {
		int jewelsAndStones = jewelsAndStones("z","ZZ");
		Assert.assertEquals(0, jewelsAndStones);
	}

	public int jewelsAndStones(String jewels, String stones) {
		int count=0;
		for (int i = 0; i < jewels.length(); i++) {
			for (int j = 0; j < stones.length(); j++) {
				if(jewels.charAt(i)==stones.charAt(j)) {
					count=count+1;
				}
			}
		}
		System.out.println(count);
		return count;
		
	}
}
