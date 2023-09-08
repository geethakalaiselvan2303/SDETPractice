package mandatoryHomeWork.MentorClassroomSession;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class Hacker_hackerrank {
	
	/*  https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem?isFullScreen=true
	 *  1. Store the actual string in a variable
	 *  2. Declare empty string
	 *  3. initialize a variable as zero
	 *  4. iterate with input string 
	 *  	Iterate with actual string
	 *  		check if each input string character is equal to actual input character
	 *  		if yes concat with empty string
	 *  		store the actual string index value +1 
	 *  5. compare both actual and empty string
	 *  6. if yes return true
	 *  
	 *  	Time complexity=o[m*n]
	 */
	
	@Test
	public void test1() {
		String hackerrank = hackerrank("hereiamstackerrank");
		System.out.println(hackerrank);
	}
	
	public static String hackerrank(String s) {
		String result="";
		String target="hackerrank";
		String empty="";
		int k=0;
		for (int i = 0; i <target.length(); i++) { // o[n]
			for (int j = k; j < s.length(); j++) { //o[m]
				if(target.charAt(i)==s.charAt(j)) {
					empty=empty+s.charAt(j);
					k=j+1;
					break;
				}
			}
		}
		System.out.println(empty);
		if(target.equals(empty)) {
			result="YES";
		}
		else {
			result="NO";
		}
		return result;
	}

	
	}


