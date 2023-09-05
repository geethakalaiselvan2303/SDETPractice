package mandatoryHomeWork.MentorClassroomSession;

public class ShuffleString {

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		char[] c=new char[s.length()];
		for (int i = 0; i < c.length; i++) {
			c[indices[i]]=s.charAt(i);
		}
		System.out.println(c);
	}

}
