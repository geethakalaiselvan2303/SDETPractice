package MandatoryHomeWork.MentorClassroomSession;

public class CharacterIsAlphaNumSpecialCharacter {

	public static void main(String[] args) {
		char ch='1';
		if(Character.isAlphabetic(ch)) {
			System.out.println("alphabet");
		}
		else if(Character.isDigit(ch)) {
			System.out.println("alphabet");
		}
		else {
			System.out.println("special");
		}
	
	}

}
