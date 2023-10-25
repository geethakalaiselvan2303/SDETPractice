package mandatoryHomeWork.DSA.week6;

import org.junit.Test;

public class Day3_CanPlaceFlowers {
	
	/* https://leetcode.com/problems/can-place-flowers/ 
	 */
	

	@Test
	public void test1() {
		canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 1);
	}

	public boolean canPlaceFlowers(int[] flowerbed, int n) {
	     int size = flowerbed.length;
	     for (int i = 0; i < size; i++) {
	         if (flowerbed[i] == 0) {
	        	 // checking for the first index position is 0(001)
	             int prev = (i==0||flowerbed[i-1]==0)?0:1;
	          // checking for the last index position is 0(100)
	             int next = (i == size - 1 ||flowerbed[i+1]==0)?0:1;
	             if (prev == 0 && next == 0) {
	                 flowerbed[i] = 1;
	                 n--;
	             }
	         }
	     }
	     return n <= 0;

	}

	}

