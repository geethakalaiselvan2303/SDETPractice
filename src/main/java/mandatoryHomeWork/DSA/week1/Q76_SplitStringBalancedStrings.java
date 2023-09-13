package mandatoryHomeWork.DSA.week1;

import org.junit.Test;

public class Q76_SplitStringBalancedStrings {
	
	/*  https://leetcode.com/problems/split-a-string-in-balanced-strings/submissions/
	 *  1. Declare variable count and result
	 *  2. Iterate with each character
	 *  3. if it's R then count++
	 *  4. else count--;
	 *  5. check for the condition if count==0
	 *  6. then increment result and return result
	 *  
	 *  Time complexity---> o[n]
	 * 
	 */
	
	@Test
	public void test1() {
		splitStringBalancedStrings("RLRRLLRLRL");
		
	}

	public void splitStringBalancedStrings(String s) {
		 int count=0,result=0;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(i)=='R'){
	                count++;
	            }
	             else{
	                count--;
	            }
	            if((count==0)){
	                result++;
	            }
	        }
	        System.out.println(result);
	}
}
