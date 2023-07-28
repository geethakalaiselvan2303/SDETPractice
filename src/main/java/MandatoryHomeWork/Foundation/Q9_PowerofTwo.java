package MandatoryHomeWork.Foundation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

public class Q9_PowerofTwo {
	
	/**
	 *  
	 */
	@Test
	public void test1() {
		boolean powerTwo = powerTwo(16);
		Assert.assertEquals(true, true);
	}
	@Test
	public void test2() {
		boolean powerTwo = powerTwo(10);
		Assert.assertEquals(false, false);
	}
	@Test
	public void test3() {
		boolean powerTwo = powerTwo(1);
		Assert.assertEquals(true, true);
	}

	public boolean powerTwo(int n) {
		for (int i = 0; i < n/2; i++) {
			if(n==1)
				return true;
			if(Math.pow(2,i)==n){
					return true;
			}
		}
		return false;
			
	
	}

	
}