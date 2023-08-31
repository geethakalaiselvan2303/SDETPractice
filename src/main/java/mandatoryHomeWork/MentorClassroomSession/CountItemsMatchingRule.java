package mandatoryHomeWork.MentorClassroomSession;

import java.util.ArrayList;
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
	List<List<String>> items = new ArrayList<>();
    items.add(0, Arrays.asList("phone","blue","pixel"));
    items.add(1, Arrays.asList("computer","silver","lenovo"));
    items.add(2, Arrays.asList("phone","gold","iphone"));

}
	
	@Test
	public void test2() {
		List<List<String>> items = new ArrayList<>();
        items.add(0, Arrays.asList("phone","blue","pixel"));
        items.add(1, Arrays.asList("computer","silver","lenovo"));
        items.add(2, Arrays.asList("phone","gold","iphone"));
        
	}

	public int CountItemsMatchingRule(List<List<String>> list, String ruleKey, String ruleValue) {
		int count=0;
		for (int i = 0; i < list.size(); i++) {
			if(ruleKey.equals("type") &&list.get(i).get(0).equals(ruleValue)) {
					count++;
				}
				else if(ruleKey.equals("color") && list.get(i).get(1).equals(ruleValue)) {
					count++;
				}
				else if(ruleKey.equals("name") && list.get(i).get(2).equals(ruleValue)) {
						count++;
					}
				
		
	}

	
		System.out.println(count);	
		return count;

	}
}

