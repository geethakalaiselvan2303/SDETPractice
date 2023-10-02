package mandatoryHomeWork.DSA.ClassWork.week3;

public class Hashing {
	
	public static void main(String[] args) {
		
		int SizeOfTheArray=16;
		int hashCode = "SizeOfTheArray".hashCode();
		int boxed =hashCode>>>16;
		System.out.println((SizeOfTheArray-1)& boxed);
		
	}

}
