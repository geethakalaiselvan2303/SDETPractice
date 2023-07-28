package MandatoryHomeWork.Foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Q41_ExcelSheetColumnNumber
 {
   @Test	
   public void test1() {
	   excelSheetColumnNumber("A");
	 }

   	public int excelSheetColumnNumber(String st) {
   		Map<String,Integer> map=new HashMap<String,Integer>();
   		int value = 1;
   		for(char i='A';i<='Z';++i) {
   			map.put(String.valueOf(i), value);
   		}
   		char[] ch = st.toCharArray();
   		for (int i = 0; i < ch.length; i++) {
   		
//   			A*Math.power(26,0)
   	}
   		System.out.println(value);
		return value;
   		
	
}
   
}
