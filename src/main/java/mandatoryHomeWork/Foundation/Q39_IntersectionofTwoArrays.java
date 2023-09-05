package mandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Q39_IntersectionofTwoArrays {
	
	/**  https://leetcode.com/problems/intersection-of-two-arrays/description/
	 * 1) create 2 loop i is for num1 and j for num2
	 * 2) check the condition num1[i]==num2[j] then return the num1[i]
	 * 3) create a list and add the value in the list
	 * 4) return the list
	 */
	
	@Test
	public void test1() {
		List<Integer> intersectionofTwoArrays = intersectionofTwoArrays(new int[] {1,2,2,1},new int[] {2,2});
		System.out.println(intersectionofTwoArrays);
		Assert.assertEquals(Arrays.asList(2,2), intersectionofTwoArrays);
	}
	@Test
	public void test2() {
		List<Integer> intersectionofTwoArrays = intersectionofTwoArrays(new int[] {4,9,5},new int[] {9,4,9,8,4});
		System.out.println(intersectionofTwoArrays);
		Assert.assertEquals(Arrays.asList(4,9), intersectionofTwoArrays);
	}
	

	public List<Integer> intersectionofTwoArrays(int[] num1, int[] num2) {
		List<Integer> intersection = new ArrayList<>();
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if(num1[i]==num2[j]) {
					intersection.add(num1[i]);
					break;
				}
			}
			
		}
//		int[] result = new int[intersection.size()];
//        for (int k = 0; k < intersection.size(); k++) {
//            result[k] = intersection.get(k);
//        }
		return intersection;
	
		
	}

}
