package Comparable;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class TestEmployeeSort {

	public static void main(String[] args) {     
		Set coll = Util.getEmployees();
	
		//System.out.println(coll);
		
		printList(coll); 
		}

		private static void printList(Set<Employee> list) {
		System.out.println("EmpId\tName\tAge");
		for (Employee e: list) {
		System.out.println(e.getEmpId() + "\t" + e.getName() + "\t" + e.getAge());
		}
		}
		}
