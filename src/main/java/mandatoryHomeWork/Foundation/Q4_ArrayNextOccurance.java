package mandatoryHomeWork.Foundation;

import org.junit.Test;

import junit.framework.Assert;

public class Q4_ArrayNextOccurance {
	
	/**
	 * 1) input char array arr, target char
  	2) output char
	3) condition asscii value of character getting value k=107
	4) 	arr[i]>k
		{
	 arr[i];
	 break;
	}
	 */
	@Test
	public void text1() {
		char target='e';
		char sortedarrayOccurance = SortedarrayOccurance(new char[] {'b','d','h','x','z'}, target);
		Assert.assertEquals('h', sortedarrayOccurance);
	}

	public char SortedarrayOccurance(char[] arr,char k) {
		char nextOccurance=' ';
		for (char c : arr) {
            int asciiValue = (int) c;
			if(asciiValue>k) {
				nextOccurance=c;
				break;
		}
	}
		System.out.println(nextOccurance);
		return nextOccurance;
	}}
	

