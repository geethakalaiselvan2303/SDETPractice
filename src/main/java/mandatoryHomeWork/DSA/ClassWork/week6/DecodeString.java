package mandatoryHomeWork.DSA.ClassWork.week6;

import java.util.Stack;

public class DecodeString {
	/*
	 * https://leetcode.com/problems/decode-string/description/
	 */

	public static void main(String[] args) {
		String c1="";
		StringBuilder sb=new StringBuilder();
		Stack<Integer> stackNum=new Stack<Integer>();
		Stack<String> stackChar=new Stack<String>();
		String s = "3[a]2[bc]";
		for (char c : s.toCharArray()) {
			String str = Character.toString(c);
			if(Character.isDigit(c)) {
				stackNum.push(Character.getNumericValue(c));
			}
			else if(c!=']') {
				stackChar.push(str);
			}
			else {
				String c2="";
				while(!stackChar.isEmpty()&& !stackChar.peek().equals("[")) {
					c1=c1+stackChar.peek();
					stackChar.pop();
				}
				stackChar.pop();
				int peek = stackNum.peek();
				for (int i = 0; i <peek; i++) {
					c2=c2+c1;
					if(i+1==peek) {
						stackNum.pop();
					}
				}
				stackChar.push(c2);
				c1="";
				}
				
			}
		while(!stackChar.isEmpty()) {
			sb.append(stackChar);
		}
			
		System.out.println(sb.toString());
		}
	}
	
