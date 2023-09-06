package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;

import org.junit.Test;

public class Q70_MaximumNumberfWordsFoundSentences {
	
	/*  https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/
	 *  1. Declare count=0 and empty array with length of given string
	 *  2. Iterate through string array 
 		3. split the string and count
 		4. add the count value in the empty array
 		5. sort the empty array and return the last index value of empty array
	 */

	@Test
	public void test1() {
		System.out.println(maximumNumberfWordsFoundSentences(
				new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
	}
	//O[1]+ O[N]+O[N]+O[N]+O[1]+O[1]+O[Nlog[N]= O[Nlog[N
	public int maximumNumberfWordsFoundSentences(String[] s) {
		int[] arr = new int[s.length];
		int count = 0; //O[1]
		for (int i = 0; i < s.length; i++) { //O[N]
			String[] split = s[i].split(" ");  //O[N]
			for (String sp : split) {   //O[N]
				count++;
			}
			arr[i] = count; //O[1]
			count = 0;  //O[1]
		}
		Arrays.sort(arr); //O[Nlog[N]
		return arr[arr.length - 1];
	}

}
