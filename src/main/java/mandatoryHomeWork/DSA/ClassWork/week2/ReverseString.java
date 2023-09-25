package mandatoryHomeWork.DSA.ClassWork.week2;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1="RADDAR";
		
//		int left=0,right=s1.length()-1;
		
		//Odd
//		int center=s1.length()/2;
//		int left=center-1,right=center+1;
		
		//even
		int center=s1.length()/2;
		int left=center-1,right=center;
		
		boolean flag=true;
		while(left<right) {
			if(s1.charAt(left)!=s1.charAt(right)) {
				flag=false;
			}
			left++;
			right--;
		}
		System.out.println(flag);
	}
	

}
