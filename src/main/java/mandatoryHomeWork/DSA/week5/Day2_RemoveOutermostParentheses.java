package mandatoryHomeWork.DSA.week5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class Day2_RemoveOutermostParentheses {
	
	/* https://leetcode.com/problems/remove-outermost-parentheses/
	 * 
	 * 
	 */
	
	@Test
	public void test1() {
		String removeOuterParentheses = removeOuterParentheses("(()())(())");
		System.out.println(removeOuterParentheses);
	}
	
	public String removeOuterParentheses(String s) {
		int count = 0;
	    StringBuilder sb = new StringBuilder();

	    for (char c : s.toCharArray()) {
	        if (c == '(') {
	        	if(count>0) {
	        		sb.append(c);
	        	}
	        	count++;
	        } 
	        else if (c == ')') {
	        	count--;
	        	if(count>0) {
	        		sb.append(c);
	        	}
	        }
	     }
	    return sb.toString();		
    }
}