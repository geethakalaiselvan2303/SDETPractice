package mandatoryHomeWork.DSA.week5;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class Day4_RemoveAllAdjacentDuplicatesInString {
	
	/*  https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
	 *  1. Iterate with each character
	 *  2. check for the condition whether the stack is not empty and ready the character which is already in stack then pop the character
	 *  3.  if not then push 
	 *  4. convert the stack value into string 
	 *  5. return the result
	 *  
	 *  Time Complexity ---> O[N]
	 *  space complexity--> O[N]
	 */

	
	@Test
	public void test1() {
		String removeDuplicates = removeDuplicates("abbaca");
		System.out.println(removeDuplicates);
		Assert.assertEquals(removeDuplicates, "ca");
	}
	@Test
	public void test2() {
		String removeDuplicates = removeDuplicates("azxxzy");
		System.out.println(removeDuplicates);
		Assert.assertEquals(removeDuplicates, "ay");
	}
	
	 public String removeDuplicates(String s) {
		 	StringBuilder sb=new StringBuilder();
	        Stack<Character> stack=new Stack<Character>();
	        char topElement=' ';
	        for(char c:s.toCharArray()){
	        	if(!stack.isEmpty() && stack.peek()==c) {
	        		stack.pop();
	        	}
	        	else{
	                stack.push(c);
	        	}   
	        }
	        while(!stack.isEmpty()) {
	        	sb.insert(0, stack.pop());
	        }
	        return sb.toString();
	    }
}
