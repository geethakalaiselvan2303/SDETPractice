package mandatoryHomeWork.DSA.ClassWork.week2;

import java.util.Arrays;

public class PalidromeString {

	public static void main(String[] args) {
		
		String str="This is a Teet";
		String[] s = str.split(" ");
		boolean[] len=new boolean[s.length];
		int left=0;
		while(left<s.length) {
			if(ispalindrome(s[left])) {
				len[left]=true;
				left++;
			}
			else {
				len[left]=false;
				left++;
			}
		}
		System.out.println(Arrays.toString(len));

	}

	public static boolean ispalindrome(String s1) {
		boolean flag=true;
		int left=s1.length()/2-1,right = 0;
		if(s1.length()%2==0) {
			right=s1.length()/2;
		}
		else {
			right=s1.length()/2+1;
		}
		while(right<s1.length()) {
			if(s1.charAt(left)!=s1.charAt(right)) {
				flag=false;
			}
			left--;
			right++;
		}
		return flag;
		
	}

}
