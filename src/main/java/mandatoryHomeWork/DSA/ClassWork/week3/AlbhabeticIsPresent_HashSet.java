package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.HashSet;

public class AlbhabeticIsPresent_HashSet {

	public static void main(String[] args) {
		String a="qwert yuioplkjh gfdaszxcvb";
//		String a="zxcvb nmlkjhgf dsaqwertyuiop";
		HashSet<Character> set=new HashSet<Character>();
		for (char c : a.toCharArray()) {
			if(c!=' ') {
			set.add(c);}
		}
		if(set.size()==26) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
		
	}

}
