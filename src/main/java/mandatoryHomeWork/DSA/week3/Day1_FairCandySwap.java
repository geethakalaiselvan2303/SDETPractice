package mandatoryHomeWork.DSA.week3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Day1_FairCandySwap {
	
	/* https://leetcode.com/problems/fair-candy-swap/description/
	 * 1. Declacre the set
	 * 2. Add the alice array and get sum1
	 * 3. Add bobie array and get sum2 and the values also in the set
	 * 4. Find the difference using the (sum2-sum1)/2
	 * 5. Iterate with alice and take the first value, added the value with differnce value(output)
	 * 6. Check for the condition whether bobie contains the output values
	 * 7. if yes print the alice and bobies in the array
	 * 
	 * Time Complexity--->
	 * Space Complexity--->
	 * 
	 */
	
	@Test
	public void test1() {
		fairCandySwap(new int[] {1},new int[] {3,2});
	}

	public  int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		
		int aSum = 0, bSum = 0;
        for (int a : aliceSizes) {
            aSum += a;
        }

        Set<Integer> set = new HashSet<>();
        for (int b : bobSizes) {
            set.add(b);
            bSum += b;
        }
        int diff = (bSum - aSum) / 2;   //4/2=2
        for (int a : aliceSizes) { 
            int targetBobSize = a + diff; //1+2
            if (set.contains(targetBobSize)) {
                return new int[]{a, targetBobSize};
            }
        }
        return null; 
	}
	
	

}
