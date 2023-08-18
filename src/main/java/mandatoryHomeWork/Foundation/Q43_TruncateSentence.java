package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q43_TruncateSentence {
	//https://leetcode.com/problems/truncate-sentence/submissions/
	@Test
	public void test1() {
		String truncateSentence = truncateSentence("Hello how are you Contestant",4);
		System.out.println(truncateSentence);
		Assert.assertEquals("Hello how are you", truncateSentence);
	}

	public String truncateSentence(String s, int target) {
		StringBuilder builder=new StringBuilder();
		String[] split = s.split(" ");
		for (int j = 0; j < target; j++) {
			builder.append(split[j]).append(" ");
		}
		System.out.println(builder);
		return builder.toString().trim();
	}

}
