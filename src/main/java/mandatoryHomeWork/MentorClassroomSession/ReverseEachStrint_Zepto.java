package mandatoryHomeWork.MentorClassroomSession;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class ReverseEachStrint_Zepto {
	
	/* 
	 *  String input = "I Lov!@#$%e My Country";
		String output = "I evo!@#$%L yM yrtnuoC";
	 * 
	 * 1. Iterate with each word in the string 
	 * 2. If word contains special character then fetch the characters alone and reverse the word and store in fetchCharAlone
	 *  	use StringBuilder insert method-->iterate with each character if it's character the insert the same character which is present in fetchCharAlone
	 *  	if it's special character then insert the same in the actual string 
	 * 3. else reverse the word and return
	 * 
	 *    time complexity =O[m*n]
	 */
	
	public static String fetchCharAlone="";
	
	@Test
	public void test1() {
		String reverseEachStrint_Zepto = reverseEachStrint_Zepto("I Lov!@#$%e My Country");
		Assert.assertEquals(reverseEachStrint_Zepto, "I evo!@#$%L yM yrtnuoC");
	}
	// O[m*n]+O[n]=O[m*n]
	public String reverseEachStrint_Zepto(String ac) {
		String reverseString="";
		String[] split = ac.split(" ");
		for (String s : split) {
			String replace = reverseEachString(s);
			reverseString=reverseString+" "+replace;
		}
		return reverseString.trim();
		
	}
	
		public static String reverseEachString(String s) {
			Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
	        Matcher matcher = pattern.matcher(s);
	        StringBuilder sb=new StringBuilder();
	        if(matcher.find()) { //O[m*n]
	        	for (int i = s.length()-1; i>=0; i--) {  //O[m]
	    			if(Character.isAlphabetic(s.charAt(i))) {
	    				fetchCharAlone=fetchCharAlone+s.charAt(i);
	    			}
	    		}
	        	int j=0;
				for (int i = 0; i < s.length(); i++) {   //O[n]
				if(!Character.isAlphabetic(s.charAt(i))) {
						sb.insert(i,s.charAt(i));
					}
					else {
						sb.insert(i, fetchCharAlone.charAt(j));
						j++;
					}
  			}	
				return sb.toString();
	        }
	        else {
	        	String rev="";
				for (int i = s.length()-1; i>=0 ; i--) { //O[N]
					rev=rev+s.charAt(i);
				}
				return rev;
	        }
	        
		
		}

}		
		
		
		
