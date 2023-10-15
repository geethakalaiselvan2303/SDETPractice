package mandatoryHomeWork.DSA.ClassWork.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class ValidParentheses {
	
	/*  https://leetcode.com/problems/valid-parentheses/
	 *  1. Use a stack of characters. 
	 * 
	 */
	
	@Test
	public void test() {
		System.out.println(isValid("()[]{}"));
	}
	
	  public boolean isValid(String s) {
		Stack<Integer> even = new Stack<>();  
			
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ) {
				even.push((int) s.charAt(i));
			}
			else {
				char charAt = s.charAt(i);
				if(charAt==even.peek()) {
					even.pop();
				}
				
			}
				
		}
		return even.empty();
	        
	    }

}
