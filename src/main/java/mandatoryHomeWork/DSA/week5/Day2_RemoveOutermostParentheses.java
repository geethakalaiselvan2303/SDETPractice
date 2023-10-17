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
	}
	
	public String removeOuterParentheses(String s) {
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			char c1=s.charAt(1);
			if(s.charAt(i)=='(') {
				count++;
			}
			else {
				count--;
			}
			if(count==0) {
//				s.replace(c1, "");
			}
		}
		return s;			
				
			}
		
    }
	

