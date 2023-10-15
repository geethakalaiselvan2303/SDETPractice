package mandatoryHomeWork.DSA.week4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Day5_MostCommonWord {
	/*
	 * https://leetcode.com/problems/most-common-word/
	 * 1. Create a Map
	 * 2. Convert the entire string to lowercase or uppercase
	 * 3. Remove special characters
	 * 4. split using " "
	 * 5. Iterate with split and the occurances in the map
	 * 6. sort the map values
	 * 7. iterate with map values and check also the map value should not contains key which is given in banned
	 * 		if yes print the key
	 */
	
	
	@Test
	public void test1() {
		mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[] {"hit"});
	}
	
	public String mostCommonWord(String paragraph, String[] banned) {
		String output="";
		String replaceAll = paragraph.replaceAll("[^a-zA-Z0-9\\s]", "");
		String lowerCase = replaceAll.toLowerCase();
		String[] split = lowerCase.split(" ");
		Map<String,Integer> map=new HashMap<String,Integer>();
		for (String s : split) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else {
				map.put(s, 1);
			}
		}
		for (String s1 : banned) {
			if(map.containsKey(s1)) {
				map.remove(s1);
			}
		}
		
        int max=0;
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
        	int maxValue=entry.getValue();
        	if(maxValue>max) {
        		 max=maxValue;
        		 output = entry.getKey();
        	}
					
		}
        System.out.println(output);
		return output;
        
    }

}
