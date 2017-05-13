package Comparable;

public class Employee implements Comparable<Employee> {
private int empId;
private StringBuffer name;
private int age;


public Employee(int empId, StringBuffer name, int age) {
	super();
	this.empId = empId;
	this.name = name;
	this.age = age;
}

// getters & setters

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public StringBuffer getName() {
	return name;
}

public void setName(StringBuffer name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}
public String toString()
{
	return name+"\t "+ empId+" \t"+age;
}

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return this.empId-o.empId ;
}
}