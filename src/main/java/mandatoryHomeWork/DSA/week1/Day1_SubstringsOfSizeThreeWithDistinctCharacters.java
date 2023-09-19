package mandatoryHomeWork.DSA.week1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class Day1_SubstringsOfSizeThreeWithDistinctCharacters {

	/*
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
	 * 
	 * 1. Declare the count variable
	 * 2. Get the substring for the k=3
	 * 3. Create the sub function to add the character in the set 
	 * 4. if the set size is 3 then increment the count 
	 * 5. Return the count
	 * 
	 * Time Complexity---> o[n]
	 * 
	 */

	@Test
	public void test1() {
		SubstringsOfSizeThreeWithDistinctCharacters("xyzzaz");
	}
	
	@Test
	public void test2() {
		SubstringsOfSizeThreeWithDistinctCharacters("aababcabc");
	}

	public int SubstringsOfSizeThreeWithDistinctCharacters(String s) {
		int count=0;
		if(s.length()<3) {
			return 0;
		}
		for (int i = 0; i <=s.length()-3; i++) {  //o[n]
			if(IsDistinct(s.substring(i,i+3))){
				count++;
			}
		}
		System.out.println(count);
		return count;
	}

	public boolean IsDistinct(String str) {
		Set<Character> set=new HashSet<Character>();
		for (char c : str.toCharArray()) {
			set.add(c);
		}
		return set.size()==3;
	}

}