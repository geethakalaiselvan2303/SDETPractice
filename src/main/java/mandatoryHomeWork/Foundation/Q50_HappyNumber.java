package mandatoryHomeWork.Foundation;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Q50_HappyNumber {
	
	// https://leetcode.com/problems/happy-number/
	@Test
	public void test1() {
		happyNumber(19);
	}

	public boolean happyNumber(int n) {
		 Set<Integer> inLoop = new HashSet<Integer>();
		    int squareSum,remain;
			while (inLoop.add(n)) {
				squareSum = 0;
				while (n > 0) {
				    remain = n%10;
					squareSum += remain*remain;
					n /= 10;
				}
				if (squareSum == 1)
					return true;
				else
					n = squareSum;

			}
			return false;
		 
		
	}

}
