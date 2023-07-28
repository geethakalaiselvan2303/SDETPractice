package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q9_power2 {
	
	/**
	 * 1) Input: int 
		2) Output: boolean
		3) if(n<0) the return false
		4) while(n/2!==0){
			return false
	 */	  
	
	@Test
	public void test1() {
		boolean powerTwo = powerTwo(32);
		Assert.assertEquals(true, powerTwo);
	}
	@Test
	public void test2() {
		boolean powerTwo = powerTwo(10);
		Assert.assertEquals(false, powerTwo);
	}
	@Test
	public void test3() {
		boolean powerTwo = powerTwo(1);
		Assert.assertEquals(true, powerTwo);
	}

	public boolean powerTwo(int n) {
		   if (n <= 0) {
		        return false;
		    }

		    while (n % 2 == 0) {
		        n =n/2;
		    }
		  		   
			return n==1;
		  
		    
		}
}
