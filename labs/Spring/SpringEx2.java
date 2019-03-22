package labs.Spring;



	import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
	public class SpringEx2 {


	public static void main(String args[]) {
		//Greetings greetings = new Greetings();
	    //greetings.getMsg();

	//step1: creates ioc container
	//ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

		//AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");
		BeanFactory c= new XmlBeanFactory(new ClassPathResource("bean-config.xml"));

	//access Greetings bean
	//Greetings greetings=(Greetings)context.getBean("greetings1");

	//	Greetings greetings = (Greetings) context.getBean("greetings1");

			Greetings greetings = (Greetings) c.getBean("greetings1");

	//prints the message
	//System.out.println(greetings.getMsg());
			System.out.println(greetings.getMsg());

	greetings.setMsg("Instantiated ApplicationContext container supplying configuration from classpath.");

	// Display message
	System.out.println(greetings.getMsg());

	// Graceful shutdown of container
	//context.registerShutdownHook();

	}

	}

	

