package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniqueNumber_HashSet {

	public static void main(String[] args) {
	int[] n= {1,2,1};
    Set<Integer> set=new HashSet<Integer>();
    for (int arr : n) {
    	if(set.contains(arr)) {
    		set.remove(arr);
    	}
    	else {
    		set.add(arr);
    	}
	}
    
    System.out.println(set.iterator().next());
    
	}

}
