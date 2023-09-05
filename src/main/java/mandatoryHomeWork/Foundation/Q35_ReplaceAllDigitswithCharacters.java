package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q35_ReplaceAllDigitswithCharacters {
	// https://leetcode.com/problems/replace-all-digits-with-characters/description/
	@Test
	public void test1() {
		String replaceAllDigitswithCharacters = replaceAllDigitswithCharacters("a1c1e1");
		Assert.assertEquals("abcdef", replaceAllDigitswithCharacters);
	}
	
	@Test
	public void test() {
		String replaceAllDigitswithCharacters = replaceAllDigitswithCharacters("a1b2c3d4e");
		Assert.assertEquals("abbdcfdhe", replaceAllDigitswithCharacters);
	}

	public String replaceAllDigitswithCharacters(String st) {
		StringBuilder result = new StringBuilder();
		char[] ch = st.toCharArray();
		for (int i = 0; i <ch.length; i++) {
			 char shiftcharacter;
		        if (Character.isDigit(ch[i])) {
		            shiftcharacter = shift(ch[i-1], ch[i]);
		         }
		        else {
		        	 shiftcharacter = ch[i];
		        }
		        result.append(shiftcharacter);//ab
			}
		System.out.println(result);
		return result.toString();
	}
	public char shift(char c, char d) { //a,1
		 int asciiValue = (int) c; //97
		 int cc = (int) d; // 49
		 int asciiSum = asciiValue + cc - '0'; // 146-48=98
		 char shiftedChar = (char) asciiSum; //b
		 return shiftedChar;
	}
}
