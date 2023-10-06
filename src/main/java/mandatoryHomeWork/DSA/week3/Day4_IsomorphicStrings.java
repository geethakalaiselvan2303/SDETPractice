package mandatoryHomeWork.DSA.week3;

import org.junit.Test;
import org.testng.Assert;

public class Day4_IsomorphicStrings {
	
	/*  https://leetcode.com/problems/isomorphic-strings/description/
	 * 	1. Delcare the map
		2. Iterate with s and t  string
		3. Take the key as 'S' and the value as 'T'
		4. check for the condition whether the key is exist
			 if the key is exist check for the key and values are same 
			 if not return false
		5. check for values and if it's exist already 
		 return false

         Time complexity-->O[n]
         space complexity-->O[n]
         */
	
	@Test
	public void test1() {
		boolean isomorphic = isIsomorphic("add","egg");
		Assert.assertEquals(isomorphic, true);
	}
	public boolean isIsomorphic(String s, String t) {
	    int[] arr_s=new int[256];
			int[] arr_t=new int[256];
			for (int i = 0; i < s.length(); i++) {
			
			if(arr_s[s.charAt(i)]!=arr_t[t.charAt(i)]) {
				return false;
			}
			arr_s[s.charAt(i)]=i+1;
			arr_t[t.charAt(i)]=i+1;
				
			}
			
		return true;
	    }
}
