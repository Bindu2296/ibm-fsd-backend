package assignments.Springs.AnnotationsXml;




	import java.time.LocalDate;
	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

	@Component
	public class Employee {
@Value(value="10")
		int id;

@Value(value="Siya")	
String name;
	private int age;
	
	@Value(value="25000")	
	private double salary;
	List<String> skills;
	
	@Autowired
	Address1 address;
	boolean fulltime;
	LocalDate date;
	/*AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans-config.xml");

	EmployeeSpring obj = (EmployeeSpring) context.getBean("e");
	EmployeeSpring obj1 = (EmployeeSpring) context.getBean("e1");
	EmployeeSpring obj2 = (EmployeeSpring) context.getBean("e2");

	Address ad=(Address) context.getBean("emp");*/

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	Employee(){
		
	}
	Employee(int id,String name,boolean fulltime){
		
		this.id=id;
		this.name=name;
		this.fulltime=fulltime;
	}

	Employee(Address1 address){
		this.address=address;
	}

	/*public void printDetails() {
		System.out.println(obj.id + obj.name+obj.fulltime);
		System.out.println(obj1.age + obj1.salary);
		System.out.println(obj2.getSkills());
		System.out.println(ad.getCity() + ad.getCountry() +ad.getPin());
		System.out.println();
		
	}*/




	public int getAge() {
		return age;
	}


	@Override
	public String toString() {
		return "EmployeeSpring [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", skills=" + skills
				+ ", address=" + address + ", fulltime=" + fulltime + ", date=" + date + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSkills(List skills) {
		this.skills = skills;
	}

	// prints and returns all the elements of the list.
	public List getSkills() {
		System.out.println("Skills are :" + skills);
		return skills;
	}

		
	}

	

