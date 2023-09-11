package mandatoryHomeWork.AsssessmentQuestion;

public class Q2_longestEvenLengthWords {
	
	/* 1. Declare value=0;
	 * 2. split string and iterate with each word
	 * 3. get the length 
	 * 4. check it's even and length is greater
	 * 5. if yes return the string
	 *  
	 *  Time complexity--> O[N]
	 * 
	 */

	public static void main(String[] args) {
		String sentence = "Time to writesout great coderank";
		int value=0;
		String result="";
		String[] split = sentence.split(" ");
		for (String s : split) {
			if(s.length()%2==0 && s.length()>value) {
				value=s.length();
				result=s;
			}
		}
		System.out.println(result);
	}
}
