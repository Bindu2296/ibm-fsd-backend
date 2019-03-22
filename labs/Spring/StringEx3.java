package labs.Spring;

	import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

	public class StringEx3 {

		//using bean factory
		public static void main(String[] args) {

			// Creating IoC container supplying configuration file from file system
			AbstractApplicationContext context = new FileSystemXmlApplicationContext("src/beans-config.xml");
			BeanFactory c= new XmlBeanFactory(new FileSystemResource("src/bean-config.xml"));
			// Retrieving the bean from container
		//	Greetings greet = (Greetings) context.getBean("greetings1");
				Greetings greet = (Greetings) c.getBean("greetings1");
				System.out.println(greet.getMsg());

			greet.setMsg("Instantiated ApplicationContext based IoC container supplying configuration from file system.");

			// Display message
			System.out.println(greet.getMsg());

			context.close();

			// Graceful shutdown of container
			context.registerShutdownHook();

		}

	}

	

