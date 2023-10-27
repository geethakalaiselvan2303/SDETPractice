package mandatoryHomeWork.DSA.week6;

import org.junit.Test;

public class Day5_MergeTwoStrings {
	
	/* https://leetcode.com/problems/merge-strings-alternately/
	 * 
	 */
	
	@Test
	public void test1() {
		mergeAlternately("abc","pqrqwer");
	}
	public String mergeAlternately(String word1, String word2) {
		StringBuilder sb=new StringBuilder();
        int ptr1=0,ptr2=0;
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        while(ptr1<word1.length()&& ptr2<word2.length()){
            sb.append(ch1[ptr1]).append(ch2[ptr2]);
            ptr1++;
            ptr2++;
        }
        
        while(ptr1<word1.length()) {
        	sb.append(ch1[ptr1]);
        	ptr1++;
        }
        while(ptr2<word2.length()) {
        	sb.append(ch2[ptr2]);
        	ptr2++;
        }

        System.out.println(sb.toString());
		return sb.toString();
		
	}
}
