package MandatoryHomeWork.Foundation;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Q41_ExcelSheetColumnNumber

 /**
	 * 1. Spilt the string into character array
	 * 2. Iterate through the char[]
	 * 3. use for the position of the each string with the power of 26
	 * 4. Get the value and -the ascii value 64 then we'll the get number
	 * 5. add those number and print it.
	 */
 {
  	   @Test	
   	   public void test1() {
   		   excelSheetColumnNumber("ABC");
   		 }

   	   	public int excelSheetColumnNumber(String st) {
   	   		int temp = 0;
   	        char[] ch=st.toCharArray();
   	        for(int i=ch.length-1;i>=0;i--){
   	        	int ma=(int) Math.pow(26,ch.length-1-i);
   	        	int c=ch[i]-'A'+1 ;
   	            temp+=ma*c;
   	        }
   	        System.out.println(temp);
   	        return temp;
   	 }
   
}
