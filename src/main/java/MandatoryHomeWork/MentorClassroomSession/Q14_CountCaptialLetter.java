package MandatoryHomeWork.MentorClassroomSession;

import org.junit.Test;

public class Q14_CountCaptialLetter {
	/* // count the captial letter 
		1. Input-->str, output--> int
		2. testdata--> "ILoveIndia"  -ve-->"iloveindia" edge-->""
		Psedo
		1. Declare the count=0
		2. Convert string into tocharArray[]
		3. Iterate with each character and check for the ascii value between 65 to 90
		4. if yes count++
		5. return count 
	 */
	
	@Test
	public void test1() {
		System.out.println(captialCount("ILoveIndia"));
	}
	@Test
	public void test2() {
		System.out.println(captialCount("iloveindia"));
	}
	@Test
	public void test() {
		System.out.println(captialCount(""));
	}
	public int captialCount(String s){
		int count=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
		if(ch[i]>=65 && ch[i]<=90){
		count++;
		}
		}
		return count;
}
}