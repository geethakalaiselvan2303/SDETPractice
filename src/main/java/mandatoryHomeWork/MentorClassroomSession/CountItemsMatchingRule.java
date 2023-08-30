package mandatoryHomeWork.MentorClassroomSession;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CountItemsMatchingRule {
	
	/*  Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], 
	 *  ruleKey = "color", ruleValue = "silver"
		Output: 1
		Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
		
		pcode
		1. Declare the count=0
		1. Iterate through each string array
		2. the poistion type=0. color=1,name=2
		3. compare the rulekey with each index value
		4. check for the condition if each rulekey is equal to type/color/name and index values to ruleValue
		5. if yes count++
		6. return count
	 * 
	 */
	
	@Test
	public void test1() {
		CountItemsMatchingRule(Arrays.asList(
							//type,color,name
			    new String[]{"phone", "blue", "pixel"},
			    new String[]{"computer", "silver", "lenovo"},
			    new String[]{"phone", "gold", "iphone"}
			),"color","silver");}
	
	@Test
	public void test2() {
		CountItemsMatchingRule(Arrays.asList(
							//type,color,name
			    new String[]{"phone","blue","pixel"},
			    new String[]{"computer","silver","phone"},
			    new String[]{"phone", "gold", "iphone"}
			),"type","phone");}


	public int CountItemsMatchingRule(List<String[]> list, String ruleKey, String ruleValue) {
		 String type="type";
         String color="color";
         String name="name";
         int count=0;
		for (int i = 0; i < list.size(); i++) {
			String[] eachlist = list.get(i);
			if(ruleKey.equals(type) && eachlist[0].equals(ruleValue)) {
					count++;
				}
				else if(ruleKey.equals(color) && eachlist[1].equals(ruleValue)) {
					count++;
				}
				else if(ruleKey.equals(name) && eachlist[2].equals(ruleValue)) {
						count++;
					}
				
		
	}

	
		System.out.println(count);	
		return count;

	}}