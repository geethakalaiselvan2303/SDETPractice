package mandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q26_LengthofLastWord_Way2 {
	/***
	 * 1) remove space using trim
	 * 2) use substring to print and count the last world
	 * 3) and use the last index of method to find the last space
	 * 
	 */
	@Test
	public void test1() {
	LengthofLastWord("Hello World");
	}
//	@Test
//	public void test2() {
//	LengthofLastWord("   fly me   to   the moon  ");
//	}
//	@Test
//	public void test3() {
//	LengthofLastWord("luffy is still joyboy");
//	}

	public int LengthofLastWord(String str) {
		System.out.println(str.trim().length());
		System.out.println(str.lastIndexOf(" "));
		return str.trim().length()-str.lastIndexOf(" ")-1;
			
	}
	
}
