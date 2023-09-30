package mandatoryHomeWork.Foundation;

import org.junit.Test;

public class Primenumber {
	
	/**
	 * 1) input : 
	 * 2) output :
	 */
	@Test
	public void test1() {
		findprime(17);
	}
	@Test
    public void test2() {
    	findprime(15);
	}
    
    public void findprime(int n) {
    	boolean prime=true;
    	for (int i = 2; i < n; i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
    	}
    	if(prime==true)
    		System.out.println("prime");
    	else
    		System.out.println("Not prime");
    	
    }

}
