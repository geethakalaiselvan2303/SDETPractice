package mandatoryHomeWork.DSA.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Test;

public class Q82_MinimumAdditionsToMakeValidString {
	
	/* https://leetcode.com/problems/minimum-additions-to-make-valid-string/
	 * 1. Declare sum=0 and list
	 * 2. convert to tocharArray and  add to list
	 * 3. iterate with list and check for the condition abc is present the in the list
	 * 		if present then make the coressponding index location as 'z'
	 * 4. iterate with list and check for the condition 'ab','bc','ac' is continously present in the list
	 * 		if present the make the corresponding index location as 'z'
	 * 		if yes the sum++;
	 * 5. iterate with list and check for the condition 'a','b','c' is present in the list
	 * 		if yes the sum+2;
	 * 
	 * 6. return sum
	 * 
	 * Time complexity--> o[n]
	 * 
	 */
	
	@Test
	public void test1() {
		minimumAdditionsToMakeValidString("aaaabcb");
		
	}
	
	@Test
	public void test2() {
		minimumAdditionsToMakeValidString("abc");
		
	}
	@Test
	public void test3() {
		minimumAdditionsToMakeValidString("");
		
	}
	@Test
	public void test4() {
		minimumAdditionsToMakeValidString("abcabc");
		
	}




	public int minimumAdditionsToMakeValidString(String s) {
		int sum=0;
		List<Character> list=new ArrayList<Character>();
		for (Character c : s.toCharArray()) {
			list.add(c);
		}
		for (int k = 2; k < list.size(); k++) {
			if(list.get(k-2)=='a' && list.get(k-1)=='b' && list.get(k)=='c') {
				list.set(k-1,'z');
				list.set(k-2, 'z');
				list.set(k, 'z');
			}
		}
		
		for (int i = 1; i < list.size(); i++) {
			if(list.get(i-1)=='a' && list.get(i)=='b' || list.get(i-1)=='b' && list.get(i)=='c'
					|| list.get(i-1)=='a' && list.get(i)=='c') {
				list.set(i-1, 'z');
				list.set(i, 'z');
				sum++;
			}
		}
		
		for (int j = 0; j < list.size(); j++) {
			if(list.get(j)=='a'|| list.get(j)=='b'|| list.get(j)=='c') {
				sum=sum+2;
			}
		}
		System.out.println(sum);
		return sum;
		
		}
	}


