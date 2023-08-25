package mandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;
import org.testng.Assert;

/* https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&isFullScreen=false&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup*/


public class SeaValley {
	
	/* 	1. Declare the variable seaposition=0, valley=0, Count=0
	 *  2. split the string into tocharArray
	 *  3. Iterate with each character if it's "U" increment the Count
	 *  4. Else decrement the count.
	 *  5. then check for the condition seaposition==count and currentIndex position is 'U' 
	 *  6. if yes then increment valley
	 *  7. return the valley
	 * 
	 */
	
	@Test
	public void test1() {
		int seaValley = seaValley("UDDDUDUU");
		Assert.assertEquals(1, seaValley);
	}
	
	@Test
	public void test2() {
		int seaValley = seaValley("UDDDUUDDUU");
		Assert.assertEquals(2, seaValley);
	}
	@Test
	public void test3() {
		int seaValley = seaValley("");
		Assert.assertEquals(0, seaValley);
	}

public int seaValley(String st) {
		int seaposition=0, valley=0, count=0;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='U') {
				count=count+1;
			}
			else {
				count=count-1;
			}
			if(seaposition==count && ch[i]=='U') {
				valley++;
			}
		}
		return valley;
	}
}
