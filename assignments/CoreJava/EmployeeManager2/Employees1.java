package assignments.CoreJava.EmployeeManager2;

public class Employees1<T> {
	private  int id;
	private String dept;
private T salary;
private String name;
private int age;
public String address;
public int SSN;

public Employees1(int id,String name,int age,String dept,T salary) {
	this.name=name;
	this.age=age;
	this.dept=dept;
	this.salary=salary;
	this.id=id;
}

public Employees1() {
	// TODO Auto-generated constructor stub
}


public  int getId() {
	return id;
}

public  void setId(int id) {
	this.id = id;
}

public String getDept() {
	return dept;
}

public void setDept(String dept) {
	this.dept = dept;
}

public T getSalary() {
	return salary;
}

public void setSalary(T salary) {
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

public String toString() {
	return "Employees1[Name="+name+", dept="+dept+", id="+id+", age="+age+", salary:"+salary+"]";
	
}

public void printDetails() {
	System.out.println("Employee details name:"+getName()+" employee id:"+getId()+" age:"+getAge()+" dept:"+getDept()+" salary:" +getSalary());	
	}




}
