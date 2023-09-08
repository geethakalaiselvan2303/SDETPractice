package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class Q73_SortingSentence {
	
	/*  https://leetcode.com/problems/sorting-the-sentence/submissions/
	 *  1. split the sentences 
	 *  2. create empty string array[]
	 *  3. use substring method and get the value of each word
	 *  4. store the values based on the index position in the empty array
	 *  5. convert the string[] to string
	 *  6. use string builder to append 
	 *  7. return string builder
	 *  
	 *  time complexity o[n]
	 */
	
	@Test
	public void test1() {
		String sortingSentence = sortingSentence("is2 sentence4 This1 a3");
		Assert.assertEquals(sortingSentence, "This is a sentence");
	}
	
	@Test
	public void test2() {
		String sortingSentence = sortingSentence("Myself2 Me1 I4 and3");
		Assert.assertEquals(sortingSentence, "Me Myself and I");
	}

	public String sortingSentence(String s) {
		String[] split = s.split(" ");
		String[] empty=new String[split.length];  //O(n)
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i <empty.length; i++) { //o[n]
			String sub = split[i].substring(split[i].length()-1);
			int val=Integer.parseInt(sub);
			empty[val-1]=split[i].substring(0,split[i].length()-1);
		}
		for(int i=0;i<empty.length;i++) {  // 0[n]
			sb.append(empty[i]).append(" ");
		}
		
		return sb.toString().trim();
	}

}
