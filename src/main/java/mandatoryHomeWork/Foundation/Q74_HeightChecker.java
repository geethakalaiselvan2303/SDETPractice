package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Q74_HeightChecker {
	
	/*  https://leetcode.com/problems/height-checker/description/
	 * 1. Declare count variable
	 * 2. Get the copy of the given array
	 * 3. sort the given arrray
	 * 4. Compare sorted array and actual array
	 * 5. if it's not equal then take the count
	 * 6. return count.
	 * 
	 *  Time complexity-->N[log N]+O[N]==> N[Log N]
	 */
	
	@Test //+ve
	public void test1() {   
		int heightChecker = heightChecker(new int[] {1,1,4,2,1,3});
		Assert.assertEquals(heightChecker, 3);
	}
	
	@Test
	public void test2() { //  -ve 
		int heightChecker = heightChecker(new int[] {1,1,2,3,4,5});
		Assert.assertEquals(heightChecker, 0);
	}
	
	@Test
	public void test3() {    //edge
		int heightChecker = heightChecker(new int[] {});
		Assert.assertEquals(heightChecker, 0);
	}

	public int heightChecker(int[] n) {
		 int count=0;
	        int[] copyN = Arrays.copyOf(n, n.length);   //o(n)
	        Arrays.sort(n);  							// n log n
	        for (int i = 0; i < n.length; i++) {
				if(n[i]!=copyN[i]) {
					count++;
				}
			}
        
        return count;
		
	}

}
