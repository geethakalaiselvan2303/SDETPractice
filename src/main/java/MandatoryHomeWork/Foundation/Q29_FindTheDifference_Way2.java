package MandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q29_FindTheDifference_Way2 {
	
	@Test
	public void test1() {
		char findTheDifference = FindTheDifference("abcc","abccc");
		System.out.println(findTheDifference);
	}
	
	@Test
	public void test2() {
		char findTheDifference = FindTheDifference("","a");
		System.out.println(findTheDifference);
	}
	public char FindTheDifference(String s,String t) {
		int total=0;
		for (int i = 0; i < t.length(); i++) {
			total=total+t.charAt(i);
		}
		for (int i = 0; i < s.length(); i++) {
			total=total-s.charAt(i);
		}
		return (char) total;
		
		 
	}}


