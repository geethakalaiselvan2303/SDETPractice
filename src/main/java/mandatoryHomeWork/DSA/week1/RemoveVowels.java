package mandatoryHomeWork.DSA.week1;

public class RemoveVowels {
	

	public static void main(String[] args) {
		/*	Input: "Hi testleaf students"
			Output: "H tstlf students"
			1. Defind the stringBuilder
			2. Iterate with each string array 
			3. check for the conditon if each char is equal to aeiou
			4. if not append with stringBuilder
			5. return the stringbuilder
	    */
		// o[n]+o[n]==o[n2]
		String s1="Hi testleaf students";
		StringBuilder sb=new StringBuilder();
		String result="";
		for (int i = 0; i < s1.length(); i++) {  //0[n]
				if(!(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'
					|| s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U')) {
					sb.append(s1.charAt(i)); //o[n]
			}
		}
		System.out.println(sb);
		}
		
	}


