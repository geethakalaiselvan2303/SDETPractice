package MandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class findDuplicate {
	@Test
	public void test1() {
		findDuplicate(new int[] { 1,3,2,4,2 });
	}
	
	public boolean findDuplicate(int[] arr){
	List<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<arr.length;i++){
		list.add(arr[i]); // 1,3,2,4,4 == 5
		}
		
	Set<Integer> set=new HashSet<Integer>(list); //1,3,2,4 ==4
	return 	list.size()!=set.size();
	}
	
	}
