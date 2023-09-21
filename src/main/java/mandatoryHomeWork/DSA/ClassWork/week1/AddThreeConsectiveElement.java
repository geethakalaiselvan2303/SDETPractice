package mandatoryHomeWork.DSA.ClassWork.week1;

import org.junit.Test;

public class AddThreeConsectiveElement {

	@Test
	public void test1() {
		SlidingWindow(new int[] { 1, 5, 2, 3, 7, 1 }, 3);
	}

	public int SlidingWindow(int[] nums, int k) {
	       //1. one pointer should work
        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
        // not needed second pointer as this is balanced traversal ,right = k-1;
        //2. Do the required operation till k index
        while(pointer < k)
            currentSum += nums[pointer++];
        //3. continue the operation for rest of the array
        while( pointer < nums.length){
            max = Math.max(currentSum, max);
            currentSum =currentSum+nums[pointer] - nums[pointer-k];
            pointer++;
            // currentSum += nums[pointer] - nums[pointer++-k];
        }
        return Math.max(currentSum, max);
    }
		
		
	}

	

