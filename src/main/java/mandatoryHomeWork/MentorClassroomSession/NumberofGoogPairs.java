package mandatoryHomeWork.MentorClassroomSession;

public class NumberofGoogPairs {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,1,1,3};
		int count=0;
				for(int i=0;i<arr.length-1;i++){
				if(arr[i]==arr[i+1]){
				count++;
				}
				}
				System.out.println(count);
	}

}
