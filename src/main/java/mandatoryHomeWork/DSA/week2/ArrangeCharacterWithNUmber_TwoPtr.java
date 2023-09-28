package mandatoryHomeWork.DSA.week2;

public class ArrangeCharacterWithNUmber_TwoPtr {

	public static void main(String[] args) {
		
		/*  .S = ‘aaabbccaad’
			O/p = ‘a3b2c2a2d’
			 1. initialize the variable left=0,right=1 and empty string variable;
			 2. Iterarte with each character
			 3. check for the condition whether first char and next char is same 
			 	if same increment the right pointer
			 4. if not then append the first and right count
			 5. return the strin	
		 * 
		 */
		
		
		String s = "aaabbccaad";
        int left = 0, right = 0;
        StringBuilder emp = new StringBuilder();

        while (right < s.length()) {
            char c = s.charAt(left);
            int count = 1;
            while (right + 1 < s.length() && s.charAt(right) == s.charAt(right + 1)) {
                right++;
                count++;
            }
            emp.append(c).append(count);
            left = right + 1;
            right = left;
        }

        System.out.println(emp.toString());
    }

}
