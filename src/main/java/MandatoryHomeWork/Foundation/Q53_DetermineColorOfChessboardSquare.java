package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q53_DetermineColorOfChessboardSquare {
	
	/** 1) Split the string into tocharArray()
	 *  2) Iterate with for loop with the length of char[]
	 *  3) check for the condition if (ch[i]%2==0 && ch[i+1]%2==0 || ch[i]%2!=0 && ch[i+1]%2!=0)
	 *  4) if yes return true else return false
	 * 
	 */
	@Test
	public void test1() {
		boolean determineColorOfChessboardSquare = determineColorOfChessboardSquare("a1");
		Assert.assertEquals(false, determineColorOfChessboardSquare);
	}
	
	@Test
	public void test2() {
		boolean determineColorOfChessboardSquare = determineColorOfChessboardSquare("h3");
		Assert.assertEquals(true, determineColorOfChessboardSquare);
	}
	@Test
	public void test3() {
		boolean determineColorOfChessboardSquare = determineColorOfChessboardSquare("c7");
		Assert.assertEquals(false, determineColorOfChessboardSquare);
	}
	public boolean determineColorOfChessboardSquare(String st) {
		boolean square=true;
		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length-1; i++) {
			if(ch[i]%2==0 && ch[i+1]%2==0 || ch[i]%2!=0 && ch[i+1]%2!=0) {
				square=false;
				break;
			}
		}
		return square;
	}
	

}
