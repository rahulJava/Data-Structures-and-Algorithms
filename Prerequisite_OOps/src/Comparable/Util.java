package Comparable;

import java.util.*;

public class Util {

public static Set<Employee> getEmployees() {	

Set<Employee> col = new TreeSet<Employee>(new EmpBySortName());
Set col1 = Collections.synchronizedSet(col);
Map <String, Integer> map = new HashMap<String,Integer>();
Map m2 = Collections.synchronizedMap(map);

col.add(new Employee(5, new StringBuffer("Frank"), 28));
col.add(new Employee(1, new StringBuffer("Jorge"), 19));
col.add(new Employee(6, new StringBuffer("Bill"), 34));
col.add(new Employee(3, new StringBuffer("Michel"), 10));
col.add(new Employee(7, new StringBuffer("Simpson"), 8));
col.add(new Employee(4, new StringBuffer("Clerk"),16 ));
col.add(new Employee(8, new StringBuffer("Lee"), 40));
col.add(new Employee(2, new StringBuffer("Mark"), 30));



return col;
}
}