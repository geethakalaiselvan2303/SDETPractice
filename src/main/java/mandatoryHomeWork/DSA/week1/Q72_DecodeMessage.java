package mandatoryHomeWork.DSA.week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class Q72_DecodeMessage {
	
	/*	https://leetcode.com/problems/decode-the-message/
	 *  1. Declare the character starts with 'a' and empty string
	 *  2. Iterate with character then store the values as key and value pair in amp
	 *  	each iteration increment the value 'a'
	 *  3. iterate with message string and get the each character 
	 *  4. check for the condition whether map contains key value
	 *  5. if yes get the value for the corresponding key
	 *  6. concat with empty string
	 * 
	 * 	 * 	time complexity--> O[M+N]+O[N2]==>O[N2]
	 */

	@Test
	public void test1() {
		String decodeMessage = decodeMessage("the quick brown fox jumps over the lazy dog","vkbs bs t suepuv");
		Assert.assertEquals(decodeMessage,"this is a secret");
	}
	
	@Test
	public void test2() {
		String decodeMessage = decodeMessage("eljuxhpwnyrdgtqkviszcfmabo","zwx hnfx lqantp mnoeius ycgk vcnjrdb");
		Assert.assertEquals(decodeMessage,"the five boxing wizards jump quickly");
	}

	public String decodeMessage(String key, String message) {
		String empty=""; //O[1]
		Map<Character,Character> map=new HashMap<Character, Character>();
		String s = key.replace(" ", "");
		char c='a';
		for (int i = 0; i < s.length(); i++) { //O[N]
			char ch = s.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, c);
				c=(char) (c + 1);// O[1]
			}
		}
		for (int j = 0; j < message.length(); j++) { //O[M]
		    char msg = message.charAt(j);
		    if (map.containsKey(msg)) {
		        empty = empty + map.get(msg); //O[n2]
		    }
		    else {
		        empty = empty + msg;
		    }
		}
		return empty;
}
}