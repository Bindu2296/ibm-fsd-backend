package assignments.CoreJava.lambda;

import java.util.Scanner;
import java.util.function.Predicate;

//import com.examples.core.java.Validate.ValidateEmployee;

public class EmpValidate {
	
	public EmpValidate(int id, String name, int age, int salary) {
		// TODO Auto-generated constructor stub
	}

	public static boolean validate(EmpValidate emp, String err,Predicate<EmpValidate> validator)
	{
		if(validator.test(emp)) {
			System.out.println(err);
			return false;
		}
		//return validator.test(emp); // executes lambda expression body
		return true;
	}
	
	
	/*public String toString() {
		return "EmpValidate[Name="+name+",  id="+id+", age="+age+", salary:"+salary+"]";
		
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Employee Details");
		System.out.println("Enter Employee ID");
		 int id=sc.nextInt();

		System.out.println("Enter Employee Name");
		String name=sc.next();
		
		System.out.println("Enter Employee Age");
		int age=sc.nextInt();
		//boolean valstatus=validate(new ValidateEmployee() {public boolean check(int age) {return age>0;}},age);
        
		System.out.println("Enter Employee Salary"); 
		int salary=sc.nextInt();
		
		EmpValidate emp=new EmpValidate(id,name,age,salary);
		
	boolean valStatus = validate(emp,"Invalid age or salary or name", (EmpValidate e) -> {return id > 0 && salary > 0 && (name.equals("dan") || name.equals("sam"));});
		//boolean valStatus = validate(() -> {return id > 0 && salary > 0 && (name.equals("dan") || name.equals("sam"));});

	//String vals=validate(emp, (EmpValidate e) ->{String err;if (id > 0 && salary > 0 && (name.equals("dan") || name.equals("sam"))) {System.out.println("Saved !!");;} else{err="Invalid!!";}return err ;})
		
		/*while(!valStatus)
		{
			// Logic to save employee details
			System.out.println("Invalid Employee details - ");
		}
	
			System.out.println( "Employees saved");
	
		
		//System.out.println(" Employee details saved"); */
	}}

	/*private static boolean validate(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	
//System.out.println(vals);
}
	/*public interface ValidateEmployee{
		//public boolean check(int age);

		public String check(EmpValidate emp);
	}
	
	//static boolean validate(ValidateEmployee validator,int age) {
	//	return validator.check(age);
		
	private static String validate(EmpValidate emp, ValidateEmployee validator) {
		// TODO Auto-generated method stub
		return ( validator).check(emp);
	}
*/
	

