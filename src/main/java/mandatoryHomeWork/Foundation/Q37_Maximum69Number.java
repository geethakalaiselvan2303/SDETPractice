package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Q37_Maximum69Number {
	
	/**
	 * 1) convert the int to string
	 * 2) store it in char[]
	 * 3) iterate with for loop
	 * 
	 */
	@Test
	public void test1() {
		int maximum69Number = maximum69Number(9669);
		Assert.assertEquals(9969, maximum69Number);
	}
	@Test
	public void test2() {
		int maximum69Number = maximum69Number(9996);
		Assert.assertEquals(9999, maximum69Number);
	}
	@Test
	public void test3() {
		int maximum69Number = maximum69Number(9999);
		Assert.assertEquals(9999, maximum69Number);
	}

	public int maximum69Number(int num) {
		 String str = Integer.toString(num);
	        char[] charArray = str.toCharArray();
	        for (int i = 0; i < charArray.length; i++) {
	            if (charArray[i] == '6') {
	                charArray[i] = '9';
	                return Integer.parseInt(String.valueOf(charArray));
	            }
	        }
	        return num;
		
		
	}
}
