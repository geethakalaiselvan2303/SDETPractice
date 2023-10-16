package mandatoryHomeWork.DSA.ClassWork.week4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

public class ValidParentheses {

	/*
	 * https://leetcode.com/problems/valid-parentheses/ 1. Use a stack of
	 * characters.
	 * 
	 */

	@Test
	public void test() {
		System.out.println(isValid("()[]{}"));
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (char eachChar : s.toCharArray()) {
			switch (eachChar) {
			case '}':
				if (stack.isEmpty() || stack.pop() != '{')
					return false;
				break;
			case ')':
				if (stack.isEmpty() || stack.pop() != '(')
					return false;
				break;
			case ']':
				if (stack.isEmpty() || stack.pop() != '[')
					return false;
				break;
			default:
				stack.push(eachChar);
			}

		}
		return stack.isEmpty();

	}

}
