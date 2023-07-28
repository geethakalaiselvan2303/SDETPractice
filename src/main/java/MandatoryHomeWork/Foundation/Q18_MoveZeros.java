package MandatoryHomeWork.Foundation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Q18_MoveZeros {
	
	@Test
	public void test1() {
		int[] moveZerosAtEnd = moveZerosAtEnd(new int[]{0,1,0,3,12});
	    Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, moveZerosAtEnd);
	}
	@Test
	public void test2() {
		int[] moveZerosAtEnd = moveZerosAtEnd(new int[]{0,0});
	    Assert.assertArrayEquals(new int[]{0,0}, moveZerosAtEnd);
	}
 	public int[] moveZerosAtEnd(int[] num) { //0,1,0,3,12
         int k=0;
         for (int i = 0; i < num.length; i++) {
	       	 if(num[i]!=0) {	// k=0,i=1
        		 int temp=num[k]; // temp=num[0]==>0
        		 num[k]=num[i];  // num[0]=num[1] ==>1
        		 num[i]=temp;  //   num[1]=0  
        		 k++;	//{ 1,0,0,3,12}
        	 }
	      }
         System.out.println(Arrays.toString(num));
         return num;
        	 
        
 	    }
 		
 	}


