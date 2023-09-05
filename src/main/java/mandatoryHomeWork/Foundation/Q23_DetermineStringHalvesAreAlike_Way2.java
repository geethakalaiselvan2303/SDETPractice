package mandatoryHomeWork.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q23_DetermineStringHalvesAreAlike_Way2 {
	/** https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
	 * 1) input 
	 */
	@Test
	public void test1() {
		boolean determineStringHalves = DetermineStringHalves("book");
		Assert.assertEquals(true, determineStringHalves);
	}
	@Test
	public void test() {
		boolean determineStringHalves = DetermineStringHalves("textbook");
		Assert.assertEquals(false, determineStringHalves);
	}

	public boolean DetermineStringHalves(String str) {
		String s1 = str.substring(0, (str.length()/2));
		String s2 = str.substring((str.length()/2));
		String replaceAll1 = s1.replaceAll("[^a,e,i,o,u,A,E,I,O,U]", "");			
		String replaceAll2 = s2.replaceAll("[^a,e,i,o,u,A,E,I,O,U]", "");
		return replaceAll1.length()==replaceAll2.length();
	}		
	
	
	
	
}

