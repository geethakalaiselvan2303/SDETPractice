package mandatoryHomeWork.DSA.week1;

import org.junit.Test;

public class Day2_LexicographicallySmallestPalindrome {

	/*  https://leetcode.com/problems/lexicographically-smallest-palindrome/description/ 
	 * 	1. Declare the variable left=0,right=s.length-1;
	 *  2. iterate with each character
	 *  3. check whether left and right are not equal
	 *   	 the check for the condition whether right character is less than the left
	 *   	 if yes replace the left with right
	 *  	 if not replace the right with left
	 *  4. return the string
	 * 
	 *  Time Complexity---> o[n]
	 *   
	 */
	
	@Test
	public void test1() {
		lexicographicallySmallestPalindrome("geetha");
	}

	public String lexicographicallySmallestPalindrome(String s) {
		   int left=0,right=s.length()-1;
			char[] ch = s.toCharArray();
			while(left<=right) {
				if(!(ch[left]==ch[right])) {
					if(ch[right]<ch[left]){
						ch[left]=ch[right];
					}
					else{
							ch[right]=ch[left];
					}
					
				}
				left++;
				right--;
			}
			 return String.valueOf(ch);
	}
}
