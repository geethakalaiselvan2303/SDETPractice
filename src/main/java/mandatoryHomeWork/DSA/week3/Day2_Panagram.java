package mandatoryHomeWork.DSA.week3;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Day2_Panagram {
	
	/*  https://leetcode.com/problems/check-if-the-sentence-is-pangram/
	 *  
	 *  1. Create the length of 26 int[]
        2. add all the values in the created array
        3. check for the condition whether the values are greater than 0
           in the array if yes return true else false
	 * 
	 *   Another Approach
	 *   1. Add all the vaues in the set 
	 *   2. check if the set size is 26
	 *   3. if yes return true else false
	 *   
	 */
	@Test
	public void test1() {
		boolean pangram = pangram("leetcode");
		Assert.assertEquals(pangram, false);
	}
	
	@Test
	public void test2() {
		boolean pangram = pangram1("thequickbrownfoxjumpsoverthelazydog");
		Assert.assertEquals(pangram, true);
	}

	public boolean pangram(String sentence) {
		int[] c=new int[26];
        for(int i=0;i<sentence.length();i++){
            c[sentence.charAt(i)-'a']++;
        }

        for(int i=0;i<c.length;i++){
            if(c[i]<=0){
               return false;
            }
        
        }
        return true;
	}

	
	public boolean pangram1(String sentence) {
		Set<Character> set=new HashSet<Character>();
        for (char c: sentence.toCharArray()){
            set.add(c);
        }

        return set.size()==26;
	}

}
