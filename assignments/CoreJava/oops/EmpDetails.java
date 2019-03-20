package assignments.CoreJava.oops;

public class EmpDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee.id=23;

Person emp=new Employee(25,"CSE",25000,"Sia");
emp.printDetails();
//emp.appraise(); //Error: The method appraise() is undefined for the type Person

Employee emp1=new Employee(25,"FSD",25000,"Ria");
emp1.printDetails();
emp1.appraise();

Employee emp2=new Employee(25,"Clouds",25000,"Dan");

emp2.printDetails();

Contractr c= new Contractr(21,"Contacter",8,"Dean");
c.printDetails();

Contractr c1= new Contractr(21,"Contacter",9,"Lila");
c1.printDetails();

Appraisble a=new Employee(5,"App",89000,"Zendaya");
a.appraise();
//a.printDetails(); //The method printDetails() is undefined for the type Appraisble

	}

}
