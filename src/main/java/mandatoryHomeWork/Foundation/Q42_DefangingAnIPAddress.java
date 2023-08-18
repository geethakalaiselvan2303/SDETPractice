package mandatoryHomeWork.Foundation;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;
import org.testng.Assert;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class Q42_DefangingAnIPAddress {
	//https://leetcode.com/problems/defanging-an-ip-address/
	
	@Test
	public void test1() {
		String defangingAnIPAddress=defangingAnIPAddress("1.1.1.1");
		System.out.println(defangingAnIPAddress);
		Assert.assertEquals("1[.]1[.]1[.]1", defangingAnIPAddress);
	}
	
	@Test
	public void test2() {
		String defangingAnIPAddress=defangingAnIPAddress("255.100.50.0");
		System.out.println(defangingAnIPAddress);
		Assert.assertEquals("255[.]100[.]50[.]0", defangingAnIPAddress);
	}

	public String defangingAnIPAddress(String s) {
		char[] ch = s.toCharArray();
		String shifchar = "";
		for (int i = 0; i < ch.length; i++) {
			if(Character.isDigit(ch[i])) {
				shifchar=shifchar+ch[i];
			}
			else {
				shifchar=shifchar+"[.]";
			}
		}
		return shifchar;
		}
		
	}

