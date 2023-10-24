package mandatoryHomeWork.AsssessmentQuestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.junit.Test;

public class Q6_RearrangeWordsInASentence {
	
	/*
	 * https://leetcode.com/problems/rearrange-words-in-a-sentence/
	 */
	
	@Test
	public void test1() {
		arrangeWords("Keep calm and code on");
	}
	public String arrangeWords(String text) {
		
		Map<Integer,List<String>> map=new HashMap<Integer,List<String>>();
		for (String s : text.split(" ")) {
			int n=s.length();
			if(!map.containsKey(n)) {
				List<String> list=new ArrayList<String>();
				list.add(s);
				map.put(n, list);
			}
			else {
				List<String> list2=map.get(n);
				list2.add(s);
				map.put(n, list2);
			}
		}
		Set<Integer> keySet = map.keySet();
		List<Integer> sortedKeys = new ArrayList<>(map.keySet());
		Collections.sort(sortedKeys);
		StringBuilder sb = new StringBuilder();
        for (int key : sortedKeys) {
            List<String> wordsList = map.get(key);
            for (String word : wordsList) {
            	String lowerCase = word.toLowerCase();
                sb.append(lowerCase).append(" ");
            }
        }
       String str=sb.toString();
       String result=str.substring(0, 1).toUpperCase() + str.substring(1);
       System.out.println(result);
        return result;
    }
}
