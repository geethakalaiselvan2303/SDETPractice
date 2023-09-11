package mandatoryHomeWork.DSA.week1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Q541_ReverseStringII {
	
	//https://leetcode.com/problems/reverse-string-ii/description/
	
	@Test
	public void test1() {
		String reverseStringII = reverseStringII("abcdefg",2);
		Assert.assertEquals(reverseStringII, "bacdfeg");
	}
//	@Test
//	public void test2() {
//		String reverseStringII = reverseStringII("abcd",2);
//		Assert.assertEquals(reverseStringII, "bacd");
//	}

	public String reverseStringII(String s, int k) {
		StringBuilder sb=new StringBuilder();
		List<String> list=new ArrayList<String>();
		int n=s.length();
		int g=k*2;
		String s1="";
		while(n>0) {
			int sub=s.length()-n;
			if(n>g) {
				s1=s.substring(sub,g);
				list.add(s1);
				n=n-g;
			}
			else {
				s1=s.substring(sub,s.length());
				list.add(s1);
				n=n-g;
			}
		}
		
			for (String st : list) {
				String result=reverse(st,k);
				sb.append(result).append(st.substring(result.length(),st.length()));
			}
		
		return sb.toString();
		
	}

	public String reverse(String st, int k) {
		String rev="";
		for (int i=k-1; i>=0; i--) {
			rev=rev+st.charAt(i);
		}
		return rev;
	}

}
