package mandatoryHomeWork.DSA.week5;

import java.util.Stack;

import org.junit.Test;
import org.testng.Assert;

public class Day2_BackspaceStringCompare {
	
	/*  https://leetcode.com/problems/backspace-string-compare/
	 * 
	 * 1. Declare  
	 * 
	 */
	
	@Test
	public void test1() {
		boolean backspaceCompare = backspaceCompare("ab#c","ad#c");
		Assert.assertEquals(backspaceCompare, true);
	}
	
	@Test
	public void test2() {
		boolean backspaceCompare = backspaceCompare("a#c","b");
		Assert.assertEquals(backspaceCompare, false);
	}
	
	public boolean backspaceCompare(String s, String t) {
		
		
		String s1=getBackspaceString(s);
		String s2=getBackspaceString(t);
		
		return s1.equals(s2);
        
    }

	public String getBackspaceString(String str) {
		Stack<Character> stack = new Stack<>();
		for (char c : str.toCharArray()) {
			if(c!='#') {
				stack.push(c);
			}
			else {
				stack.pop();
			}
		}
		
		StringBuilder sb=new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
		
	}
}
