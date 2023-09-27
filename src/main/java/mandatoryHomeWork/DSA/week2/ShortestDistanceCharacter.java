	package mandatoryHomeWork.DSA.week2;
	
	import java.util.Arrays;
	
	public class ShortestDistanceCharacter {
	
		/*  https://leetcode.com/problems/shortest-distance-to-a-character/description/
		 *  1. initialize the POS as -ve length(POS=-str.length)
		 *  2. Iterate with string index starts from 0 to still length
		 *  3. check for the condition whether it's 'C'
		 *  	if it's C the assign POS = index value.
		 *      store the values in the output as i-POS(still it find C character)
		 *  4. Iterate with string index starts from str.length to 0
		 *  5. Check for the condition whether it's 'C'
		 *  	if it's C the assign POS = index value.	
		 *  	store the values in the output as i-POS. Compare the values with already store value in the output array.
		 *  	(still it find C character)
		 *  6. Return output.
		 *  
		 *  Time complexity-->O[N]
		 *  Space Complexity-->O[N]
		 *  	
		 *      
		 */
		public static void main(String[] args) {
			String s = "loveleetcode";
			char c='e';
			int n = s.length();
			int[] output = new int[n];
			int pos = -n;
			for (int i = 0; i < n; i++) {
				if(s.charAt(i)==c) {
					pos=i;
				}
				output[i]=i-pos;
			}

			for (int i =n - 1; i >= 0; i--) {
				if(s.charAt(i)==c) {
					pos=i;
				}
				output[i]=Math.min(output[i],Math.abs(i-pos));
			}
			
			System.out.println(Arrays.toString(output));

		}
	
	}
