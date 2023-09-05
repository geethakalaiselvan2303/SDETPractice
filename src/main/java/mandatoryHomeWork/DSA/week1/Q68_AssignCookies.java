package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Q68_AssignCookies {
	
	/* https://leetcode.com/problems/assign-cookies/
	 * 1. g = [1,2,3], s = [1,1]
	 * 1. Declare happyChild=0, 
	 * 2. Get the length of s and g then find the mininum  
	 * 3. iterate with loop with i<min 
	 * 4. check for the condition s[i] >= g[i] && g[i]>=1
	 * 5. if yes increment the happyChild
	 * 6. make the g[i] as 0
	 * 6. return happyChild
	*/
	
	@Test
	public void test1() {
		int assignCookies = assignCookies(new int[] {1,2,4},new int[] {1,1});
		Assert.assertEquals(1, assignCookies);
	}
	
	@Test
	public void test2() {
		int assignCookies = assignCookies(new int[] {10,9,8,7},new int[] {5,6,7,8});
		Assert.assertEquals(2, assignCookies);
	}

	
	// 10,9,8,7  [5,6,7,8]
	public int assignCookies(int[] g, int[] s) {
		int happyChild=0;
		for (int j = 0; j < s.length; j++) {
		for (int i = 0; i < g.length; i++) {
			if(s[j]>=g[i] ) {
				happyChild++;
				g[i]=0;
				break;
									
			}
				
				}
			}

		return happyChild;
	}
}
