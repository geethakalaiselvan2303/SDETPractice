package mandatoryHomeWork.AsssessmentQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4_MergeTwoArrays {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3);
		List<Integer> b=Arrays.asList(2,5,5);
		System.out.println(a.size());
		int left=0,right=0;
        List<Integer> list=new ArrayList<>();
        while(left<a.size() && right<b.size()){
            if(a.get(left)<b.get(right)){
                list.add(a.get(left));
                left++;
            }
            else{
                list.add(a.get(right));
                right++;
                
            }
        }
         while(right<b.size() || left<a.size()){
             if(right!=b.size()){
                list.add(b.get(right));
           	 right++;

             }
             else if(left!=a.size()){
                 list.add(a.get(++left));
             }
         }
         System.out.println(list);
	}

}
