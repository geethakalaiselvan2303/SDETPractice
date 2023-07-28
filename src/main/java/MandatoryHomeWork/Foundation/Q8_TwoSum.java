package MandatoryHomeWork.Foundation;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
//
//import org.juit.Assert;

public class Q8_TwoSum {
	
	 @Test
	    public void test1() {
	        int[] twoSumIndex = twoSumIndex(new int[]{2, 7, 11, 15}, 9);
	        Assert.assertArrayEquals(new int[]{0, 1}, twoSumIndex);
	    }

	    public int[] twoSumIndex(int[] arr, int target) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < i; j++) {
	                if ((arr[i] + arr[j]) == target) {
	                    return new int[]{j, i};
	                }
	            }
	        }
	        return new int[]{-1, -1};
	    }
}
