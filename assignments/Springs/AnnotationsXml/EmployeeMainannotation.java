package labs.Spring.AnnotationsXml;

	import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class EmployeeMainannotation {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			//Annotation using xml file
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

			//annotation without using xml- passsing the class
			//AbstractApplicationContext context = new AnnotationConfigApplicationContext(Configure.class);

			
			
			// Retrieving the bean from container
			//EmployeeSpring obj = (EmployeeSpring) context.getBean("e");

			// Display message
			//System.out.println(obj.getMessage());
			
			Employee obj = (Employee) context.getBean("employee");
			System.out.println(obj.toString());

			
		

			
			
			
			
		}

	}


