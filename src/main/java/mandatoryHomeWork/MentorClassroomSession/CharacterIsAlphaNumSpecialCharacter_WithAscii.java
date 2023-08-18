package mandatoryHomeWork.MentorClassroomSession;

public class CharacterIsAlphaNumSpecialCharacter_WithAscii {

	public static void main(String[] args) {
		char ch='A';
		if(ch>=33&&ch<=47 || ch>=58 &&ch<=64) {
			System.out.println("Special");
		}
		else if(ch>=53&&ch<=127) {
			System.out.println("alphabet");
		}
		else if(ch>=48 &&ch<=57){
			System.out.println("Number");
		}
	
	}

}
