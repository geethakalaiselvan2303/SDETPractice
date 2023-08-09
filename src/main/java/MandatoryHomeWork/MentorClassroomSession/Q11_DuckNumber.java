package MandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.testng.Assert;

public class Q11_DuckNumber {

	/*	1. input--> integer
   		   output--> boolean
   		2.  testData-->  3056,0045,7899,04505
		3. Convert the interger into string 
		4. convert the string into int[] and add the arr[] into the list
		5. check the first index position is zero if zero then remove the first digit
		6. Then check if the list have zero 
		7. if yes return true else return false	 */
	@Test
	public void test1(){
		boolean duckNumber = duckNumber("10045");
		System.out.println(duckNumber);
		Assert.assertEquals(duckNumber, true);
	}
	@Test
	public void test2(){
		boolean duckNumber = duckNumber("01444");
		System.out.println(duckNumber);
		Assert.assertEquals(duckNumber, false);

	}
	@Test
	public void test3(){
		boolean duckNumber = duckNumber("4505");
		System.out.println(duckNumber);
		Assert.assertEquals(duckNumber, true);

	}

	public boolean duckNumber(String s){
	List<Integer> list=new ArrayList<Integer>();
	int[] arr=new int[s.length()];
	for(int i=0;i<s.length();i++){
	 arr[i]=Character.getNumericValue(s.charAt(i));
	 }
	for(int i=0;i<arr.length;i++){
		 list.add(arr[i]);
		 }
	System.out.println(list.get(0));
	 if(list.get(0)==0)
		 list.remove(0);

	 return list.contains(0);
}
}