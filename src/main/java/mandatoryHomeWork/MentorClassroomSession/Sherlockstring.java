package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
	
	/*  1. Iterate with each character and then do map(key and value pair)
	 * 	2. create an array with length of map size
	 * 	3. Get the values and store it in newly created array
	 * 		Sort the newly created array
	 *  4. Get the values from the arrray based on index position(first,second,last,seconLast)
	 *  5. Check for the condition first==second
	 *  6. Check for the condition first==1 and second==last
	 *  7. Check for the condition first==second and second==secondLast and first==last-1
	 *  
	 *  11111      first= last                 - freq are same
		13333      first =1 and second = last - freq of 1 char is 1
		44445      first = second , second = secondLast , first = last -1
	 * 
	 *  Time Complexity --->  nlog(n)
	 *  
	 */

public class Sherlockstring {
	@Test
	public void test1() {
	String sherlockstring = Sherlockstring("aabbccddeefghi");
	System.out.println(sherlockstring);
	}

	public String Sherlockstring(String s) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
	     for (int i = 0; i < s.length(); i++) {
	          char c=s.charAt(i);
	         if(map.containsKey(c)){
	            map.put(c,map.get(c)+1);  // O(log n)
	         }
	         else{
	             map.put(c,1);
	         }
	     }
	     int[] check=new int[map.size()];
	     int j=0;
	     for (Map.Entry<Character,Integer> entry : map.entrySet()) {
	    	 check[j]=entry.getValue();
	    	 j++;
			
		} 
	     Arrays.sort(check);  //nLogN
	    int first=check[0]; 
	    int second=check[1];
	    int last=check[check.length-1]; 
	    int secondLast=check[check.length-2]; 
	    // 11111      first= last ---> freq are same
	    if(first==last) {
	    	return "YES";
	    }
	    //  13333      first =1 and second = last ---> freq of 1 char is 1
	    if(first==1 && second==last) {
	    	return "YES";
	    }
	    // 44445      first = second , second = secondLast , first = last -1
	    if(first==second && second==secondLast && secondLast==last-1) {
	    	return "YES";
	    }
		return "NO";
	    
	}

}
