package MandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;

import org.junit.Test;
import org.testng.Assert;

public class PrintLastIndex {
	@Test
	public void test1() {
		int PrintLastIndex = PrintLastIndex("00001");
		Assert.assertEquals(4, PrintLastIndex);
	}
	@Test
	public void test2() {
		int PrintLastIndex = PrintLastIndex("0");
		Assert.assertEquals(-1, PrintLastIndex);
	}
	@Test
	public void test3() {
		int PrintLastIndex = PrintLastIndex("0010010");
		Assert.assertEquals(5, PrintLastIndex);
	}

	
	public int PrintLastIndex(String st){
		char[] ch=st.toCharArray();
		int[] arr=new int[ch.length];
		for (int i = ch.length-1; i>=0; i--) {
			arr[i]=Character.getNumericValue(ch[i]);
			if(arr[i]==1) {
				return i;
			}
		}
		return -1;
		
		}

	}