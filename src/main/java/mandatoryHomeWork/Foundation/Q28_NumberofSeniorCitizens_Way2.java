package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q28_NumberofSeniorCitizens_Way2 {
	
	/***
	 * assign count=0variable
	 *  1) Iterate with each indices and get the age using substring
	 *  2) convert the string into integer(age)
	 *  3) check if age>60
	 *     count++
	 *  
	 *  
	 */
	
	@Test
	public void test1() {
		int numberofSeniorCitizens = NumberofSeniorCitizens(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
		Assert.assertEquals(2, numberofSeniorCitizens);
	}
	@Test
	public void test2() {
		int numberofSeniorCitizens = NumberofSeniorCitizens(new String[] {"1313579440F2036","2921522980M5644"});
		Assert.assertEquals(0, numberofSeniorCitizens);
	}
	

	public int NumberofSeniorCitizens(String[] str) {
		int count=0;
		int age = 0;
		for (int i = 0; i < str.length; i++) { 
			age =(str[i].charAt(11)-'0')*10+(str[i].charAt(12)-'0');
			if(age>60)
				count++;
		}	
		System.out.println(count);
		return count;
		
		
	}

}
