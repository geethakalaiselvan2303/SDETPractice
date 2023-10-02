package mandatoryHomeWork.DSA.ClassWork.week3;

public class AlbhabeticIsPresent {

	public static void main(String[] args) {
		boolean flag=true;
		String a="qwert yuioplkjh gfdaszxcvb";
		int[] arr=new int[26];
		String replace = a.replace(" ", "");
		for (int i = 0; i < replace.length(); i++) {
			arr[replace.charAt(i)-'a']++;
		}
		
		for (int each:arr) {
			if(!(each>=1)) {
				flag=false;
			}
			}
		System.out.println(flag);
	}

}
