package mandatoryHomeWork.Foundation;

public class InterviewQuestion2 {

	public static void main(String[] args) {
		String s="geetha",t="geeatha";
		int e1=0,e2=0;
		for (int i = 0; i < s.length(); i++) {
			e1=e1+(int)(s.charAt(i));
		}
		
		for (int j = 0; j < t.length(); j++) {
			e2=e2+(int)(s.charAt(j));
		}
		
		int result=(char)(e2-e1);
		System.out.println(result);
	}

}
