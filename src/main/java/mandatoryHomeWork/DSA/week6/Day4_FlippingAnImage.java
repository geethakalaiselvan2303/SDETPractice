package mandatoryHomeWork.DSA.week6;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

public class Day4_FlippingAnImage {
	
	/*  https://leetcode.com/problems/flipping-an-image/submissions/
	 *  Iterate with each row and reverse the each row
	 *  Iterate with array and check for the condition 
	 *  	if '0' change it to 1
	 *  	if '1' change it to 0
	 *  
	 *  Time complexity--> O[m*n]
	 *  space complexity--> o[1]
	 * 
	 */
	
	@Test
	public void test1() {
		flippingAnImage(new int[][] {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}});
	}

	public void flippingAnImage(int[][] arr) {
		int rows=arr.length;
		int column=arr[0].length;
			for (int i = 0; i < arr.length; i++) {
				int start=0;
				int end=arr[i].length-1;
				while(start<end) {
					int temp=arr[i][start];
					arr[i][start]=arr[i][end];
					arr[i][end]=temp;
					start++;
					end--;
				}
			}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==0) {
					arr[i][j]=1;
				}
				else {
					arr[i][j]=0;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
		
    }
	

	
}
