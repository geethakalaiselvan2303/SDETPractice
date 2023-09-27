package mandatoryHomeWork.DSA.week2;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Return3MaximumProduct {
	
	/*    int input[] = {3,5,8,1,2,0,6,4};
     *    int output[] = {5,6,8}; //Return the 3 numbers which will give maximum product. Can consist of negative numbers too
	 * 	  1. Initialize the variable left=0,right=input.length-1,count=0,product=0,value=1	
	 *    2. Create the array with length 3
	 *    3. Sort the array
	 *    4. Iterate the input < 3 count
	 *    5. compare the first and last index value to find max values
	 *    6. multiply the max value
	 *    7. store it created array and increment the count
	 *    8. return the array
	 *    
	 *    Time Complexity---> N log[N]
	 *    space Complexity---> O[N]
	 *    
	 */
	
	@Test
	public void test1() {
		int[] productOf3MaxNumber = productOf3MaxNumber(new int[] {3,5,8,1,2,0,6,4});
		System.out.println(Arrays.toString(productOf3MaxNumber));
	}
	
	@Test
	public void test2() {
		int[] productOf3MaxNumber = productOf3MaxNumber(new int[] {-11,-12,-13,3,5,8,1,2,0,6,4});
		System.out.println(Arrays.toString(productOf3MaxNumber)); //-13,-12,-11,0,1,2,3,4,5,6,8
	}
	
	public int[] productOf3MaxNumber(int[] input) {
			Arrays.sort(input);
			int[] n=new int[3];
			int left=0,right=input.length-1,count=0,product=0,value=1;
			while(count<3) {
				int max=Math.max(Math.abs(input[left++]), input[right--]);
				product=value*max;
				n[count++]=product;
			}
			return n;

	}

}
