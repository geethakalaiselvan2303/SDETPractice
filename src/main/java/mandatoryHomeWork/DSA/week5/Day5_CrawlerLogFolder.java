package mandatoryHomeWork.DSA.week5;

import java.util.Stack;

import org.junit.Test;

public class Day5_CrawlerLogFolder {
	
	/* https://leetcode.com/problems/crawler-log-folder/
	 * 1. Iterate with string
	 * 2. Check for the condition
	 * 		if "d" with any number push the item
	 * 		if "../" then pop the element from stack and also add the condition !Stack.IsEmpty
	 * 		if "./" don't do anything remains same
	 * 
	 */
	
	@Test
	public void test1() {
		int minOperations = minOperations(new String[] {"d1/","d2/","../","d21/","./"});
		System.out.println(minOperations);
	}
	 public int minOperations(String[] logs) {
		int count=0;
		Stack<String> stack=new Stack<String>();
		for (String s : logs) {
			switch (s) {
			case "../":
				if(!stack.isEmpty()) stack.pop();
				break;
			case "./":
				break;	
			default:
				stack.push(s);
				break;
			}
		}
		return stack.size();
	        
	    }
}
