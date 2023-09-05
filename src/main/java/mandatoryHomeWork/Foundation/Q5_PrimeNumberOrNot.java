package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q5_PrimeNumberOrNot {
	//Check if the given number is prime or not
	@Test
	public void test1() {
		Assert.assertEquals(true, findprime(17));
	}
	@Test
    public void test2() {
		Assert.assertEquals(false, findprime(15));
  	}
 
    public boolean findprime(int n) {
    	boolean prime=true;
    	for (int i = 2; i < n; i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
}
}