package labs.Spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan
@Configuration
public class Configure 
{
    @Bean
    public Employee employee() {
        return new Employee(address());
    }    
    
    @Bean
    public Address1 address() {
        return new Address1();

}
}
