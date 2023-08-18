package mandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q29_FindTheDifference {
	
	@Test
	public void test1() {
		FindTheDifference("abcc","abccc");
	}
	
	@Test
	public void test2() {
		FindTheDifference("","a");
	}
	public char FindTheDifference(String s1,String s2) {
		int arr[]=new int[26];
		for (char ch : s1.toCharArray()) {
			arr[ch-'a']++;
		}
		for (char ch : s2.toCharArray()) {
			arr[ch-'a']--;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==-1) {
				return (char) (i+'a');
			}
		}
		return ' ';
		 
	}}


