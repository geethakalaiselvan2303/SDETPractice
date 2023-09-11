package mandatoryHomeWork.AsssessmentQuestion;

import java.util.Arrays;

public class Q3_Panagram {
	
	/*
	 *  1. Declare the empty array with length 26
	 *  2. Iterate with string array
	 *  3. remove the space 
	 *  4. iterate with each character
	 *  5. store the corresponding character ascii values in the empty array
	 *  5. check for the condition whether whether coresponding location is zero
		 *  if yes increment the character
		 *  	At last check for the empty array whether all the values are > zero
		 *  if yes return 1 
		 *  	else return 0
		 *  
		 *  Time complexity --> O[N]
		 *   
	 */

	public static void main(String[] args) {
		String[] str= {"abc defghijklm nopqrst uvwxyz","this is hackerrank program"};
		int[] empty=new int[26];
		String rev="";   
		String concat="";
		for(String s:str){
		Arrays.fill(empty, 0);  //o[n]
		String s1=s.replace(" ","");
		for(int i=0;i<s1.length();i++){ //o[n]
		 if(empty[s1.charAt(i)-'a']==0){
			empty[s1.charAt(i)-'a']++;
		}
		}
		for(int j=0;j<26;j++){ //o[n]
		if(empty[j]==0){
		 rev="0";
		 break;
		 }
		 else{
		 rev="1";
		 }
		}
		
		concat=concat+rev;
		 }
		
		 System.out.println(concat);
		
	}
}
