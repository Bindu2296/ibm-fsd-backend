package assignments.CoreJava.EmployeeManagementApp02;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmpConfigure {
	@Bean
	public E employeeDao() {
		return new E("com.mysql.jdbc.Driver", "jdbc:mysql://localhost/jdbctraining","root","pass@word1");
	}
	@Bean
	public EmpService employee() {
		return new EmpService(employeeDao());
		
	}

}

