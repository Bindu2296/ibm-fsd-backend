package assignments.CoreJava.lambda;

import java.util.Scanner;

public class ValidateMain extends Validate {

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
		boolean valstatus=validate(new ValidateEmployee() {public boolean check(int age) {return age>0;}

		@Override
		public String check(EmpValidate emp) {
			// TODO Auto-generated method stub
			return null;
		}},age);
		System.out.println(valstatus);
        if(!valstatus) {
        	System.out.println("Invalid");
        }
		
		System.out.println("Enter Employee Salary"); 
		int salary=sc.nextInt();
		System.out.println(" Employee details saved"); 
		
	}

	private static boolean validate(ValidateEmployee validateEmployee, int age) {
		// TODO Auto-generated method stub
		return false;
	}

}
