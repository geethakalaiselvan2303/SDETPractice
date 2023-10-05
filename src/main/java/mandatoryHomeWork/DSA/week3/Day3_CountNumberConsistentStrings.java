package mandatoryHomeWork.DSA.week3;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class Day3_CountNumberConsistentStrings {
	
	/* https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
	 * 1. Declare the boolean[] with the length 128
       2. Add the allowed string in the boolean[]
       3. Iterate with words and store each words as a character
       4. Declare boolean flag as true
            iterate with the char[] and check each character is present in the boolean[] 
            if not the make flag as false and break the condition
            if the flag is true then make the increment the count
       5. Return the count
	 * 
	 * Time Complexity--->  O[N]
	 * Space Complexity---> O[1]
	 * 
	 */
	
	@Test
	public void test1() {
		int countNumberConsistentStrings = CountNumberConsistentStrings("ab",new String[] {"ad","bd","aaab","baa","badab"});
		Assert.assertEquals(countNumberConsistentStrings, 2);
	}
	
	@Test
	public void test2() {
		int countNumberConsistentStrings = CountNumberConsistentStrings_2("abc",new String[] {"a","b","c","ab","ac","bc","abc"});
		Assert.assertEquals(countNumberConsistentStrings, 7);
	}

	public int CountNumberConsistentStrings(String allowed, String[] words) {
		 boolean[] n=new boolean[128];
		    int count=0;
		    for(char c:allowed.toCharArray()){
		        n[c]=true;
		    }
		     for (String word : words) {
		           boolean flag=true;
		      for(char c:word.toCharArray()){
		          if(!n[c]){
		               flag=false;
		               break;
		          }
		      }
		          if(flag){
		              count++;
		          }
		        
		    } 
		    
		    return count; 
	}
	
	
	public int CountNumberConsistentStrings_2(String allowed, String[] words) {
		  int count=0;
	        Set<Character> set=new HashSet<Character>();
	        for( char c: allowed.toCharArray()){
	            set.add(c);
	        }
	        for(String word: words){
	               boolean flag=true;
	            for(char c1:word.toCharArray()){
	                if(!set.contains(c1)){
	                    flag=false;
	                    break;
	                }
	            }
	            if(flag){
	                count++;
	            }
	        }
	        return count;
		
	}

}
