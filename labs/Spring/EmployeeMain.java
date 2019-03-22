package labs.Spring;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

		// Retrieving the bean from container
		//EmployeeSpring obj = (EmployeeSpring) context.getBean("e");

		// Display message
		//System.out.println(obj.getMessage());
		
		EmployeeSpring obj = (EmployeeSpring) context.getBean("e");
		System.out.println(obj.toString());

		
	

		
		
		
		
	}

}
