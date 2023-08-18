package mandatoryHomeWork.Foundation;

import org.junit.Test;
import org.testng.Assert;

public class Q47_RemoveDigitFromNumbertoMaximizeResult
 {
  @Test
  public void test1() {
	  String removeDigitFromNumbertoMaximizeResult = removeDigitFromNumbertoMaximizeResult("123","3");
	  Assert.assertEquals("12", removeDigitFromNumbertoMaximizeResult);
  }
  @Test
  public void test2() {
	  String removeDigitFromNumbertoMaximizeResult = removeDigitFromNumbertoMaximizeResult("1231","1");
	  Assert.assertEquals("231", removeDigitFromNumbertoMaximizeResult);
  }
  @Test
  public void test3() {
	  String removeDigitFromNumbertoMaximizeResult = removeDigitFromNumbertoMaximizeResult("551","5");
	  Assert.assertEquals("51", removeDigitFromNumbertoMaximizeResult);
  }

  public String removeDigitFromNumbertoMaximizeResult(String s1, String s2){
	  StringBuilder result=new StringBuilder();
	  int count = 0;
	  for (char ch : s1.toCharArray()) {
          if (ch == s2.charAt(0) && count == 0) {
              count++;
          } else {
              result.append(ch);
          }
      }
	  System.out.println(result.toString());
	  return result.toString();
}
		
	
	
	
}
