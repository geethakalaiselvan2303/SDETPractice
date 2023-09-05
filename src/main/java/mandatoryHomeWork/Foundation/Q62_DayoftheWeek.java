package mandatoryHomeWork.Foundation;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.junit.Test;

public class Q62_DayoftheWeek {
	// https://leetcode.com/problems/day-of-the-week/
	/* 3.Get the totaldays count for previous month to given date using lengthOfMonth()
	4. Check for the leap year or not
	5. if leap year the days=366-totaldays
	6. else days=365-totaldays
	7. Store the key and value into map as {Sunday=1,monday=2 etc}
	8. using getWeekDay method-> get the startDay of the year
	9. Get the startDay value from map =Monday(2)
	10. iterate with days and intiliaze the noWeekdays=7 and startDay=0
	11. increment startDay++
	12. then in else if condition if(startDay==noWeekdays)
	13. if yes reset the startDay=0
	14. From the startDay value, Iterate with map and get the corresponding key
	15 print the key */
	
	@Test
	public void test1() {
		DayoftheWeek(15,8,2023);
	}

	public String DayoftheWeek(int date, int month, int year) {
		int startMonth=1,monthdays=0,totalDays=0,noWeekdays=7,startDay = 0;
		String result = null;
		Map<String,Integer> map=new HashedMap<String,Integer>();
		map.put("SUNDAY",1);
		map.put("MONDAY",2);
		map.put("TUESDAY",3);
		map.put("WEDNESDAY",4);
		map.put("THURSDAY",5);
		map.put("FRIDAY",6);
		map.put("SATURDAY",7);
		DayOfWeek startDayofyear;
		while(startMonth<month){
		YearMonth YearMonthobj= YearMonth.of(year, startMonth);
		int noOfDaysPreviousMonth=YearMonthobj.lengthOfMonth();
		monthdays=monthdays+noOfDaysPreviousMonth;
		startMonth++;
		}
		totalDays=date+monthdays;
		if(year%4==0) {
			totalDays=totalDays+1;
		}
		LocalDate dt = LocalDate.of(year, 1, 1);
		startDayofyear=dt.getDayOfWeek();
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		if(startDayofyear.toString().equals(entry.getKey()))
		  startDay = entry.getValue()-1;
		}
		for (int i = 1; i<=totalDays ; i++) { 
			startDay++; 
		    if(startDay==noWeekdays) {
				startDay=0;
			}
		} 
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
		if(startDay==entry.getValue())
			 result =entry.getKey();
			}
		System.out.println(result);
		return result;
	}

}
