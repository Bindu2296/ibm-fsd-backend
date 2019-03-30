

		// TODO Auto-generated method stub

		import org.springframework.context.ApplicationContext;
		import org.springframework.context.support.ClassPathXmlApplicationContext;

		public class SpringhelloWorldEx {

			public static void main(String[] args) {
			//Greetings greetings = new Greetings();
		    //greetings.getMsg();

		//step1: creates ioc container
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

		//access Greetings bean
		Greetings greetings=(Greetings)context.getBean("greetings1");

		//prints the message
		System.out.println(greetings.getMsg());

		}

		

	

}
