package MandatoryHomeWork.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q23_DetermineStringHalvesAreAlike_Way3 {
	/**
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
		return compare(s1)==compare(s2);			
	}
	public int compare(String str) {
		String vowels="AEIOUaeiou";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if(str.charAt(i)==vowels.charAt(j)) {
					count++;
				}
			}
		}
		return count;
		
	}
	
	
	
}

