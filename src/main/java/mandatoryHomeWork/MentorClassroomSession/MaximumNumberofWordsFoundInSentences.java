package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class MaximumNumberofWordsFoundInSentences {
	
	/*  s= ["alice and bob love leetcode", "i think so too",
		 "this is great thanks very much"]
		1. Declare the count1=0,count2=0
		2. Iterate with sen
		3. Iterate with string[] then split(" ") the words[]  
		4. count1=5 the each words.
		5. check for the condition whether  count1>count2
		6. if yes count2=count1;
		7. return count2
	 */
	
	@Test
	public void test1() {
		MaximumNumberofWordsFoundInSentences(new String[] {"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
	}

	public int MaximumNumberofWordsFoundInSentences(String[] s) {
		int count1=0,count2=0; 
		for (String str : s) {
			String[] split = str.split(" ");
			for (int i = 0; i < split.length; i++) {
				count1++;
			}	
			if(count1>count2){
				count2=count1;
				}
			count1=0;
				}
		return count2;
	}

}
