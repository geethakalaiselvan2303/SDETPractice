package MandatoryHomeWork.Foundation;

import org.junit.Assert;
import org.junit.Test;

public class Q11_Palindrome {
	/***
	 *   pal=0
	 *   n=121
	 *   n=121/10 ==> 12
	 *   sum=n%10 ==> 1
	 *   pal=pal+sum
	 *   
	 */
	@Test
	public void test1() {
		Assert.assertEquals(true, PalidromeOrNot(121));
	}
	@Test
	public void test2() {
		Assert.assertEquals(false, PalidromeOrNot(123));
	}

	public boolean PalidromeOrNot(int n) {
		int rev=0,remainder;
		int b=n;
		while(n>0) {
			remainder=n%10;
			rev=rev*10+remainder;
			n=n/10;			
		}	
		if(rev==b) {
			return true;		 }
		 else
			 return false;
	}

	
	}

