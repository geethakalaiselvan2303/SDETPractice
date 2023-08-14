package MandatoryHomeWork.MentorClassroomSession;

import java.util.Iterator;

import org.junit.Test;

public class Q13_ReverseArray_Way1 {
	
/*  1. create and empty char arr[]
	2. Iterate with loop from the lenght of the char minus one
	3. strore the values in the arr[]
	4. return the arr			
 */
	
	@Test
	public void test1() {
		revchar(new char[] {'a', 'b', 'c', 'd', 'e'});
	}
	public char[] revchar(char[] s) {
		char[] a=new char[s.length];
		int j=0;
		for (int i = s.length-1; i >=0; i--) {
			a[j]=s[i];
			j++;
		}
		System.out.println(a);
		return a;
  
	}	
}	