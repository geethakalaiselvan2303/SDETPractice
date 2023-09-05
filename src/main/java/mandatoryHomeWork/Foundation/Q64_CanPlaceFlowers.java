package mandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q64_CanPlaceFlowers {
	
	/*	https://leetcode.com/problems/can-place-flowers/
	 */

	@Test
	public void test1() {
		System.out.println(CanPlaceFlower(new int[] { 1, 0, 0, 0, 1 }, 2));
	}

	@Test
	public void test2() {
		System.out.println(CanPlaceFlower(new int[] {}, 2));
	}

	@Test
	public void test3() {
		System.out.println(CanPlaceFlower(new int[] { 0 }, 1));
	}

	@Test
	public void test4() {
		System.out.println(CanPlaceFlower(new int[] { 1 }, 1));
	}
	// o[1] + o[N]==> o[N]
	public boolean CanPlaceFlower(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) { 
			if (flowerbed.length == 0) {
				return false;
			} else if (flowerbed.length == 1 && flowerbed[0] == 0) {
				return true;
			} else if (flowerbed[i] == 0) {
				int prev = (i == 0) ? 0 : flowerbed[i - 1];
				int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
				if (prev == 0 && next == 0) {
					flowerbed[i] = 1;
					n--;
				}
			}
		}
		return n == 0;
	}

}
