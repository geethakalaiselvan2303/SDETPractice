package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q38_CountPrimes {
	
	/**
	 * 1) count=0
	 * 2) create the boolean prime variable is true
	 * 3) iterate with 2 for loop i an j
	 * 4) check if(i%j==0) if true prime=false;  
	 * 5) count the prime=true and print
	 * 
	 */
	@Test
	public void test1() {
		int countPrimes = countPrimes(10);
		Assert.assertEquals(4, countPrimes);
	}
	@Test
	public void test2() {
		int countPrimes = countPrimes(0);
		Assert.assertEquals(0, countPrimes);
	}
	@Test
	public void test3() {
		int countPrimes = countPrimes(1);
		Assert.assertEquals(0, countPrimes);
	}

	public int countPrimes(int n) {
		int count=0;
		for (int i = 2; i<n; i++) {
			boolean prime=true;
			for (int j = 2; j <i; j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime){
				 count++;
			  }
		}
		System.out.println(count);
		return count;
		
	}

}
