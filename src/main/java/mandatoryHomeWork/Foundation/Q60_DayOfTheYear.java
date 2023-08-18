package mandatoryHomeWork.Foundation;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.junit.Test;

public class Q60_DayOfTheYear {
	/*  1. input-> String
		2. output-->int
		3. testdata->+ve-->	"2019-06-01"
					 -ve-->	"2019-13-01"
							"2019-13-43"
		4. chect that it's a valid date format					
		5. get the month and date from the string and convert it to an integer
		6. Store date in a variable currentMonthDays
		7. from the month iterate with each month and get the total days of month. store it in variable noOfDaysPreviousMonth
		8. add the totalDays=currentMonthDays+noOfDaysPreviousMonth
		9. return totalDays
	 */
	@Test
	public void test1(){
		daysofYear("2019-01-09");
	}
	@Test
	public void test2(){
		daysofYear("2019-02-10");
	}
	@Test
	public void test3(){
		daysofYear("20-02-2019");
	}

	public int daysofYear(String s){
		int startMonth=1,monthdays=0,totalDays=0;
		if(checkvaliddateformat1(s)) {	
		String date=s.substring(8,s.length());
		int dateInt=Integer.parseInt(date);
		System.out.println(date);
		String month=s.substring(5,7);
		int monthInt=Integer.parseInt(month);
		System.out.println(monthInt);
		String year=s.substring(0,4);
		int yearInt=Integer.parseInt(year);
		System.out.println(yearInt);
		while(startMonth<monthInt){
			//referred google		
		YearMonth YearMonthobj= YearMonth.of(yearInt, startMonth);
		int noOfDaysPreviousMonth=YearMonthobj.lengthOfMonth();
		monthdays=monthdays+noOfDaysPreviousMonth;
		startMonth++;
		}
		totalDays=dateInt+monthdays;
		System.out.println(totalDays);
		}
		return totalDays;
		
}
	//this i have referred google
	public boolean checkvaliddateformat1(String s) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	     try {
	         LocalDate.parse(s, formatter);
	         return true;
	     } catch (DateTimeParseException e) {
	         return false; 
	     }
	}
}