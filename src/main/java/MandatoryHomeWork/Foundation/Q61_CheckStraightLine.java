package MandatoryHomeWork.Foundation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class Q61_CheckStraightLine {
	@Test
	public void test1() {
		CheckStraightLine(new int[][] {{1, 2},{2, 3},{3, 4},{4, 5},{5, 6},{6, 7}});
	}
	
	/*Pseudo Code 
	 
	 Hint from Internet is - Formula for straight line => {y= mx+c} x,y are point coordinates ; m is slope ; c constant
	 // m = y/x = y2-y1/x2-x1 = y-y1/x-x1
	 if the input array has number of coordinates less than equal to 2 -> It is a line by default - Return true
	 From the 2D array extract the x,y from two consecutive elements to be able to get the slope from 0th and 1st indexes
	 Loop from the 2nd pair until end of loop and check if same slope is maintained throughout the loop 
	 if condition m slope != current slope - Return false 
	 else return true 
	 	 
	 */



	public boolean CheckStraightLine(int[][] coordinates) {
		  if(coordinates.length<=2)
	        {
	            return true;
	        }

	        int x1 = coordinates[0][0];
	        int y1 = coordinates[0][1];
	        int x2 = coordinates[1][0];
	        int y2 = coordinates[1][1];

	       // int slope_m = (y2-y1)/(x2-x1); // (y-y1)/(x-x1)
	        for (int i=2;i<coordinates.length;i++)
	        {
	           int x = coordinates[i][0];
	           int y = coordinates[i][1];
	           
	           if((y2-y1)*(x-x1)!=(y-y1)*(x2-x1))
	           {
	               return false;
	           }
	          
	        }
	       return true; 

		
	}

}
