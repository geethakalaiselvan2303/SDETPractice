package mandatoryHomeWork.DSA.ClassWork.week1;

import org.junit.Test;

public class ReverseString_TwoPointer {

	@Test
	public void TwoPointer1() { 
		String s="geetha"; 
		char temp=' ';
		int j=s.length()-1;
		char[] ch = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if(i<j) {
			temp=ch[i];
			ch[i]=ch[j];
			ch[j]=temp;
			j--;
		}
		}
		
		System.out.println(String.valueOf(ch));

	}
	
	@Test
	public void TwoPointer2() { 
		String s="geetha"; 
		char[] ch = s.toCharArray();
		int start=0,end=s.length()-1;
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end--]=temp;
		}
		
		System.out.println(String.valueOf(ch));
	}
}
