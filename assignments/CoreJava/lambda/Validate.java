package assignments.CoreJava.lambda;

import java.util.function.Predicate;

public class Validate {

	public interface ValidateEmployee{
		//public boolean check(int age);

		public String check(EmpValidate emp);
	}
	
	//static boolean validate(ValidateEmployee validator,int age) {
	//	return validator.check(age);
		
	private static String validate(EmpValidate emp, ValidateEmployee validator) {
		// TODO Auto-generated method stub
		return ( validator).check(emp);
	}
	}
	
	

