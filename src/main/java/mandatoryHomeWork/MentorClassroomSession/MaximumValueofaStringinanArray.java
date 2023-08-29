package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;
import java.util.Comparator;

import org.junit.Test;

public class MaximumValueofaStringinanArray {
	/*	strs = ["alic3","bob","3","4","00000","alic32"]
		1. declare empty array with the lengh of the string
		2. Iterate with string(strs)
		3. Iterate with each word(s)
		4. Check for the condition whether the string is alphabetic
		5. if it's alphabetic the add the length of the words in the result array
		6. if it's numeric convert the string into int
		7. sort the empty array
		8. return the last index array 
	 */
	
	@Test
	public void test1() {
		System.out.println(MaximumValueofaStringinanArray(new String[] { "alice2", "bob", "3", "4", "00000" }));
	}
	@Test
	public void test2() {
		System.out.println(MaximumValueofaStringinanArray(new String[] { "1","01","001","0001" }));
	}

	public int MaximumValueofaStringinanArray(String[] str) {
		int[] result=new int[str.length];
		for (int i = 0;  i< str.length; i++) {
			boolean alpha=false;
			for (int j = 0;  j< str[i].length(); j++) {
				if(Character.isAlphabetic(str[i].charAt(j))) {
					alpha=true;
					break;
				}
			}
			if(alpha==true) {
				result[i]=str[i].length();
			}
			else {
				result[i]=Integer.parseInt(str[i]);
			}
			
		}
		Arrays.sort(result);
		return result[result.length-1];
    }
}