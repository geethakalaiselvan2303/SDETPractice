package mandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q63_SpyNumber {
	
	/*	n=123
		1. Declare the variable sum=0 and product=1
		2. check for the condition whether n>0
		3. use mod to get the remainder for the n
		4. add the remainder with sum
		5. multiply the remainder with product
		6. divide the number/10 to get the quoient and store it in n  
	 */
	@Test
	public void test1() {
		System.out.println(spyNumber(123));
	}
	
	@Test
	public void test2() {
		System.out.println(spyNumber(1124));
	}
	
	@Test
	public void test3() {
		System.out.println(spyNumber(349));
	}

	public boolean spyNumber(int n) {
		int sum=0,product=1,remainder=0;
				while(n>0){
				remainder=n%10;
				sum=sum+remainder;
				product=product*remainder;
				n=n/10;
				}
				if(sum==product){
				return true;
				}
				else 
		return false;
	}

}

