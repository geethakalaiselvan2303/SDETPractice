package mandatoryHomeWork.MentorClassroomSession.Mentor_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {
	
	// Reverse list

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>(Arrays.asList(7,6,5,4,3,2,1));
		int left=0,right=list.size()-1;
		while(left<right) {
			int l = list.get(left);
			int r = list.get(right);
			int temp=l;
			l=r;
			r=temp;
			list.set(left, l);
			list.set(right, r);
			left++;
			right--;
		}
		System.out.println(list);
	}

}
