package mandatoryHomeWork.DSA.week1;

import org.junit.Test;
import org.testng.Assert;

public class Q75_FaultyKeyboard {
	
	/*   https://leetcode.com/problems/faulty-keyboard/
	 * Declare the 2 empty string 1 for append and 1 for reverse
	 *  Iterate with string
	 *  check the character is 'i'
		 *  if not 'i' then concat the same with created empty string
		 *  if is equal to 'i' then reset the rev string 
		 		*  reverse the string and concat
	 *   return the concat string
	 *   
	 *   Time complexity--->o[n]
	 *   
	 */

	@Test //+ve
	public void test1() {
		String faultkeyboard = faultkeyboard("poiinter");
		Assert.assertEquals(faultkeyboard, "ponter");
	}
	 
	@Test  //-ve
	public void test2() {
		String faultkeyboard = faultkeyboard("ponter");
		Assert.assertEquals(faultkeyboard, "ponter");
	}
	
	@Test //-ve or edge
	public void test3() {
		String faultkeyboard = faultkeyboard("iiiiii");
		Assert.assertEquals(faultkeyboard, "");
	}
	
	@Test //edge
	public void test4() {
		String faultkeyboard = faultkeyboard("");
		Assert.assertEquals(faultkeyboard, "");
	}
	
	
	public String faultkeyboard(String s){
        String rev="",sb="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='i'){
                sb=sb+s.charAt(i);
            }
            else{
            	 rev="";	
                 for(int j=sb.length()-1;j>=0;j--){
                     rev=rev+sb.charAt(j);
                 }
                 sb=rev;
            }
        }
        System.out.println(sb);
        return sb;
    }
}

