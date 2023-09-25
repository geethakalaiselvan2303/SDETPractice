package mandatoryHomeWork.DSA.ClassWork.week1;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SummaryRanges_TwoPointer {
	
	@Test
	public void test1() {
		List<String> list=new ArrayList<>();
		int[] arr= {0,2,3,4,6,8,9};
		int start=0,end=1;
		String result="";
		int resStart=start;
		if(arr.length==1) {
			list.add(arr[0] + "");
	         System.out.println(list);
		}
		while(end<arr.length) {
			if(arr[end]-arr[start]==1) {
				start++;
				end++;
			}
			else if(start>0){
				result=resStart+"->"+arr[end-1];
				resStart=arr[end];
				start++;
				end++;
				list.add(result);
			}
			else {
				result=Integer.toString(resStart);
				list.add(result);
			}
		}
		
		System.out.println(list);
		
	}

}
