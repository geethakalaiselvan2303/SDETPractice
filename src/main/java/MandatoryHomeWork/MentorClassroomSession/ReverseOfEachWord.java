package MandatoryHomeWork.MentorClassroomSession;

public class ReverseOfEachWord {
	/* 1. split the word using split 
	 * 2. iterate to each word and reverse
	 * 
	 */

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		String st="We are Tester";
		String ans="";
		String[] split = st.split(" ");
		for (String s : split) {
			ans=reverse(s);
			sb.append(ans).append(" ");
		}
		
		System.out.println(sb);

}

	public static String reverse(String s) {
		String rev="";
		for (int i =s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}
}