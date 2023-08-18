package mandatoryHomeWork.MentorClassroomSession;

public class CharacterIsAlphaNumSpecialCharacter {

	public static void main(String[] args) {
		int count=0;
		char ch='A';
		if(Character.isUpperCase(ch)) {
			System.out.println(count++);
		
		}
		else if(Character.isDigit(ch)) {
			System.out.println("Dight");
		}
		else {
			System.out.println("special");
		}
	
	}

}
