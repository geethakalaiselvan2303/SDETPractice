package mandatoryHomeWork.MentorClassroomSession.Mentor_DSA;

public class ReverseStringWithSpecialCharacters {

	
	public static void main(String[] args) {
		String s="I Lov!@#$%e My Country";
		String rev="";
		String[] split = s.split(" ");
		for (String str : split) {
			if(str.length()<2) {
				rev=rev+str+" ";
			}
			else {
				rev=rev+reverse(str)+" ";
			
		}
		}
		System.out.println(rev.trim());
		}

	public static String reverse(String str) {
		int left=0,right=str.length()-1;
		char[] ch = str.toCharArray();
		while(left<right) {
		if(Character.isAlphabetic(ch[left]) && Character.isAlphabetic(ch[right]) ){
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
		else if(!Character.isAlphabetic(ch[left])) {
			left++;
		}
		else if(!Character.isAlphabetic(ch[right])) {
			right--;
		}
		}
		
		return String.valueOf(ch);
	}
		
		}
	

