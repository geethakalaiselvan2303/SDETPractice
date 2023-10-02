package mandatoryHomeWork.DSA.ClassWork.week3;

public class Anagram_Array {
	
	// https://leetcode.com/problems/valid-anagram/submissions/

	public static void main(String[] args) {
		int[] result=new int[26];
		String s="anagram",t="nagaram";
		int left=0,right=0;
		for (int i = 0; i < s.length(); i++) {
			result[s.charAt(i)-'a']--;
			result[t.charAt(i)-'a']++;
		}
		
		for (int c : result) {
			if(c!=0) {
				System.out.println(" NOt Anaggarm");
			}
			else {
				System.out.println("Anagarm");
			}
		}
			
		}

	

}
