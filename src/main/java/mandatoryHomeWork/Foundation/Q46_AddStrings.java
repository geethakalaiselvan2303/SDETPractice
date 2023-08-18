package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q46_AddStrings {

	//https://leetcode.com/problems/add-strings/
	@Test
	public void test1() {
		String addStrings = addStrings("123","11");
		Assert.assertEquals("134", addStrings);
	}
	@Test
	public void test2() {
		String addStrings = addStrings("456","77");
		Assert.assertEquals("533", addStrings);
	}

	public String addStrings(String s1, String s2) {
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		int result=i1+i2;
		System.out.println(result);
		String output = Integer.toString(result);
		return output;
	}
	
}
