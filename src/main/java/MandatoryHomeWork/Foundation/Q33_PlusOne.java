package MandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Q33_PlusOne {
	
	@Test
	public void test1() {
		plusOne(new int[] {9});
	}
	@Test
	public void test2() {
		plusOne(new int[] {1,2,4,9});
	}

	public List<Character> plusOne(int[] input) {
		String concat="";
		for (int i = 0; i < input.length; i++) {
			concat=concat+input[i];
		}
		int addplusone = Integer.parseInt(concat);
		System.out.println(addplusone);
		int add=addplusone+1; //1250
		System.out.println(add);
		String st = Integer.toString(add);  //int to string
		char[] ch = st.toCharArray(); //['1','2','5','0'] 
		List<Character> list=new ArrayList<>();
		for (char c : ch) {
			list.add(c);
		}
		System.out.println(list);
		return list;
	}

}
