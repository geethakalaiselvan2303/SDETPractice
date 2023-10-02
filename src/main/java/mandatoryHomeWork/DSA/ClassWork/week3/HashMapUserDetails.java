package mandatoryHomeWork.DSA.ClassWork.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapUserDetails {
	
    public static void main(String[] args) {

        Map<Integer, Employee> employeesMap = new HashMap<>();
        employeesMap.put(1001, new Employee(1001, "Ramesh", "Bengaluru"));
        employeesMap.put(1002, new Employee(1002, "John", "New York"));
        employeesMap.put(1003, new Employee(1003, "Jack", "Paris"));
        employeesMap.put(1004, new Employee(1004, "Jill", "Bengaluru"));
        employeesMap.put(1005, new Employee(1005, "Janae", "New York"));
        employeesMap.put(1006, new Employee(1006, "Aara", "Paris"));
        employeesMap.put(1007, new Employee(1007, "Deepi", "Bengaluru"));
        employeesMap.put(1008, new Employee(1008, "Saha", "New York"));
        employeesMap.put(1009, new Employee(1009, "shrithik", "Paris"));
        employeesMap.put(1010, new Employee(1010, "San", "Paris"));

        System.out.println(employeesMap);
    }
}