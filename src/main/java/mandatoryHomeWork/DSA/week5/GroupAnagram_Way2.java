package mandatoryHomeWork.DSA.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class GroupAnagram_Way2 {
	/*
	 * https://leetcode.com/problems/group-anagrams/ 
	 * 1. Iterate with given string
	 * 2. Sort the each word and store it in map as
	 *    {"eat","tea","tan","ate","nat","bat"} like below
	 *    
	 *    aet--->[eat, tea, ate]
	 *    abt--->  [bat] 
	 *    ant---> [tan, nat]
	 * 
	 * 
	 * 
	 */

	
	@Test
	public void test1() {
		List<List<String>> groupAnagrams = groupAnagrams(new String[] {"eat","tea","tan","ate","nat","bat"});
		System.out.println(groupAnagrams);
	}
	
	public List<List<String>> groupAnagrams(String[] strs) {
		
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		for (String s : strs) {
			String key=getCharacterOccurances(s);
			if(!map.containsKey(key)) {
				List<String> list1=new ArrayList<String>();
				list1.add(s);
				map.put(key,list1);
			}
			else {
				map.get(key).add(s);
							}
		}
		return new ArrayList<>(map.values());
        
    }

	public String getCharacterOccurances(String s) {
		
		int[] ascii=new int[26];
		
		for (char ch : s.toCharArray()) {
			ascii[ch-'a']++;
		}
		
		StringBuilder sb=new StringBuilder();
		char c='a';
		for (int i = 0; i < ascii.length; i++) {
			if(ascii[i]>0) {
				sb.append(c).append(ascii[i]);
			}
			c++;
		}
		return sb.toString();
	}
}
