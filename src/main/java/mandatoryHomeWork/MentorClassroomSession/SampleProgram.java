package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SampleProgram {

	public static void main(String[] args) {
		String concat="";
		int count=1,left=0;
		long n=2225422211987654323l; //2-3
		int remainder=0;
		List<Integer> list=new ArrayList<Integer>();
		List<String> list1=new ArrayList<String>();
		while(n>0) {
			remainder=(int) (n%10);
			n=n/10;
			list.add(remainder);
		}
		Collections.reverse(list);
		String concat1;
		for (int i = 0; i < list.size()-1; i++) {
			left=list.get(i);
			while(list.get(i)==list.get(i+1)) {
			  count++;
			  i++;
			}
			concat=left+"->"+count;
			list1.add(concat);
			count=1;
		}
		System.out.println(list1);
	}

	
}
