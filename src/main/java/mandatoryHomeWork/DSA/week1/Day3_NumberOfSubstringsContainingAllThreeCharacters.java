package mandatoryHomeWork.DSA.week1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class Day3_NumberOfSubstringsContainingAllThreeCharacters {
	
	
	/*  https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
	 *  1. declare the pointer=0	
		2. Add the first three character.	
		3. Add the helper function to check the not to have the duplicates	
		4. keep on iterating the character still the length of the string	
		5. remove the first index and add the last index value. Iterate the still length of the length	
			Check for the condition whether each stirng have the abc values

	 *   Time Complexity--->
	 *   Space Complexity--->
	 */
	
	@Test
	public void test1() {
		sumberOfSubstringsContainingAllThreeCharacters("abcabc");
	}

	public void sumberOfSubstringsContainingAllThreeCharacters(String s) {
		List<Character> list=new ArrayList<Character>();
		List<Character> list1=new ArrayList<Character>(list);
		int pointer=0,count=0;
		while(pointer<3) {
			list.add(s.charAt(pointer++));
		}
		list1.addAll(list);
		if (isCheck(list)) {
            count++;
        }
		while(pointer<=s.length()) {
			list.add(s.charAt(pointer++));
			if (isCheck(list)) {
	            count++;
	        }
			if(pointer==s.length()) {
				list.clear();
	            list.addAll(list1);
	            list.remove(0); 
	            list.add(s.charAt(list.size()+1));
				pointer=list.size()+1;
			}
			
		}
		
		
		
	}

	public boolean isCheck(List<Character> list) {
        Set<Character> set = new HashSet<Character>(list);
        return set.size() == 3;
    }
	
	

}
