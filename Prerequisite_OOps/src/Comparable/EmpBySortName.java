package Comparable;

import java.util.Comparator;

public class EmpBySortName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		String s1 = o1.toString();
		String s2 = o2.toString();
		return -s1.compareTo(s2);
	
	}

}
