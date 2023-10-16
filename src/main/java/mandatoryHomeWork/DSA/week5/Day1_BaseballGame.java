package mandatoryHomeWork.DSA.week5;

import java.util.Stack;

import org.junit.Test;

public class Day1_BaseballGame {
	
	/* https://leetcode.com/problems/baseball-game/
	 *  1. Use stack logic
	 *  2. Iterate with input use switch condition to handle
	 *  3. if it's number add the value in the stack
	 *  4. if "C" then pop the last added element
	 *  5. if "D" double the last added element in the stack
	 *  6. if "+" add the last 2 element inside which is there in stack
	 *  7. Return -> add all the element inside stack
	 *  
	 *  Time complexity--->O[M+N]
	 *  Space Complexity--> O[N]
	 * 
	 */

	@Test
	public void test1() {
		calPoints(new String[] { "5","-2","4","C","D","9","+","+" });
	}

	public int calPoints(String[] operations) {
		int output=0,sum=0;
		Stack<String> stack = new Stack<>();
		for (String s : operations) {
			switch(s) {
			case "C" :
				if(!stack.isEmpty()) {
					stack.pop();
				}
				break;
			case "D" :
				if(!stack.isEmpty()) {
					String peek = stack.peek();
					int pushEle = Integer.parseInt(peek);
					int pow =pushEle*2 ;
					stack.push(Integer.toString(pow));
				}
				break;
			case "+" :
				if(!stack.isEmpty() && stack.size()>=2) {
					String out1=stack.pop();
					String out2=stack.pop();
			        sum=Integer.parseInt(out1)+Integer.parseInt(out2);
			        stack.push(out2);
				       stack.push(out1);
			       stack.push(Integer.toString(sum));
			      
				}
				break;
			default:
				stack.push(s);
				
			}
			
		}
		for (String num : stack) {
			output=output+Integer.parseInt(num);
         }
		
		return output;

	}
}
