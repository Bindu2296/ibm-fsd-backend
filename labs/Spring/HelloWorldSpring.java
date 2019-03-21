package labs.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldSpring {
public static void main(String args[]) {
	//Greetings greetings = new Greetings();
    //greetings.getMsg();


ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

Greetings greetings=(Greetings)context.getBean("greetings");
System.out.println(greetings.getMsg());

}

}
