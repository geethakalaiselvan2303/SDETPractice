package mandatoryHomeWork.DSA.week2;

import org.junit.Test;
import org.testng.Assert;

public class Day1_MinimumRecolorsGetKConsecutiveBlackBlocks {
	
	/*  https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/
	 *  1. Declare min as max vaues, count as 0
	 *  1. Declare the char[] with the length 26
	 *  2. Add the values in the char[] with the length of k
	 *  		while adding the character check for the condition 'W' is present 
	 *  		if present increment count
	 *  		then calculate the min value using math.min function
	 *  3. While changing the each window when include increment count
	 *  		when exclude decrement count
	 *  4. Calculate the min each sliding window 
	 *  5. return the min value
	 *  
	 *  Time Complexity--->o[n]
	 *  Space Complexity-->o[1]
	 * 
	 */
	@Test
	public void test1() {
		int minimumRecolors = minimumRecolors("WBBWWBBWBW",7);
		Assert.assertEquals(minimumRecolors, 3);
	}
	
	@Test
	public void test2() {
		int minimumRecolors = minimumRecolors("BBBBB",3);
		Assert.assertEquals(minimumRecolors, 0);
	}
	
	@Test
	public void test3() {
		int minimumRecolors = minimumRecolors("WWWWW",2);
		Assert.assertEquals(minimumRecolors, 2);
	}
	
	
    public int minimumRecolors(String s, int k) {
    	  int[] ascii=new int[26];
  		int pointer=0,min=Integer.MAX_VALUE,whitecount=0;
  		while(pointer<k) {
  			ascii[s.charAt(pointer)-'A']++;
  			if(s.charAt(pointer)=='W') {
  				whitecount++;
  			}
  			pointer++;
  		}
  		min=Math.min(min, whitecount);
  		
  		while(pointer<s.length()) {
  			ascii[s.charAt(pointer)-'A']++;
  			ascii[s.charAt(pointer-k)-'A']--;
  		 if(s.charAt(pointer)=='W') {
  				whitecount++;
  			}
  			if(s.charAt(pointer-k)=='W') {
  				whitecount--;
  			}
  			min=Math.min(min, whitecount);
  			pointer++;
  		}
    	
  		return Math.min(min, whitecount);
    	
    }

}
