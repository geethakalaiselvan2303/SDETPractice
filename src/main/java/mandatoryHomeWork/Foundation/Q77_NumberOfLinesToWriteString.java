package mandatoryHomeWork.Foundation;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Q77_NumberOfLinesToWriteString {
	
	/* https://leetcode.com/problems/number-of-lines-to-write-string/submissions/
	 * 1. initialize the variable count and nooflines 
	 * 2. Iterate with character array
	 * 3. add the value with nooflines
	 * 4. check if value is zero
	 * 5. if yes count++ the rest the nooflines=0
	 * 6. return the count and nooflines
	 * 
	 *  Time complexity--->o[n]
	 */

	@Test
	public void test1() {
		int[] numberOfLinesToWriteString = numberOfLinesToWriteString(new int[] {10,10,10,10,10,10,10,10,10,10,10,
				10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
		System.out.println(Arrays.toString(numberOfLinesToWriteString));
		Assert.assertEquals(numberOfLinesToWriteString, new int[] {3,60});
	}

	@Test
	public void test2() {
		int[] numberOfLinesToWriteString = numberOfLinesToWriteString(new int[] { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "bbbcccdddaaa");
		System.out.println(Arrays.toString(numberOfLinesToWriteString));
		Assert.assertEquals(numberOfLinesToWriteString, new int[] { 2, 4 });
	}

	public int[] numberOfLinesToWriteString(int[] widths, String s) {
		int currentLineLength = 0, count = 1;
		for (char c : s.toCharArray()) {
			int width = widths[c - 'a'];
			if (currentLineLength + width > 100) {
				count++;
				currentLineLength = 0;
			}
			currentLineLength += width;
			
		}

		return new int[] { count, currentLineLength };

	}

}
