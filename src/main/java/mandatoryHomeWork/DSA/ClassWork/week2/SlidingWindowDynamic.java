package mandatoryHomeWork.DSA.ClassWork.week2;

public class SlidingWindowDynamic {

	public static void main(String[] args) {
		
		int[] n= {1,2,3,4,5};
//		int[] n= {4,2,7,11,7,6,25};
		int k=10,sum=0,output=n.length;
		int left=0,right=0;
		
		while(right<=n.length) {
			if(sum>=k) {
				 sum=sum-n[left++]; 
		  }
		  else {
			  if(right==n.length)
				  break;
			  sum=sum+n[right++]; 
		  }
		}
			
			System.out.println(right-left+1);
		


	}
}