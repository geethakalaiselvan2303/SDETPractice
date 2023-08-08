package MandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;

public class ArmstrongNumber {
	@Test
	public void test1(){
		arm(123);
	}

	public boolean arm(int arr){
		int result=0;
		int actual=arr;
		String s=Integer.toString(arr); // "123"
		int[] n=new int[s.length()];
		for(int i=0;i<s.length();i++){
			n[i]=Character.getNumericValue(s.charAt(i));
		}
		System.out.println(Arrays.toString(n));
		for(int i=0;i<n.length;i++){
			result=result+n[i]*n[i]*n[i];
		}
		System.out.println(result);
		if(actual==result) {
			return true;
		}
		else {
		return false;
		}
		}

}

