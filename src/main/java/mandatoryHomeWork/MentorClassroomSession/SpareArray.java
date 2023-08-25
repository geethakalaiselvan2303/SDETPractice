package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.List;

public class SpareArray {

	public static void main(String[] args) {
		/* StringList['ab','ab','abc']
		 * queries['ab','abc','bc']
		 * 1. spilt the StringList,queries
		 * 2. Iterate with StringList and queries 
		 * 3. compare the  StringList and queries 
		 * 4. if it's equal get the count and add it in the list
		 * 5. reset the count=0;
		 */
		String[] StringList={"ab","ab","abc"};
		String[] queries={"ab","abc","bc"};
		int count=0;
		List<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < StringList.length; j++) {
				if(queries[i].equals(StringList[j])) {
					count++;
				}
			}
			list.add(count);
			count=0;
		}
	
		System.out.println(list);
	}

}
