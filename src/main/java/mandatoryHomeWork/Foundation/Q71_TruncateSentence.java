package mandatoryHomeWork.Foundation;

import org.junit.Test;

public class Q71_TruncateSentence {
	// https://leetcode.com/problems/truncate-sentence/
		/*	1. split the sentences using space
		 *  2. Iterate with split length
		 *  3. create empty string and append
		 */
		
		@Test
		public void test1() {
			TruncateSentence("Hello how are you Contestant",4);
		}
		//O[N] +O[N]=O[N]
		public String TruncateSentence(String s, int n) {
			String[] sp = s.split(" "); //O[N]
			String empty=""; //O[1]
			for (int i = 0; i < n; i++) { //O[N]
				empty=empty+" "+sp[i]; //O[N]
			}
			return empty.trim();
			
		}
		
}
