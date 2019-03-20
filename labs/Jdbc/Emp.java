package labs.Jdbc;


import java.io.Serializable;
import java.util.Scanner;

public class Emp implements Serializable{
	   int id;
	private String dept;
private int salary;
private String name;
private int age;

public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(int age, String name, String dept, int id, int salary) {
		this.age=age;
		this.name=name;
this.id=id;		this.dept=dept;
		this.salary=salary;
		// TODO Auto-generated constructor stub
		
	}

@Override
public String toString() {
	return "[Employee Id : " + id + ", Department :" + dept + ", Salary:" + salary + ", Name:" + name + ", Age:" + age + "]";
}


	
}
