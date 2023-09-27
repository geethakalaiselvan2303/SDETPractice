package mandatoryHomeWork.DSA.week2;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Return3MaximumProduct {
	
	@Test
	public void test1() {
		int[] productOf3MaxNumber = productOf3MaxNumber(new int[] {3,5,8,1,2,0,6,4});
		System.out.println(Arrays.toString(productOf3MaxNumber));
	}
	
	@Test
	public void test2() {
		int[] productOf3MaxNumber = productOf3MaxNumber(new int[] {-11,-12,3,5,8,1,2,0,6,4});
		System.out.println(Arrays.toString(productOf3MaxNumber));
	}
	
	public int[] productOf3MaxNumber(int[] input) {
		
		Arrays.sort(input); 
	    int n = input.length;
		int product1 = input[n - 1] * input[n - 2] * input[n - 3];
	    int product2 = input[0] * input[1] * input[n - 1];
	    
	    if (product1 > product2) {
	        return new int[]{input[n - 1], input[n - 2], input[n - 3]};
	    } else {
	        return new int[]{input[0], input[1], input[n - 1]};
	    }


	}

}
