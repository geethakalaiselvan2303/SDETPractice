package mandatoryHomeWork.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q23_DetermineStringHalvesAreAlike {
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
		System.out.println(s1);
		System.out.println(s2);
		int vowels1=isvowels(s1);
		int vowels2=isvowels(s2);
		if(vowels1==vowels2) {
			return true;
		}	
		else {
			return false;
		}
	}
	public int isvowels(String s) {
	int count = 0;
	char[] ch = s.toCharArray();
	for (int i = 0; i < ch.length; i++) {
	if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ||
					ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
				
				count++;
		}
		
	    }
	return count;
		
	}}
	
	


