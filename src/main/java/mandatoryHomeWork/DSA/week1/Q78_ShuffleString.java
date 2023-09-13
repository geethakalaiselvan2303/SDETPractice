package mandatoryHomeWork.DSA.week1;

import org.junit.Test;

public class Q78_ShuffleString {
	
	/*  1. Declare an character array with length 
	 *  2. Iterate with string length 
	 *  3. store the corresponding indices in the created array
	 *  4. use String.valueOf to convert the character array into string
	 *  
	 *  TIme Complexity---> O[n]
	 * 
	 */
	
	@Test
	public void test1() {
		String restoreString = restoreString("codeleet", new int[] {4,5,6,7,0,2,1,3});
		System.out.println(restoreString);
	}
	
	@Test
	public void test2() {
		String restoreString = restoreString("abc", new int[] {0, 1, 2, 3});
		System.out.println(restoreString);
	}
	
	@Test
	public void test3() {
		String restoreString = restoreString("", new int[] {});
		System.out.println(restoreString);
	}
	
	 public String restoreString(String s, int[] indices) {
	        char[] empty=new char[indices.length];
	        for(int i=0;i<s.length();i++){
	           empty[indices[i]] =s.charAt(i);
	        }
	        return String.valueOf(empty);
	    }
	}

