package MandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q54_ExcelNumbertoTitleConversion {
	
	/**
	 * if(n>26) Take the remainder and quo the concat both
	 * else Take only the remainder
	 * 
	 */
	@Test
	public void test1() {
		StringBuilder excel=ExcelNumbertoTitleConversion(701);
		Assert.assertEquals("ZY", excel);
	}
	@Test
	public void test2() {
		StringBuilder excel=ExcelNumbertoTitleConversion(1);
		Assert.assertEquals("A", excel);
	}
	@Test
	public void test3() {
		StringBuilder excel=ExcelNumbertoTitleConversion(25);
		Assert.assertEquals("Y", excel);
	}
	

	public StringBuilder ExcelNumbertoTitleConversion(int n) {
		StringBuilder sb = new StringBuilder();
			if(n>26) {
			char quo = (char) ('A'-1 + (n / 26));
			sb.append(quo);
			char rema = (char) ('A'-1 + (n % 26));
			sb.append(rema);
			System.out.println(sb);
		  }
			else {
				char rema = (char) ('A'-1 +(n % 26));
				sb.append(rema);
				System.out.println(sb);
			}
		
		return sb;
	}

}
