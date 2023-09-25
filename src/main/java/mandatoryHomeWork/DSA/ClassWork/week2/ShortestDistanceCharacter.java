package mandatoryHomeWork.DSA.ClassWork.week2;

import java.util.Arrays;

public class ShortestDistanceCharacter {

	/*  https://leetcode.com/problems/shortest-distance-to-a-character/description/
	 * 
	 */
	
	public static void main(String[] args) {
		String s="loveleetcode";
		char c='e';
		int founfCharIndex=0;
		int[] n=new int[s.length()];
		int left=0,right=0;
		while(left>=0 && right<s.length()) {
			if(s.charAt(right)!=c) {
				right++;
			}
			else {
				founfCharIndex=right;
				if(n[left]==0 && s.charAt(left)!=c) {
					while(s.charAt(left)!=c) {
					n[left]=founfCharIndex-left;
					left++;
					}
				}
				else {
					right++;
					if( right<s.length()&& n[right]==0) {
						while(s.charAt(right)!=c) {
							n[right]=right-founfCharIndex;
							right++;
							}	
					}
				}
				founfCharIndex=0;
				
			}

	}
		System.out.println(Arrays.toString(n));
}
}
