package mandatoryHomeWork.MentorClassroomSession;

import java.util.Iterator;

import org.junit.Test;

public class Q13_ReverseArray_Way2 {
	
/*  input ch[] output -> arr
 *  1.Declare the left=0 and right=ch.length-1
 *  2. create a while until the left<right
 *  3. create temp variable. using the temp variable swap the left and right
 *  4. then increase the left++ and right--
 *  5. Then print the ch
 */
	
	@Test
	public void test1() {
		revchar(new char[] {'a', 'b', 'c', 'd', 'e'});
	}
	@Test
	public void test() {
		revchar(new char[] {});
	}
	
	public char[] revchar(char[] ch) {
		int left=0,right=ch.length-1;
		while(left<right){
		char temp=ch[left];
		ch[left]=ch[right];
		ch[right]=temp;
		left++;
		right--;  
	}	
		System.out.println(ch);
		return ch;
	}
}	