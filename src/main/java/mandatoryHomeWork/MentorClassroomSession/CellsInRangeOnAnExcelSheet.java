package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CellsInRangeOnAnExcelSheet {
	
	/*	s = "K1:L2"
		Output: ["K1","K2","L1","L2"]
	
		1. Exact the row and col values
			. Use substring method to convert
			. convert to integer
			. exact the col name also
		2. iterate with array
			. col: col should start with charAt(0) and ends charAt(3)
			. row (i)
		3. 	concat the rows,col 
	 */
	@Test
	public void test1() {
		CellsInRangeOnAnExcelSheet("K1:L2");
	}
	@Test
	public void test2() {
		CellsInRangeOnAnExcelSheet("U7:X9");
	}

	public void CellsInRangeOnAnExcelSheet(String s) {
		String s1 = s.substring(1,2);
		String s2 = s.substring(4,s.length());
		int row=Integer.parseInt(s1);
		int col=Integer.parseInt(s2);
		List<String> list=new ArrayList<String>();
		for(char k=s.charAt(0);k<=s.charAt(3);k++){
		for(int i=row;i<=col;i++){
					
	  String concat=k+""+Integer.toString(i);
		  list.add(concat);
		  }
		  }
		  
		System.out.println(list);
	}

}
