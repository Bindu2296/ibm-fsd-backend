package assignments.CoreJava.oops;

public class Employee extends Person implements Appraisble {

	static int id;
	String dept;
int salary;

public Employee(int age,String dept,int salary,String name){
	//System.out.println(id);
	super(name,age);
this.dept=dept;
this.salary=salary;
id++;
		
	}
	
	



	public void printDetails() {
	System.out.println("Employee details name:"+getName()+" employee id:"+id+" age:"+getAge()+" dept:"+dept+" salary:" +salary);	
	}


	@Override
	public void appraise() {
		// TODO Auto-generated method stub
		System.out.println("overloading appraise method");
	}
	
	
}

