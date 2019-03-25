package labs.Spring.AnnotationConfigure;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class Address1 {

	@Value(value="Blore")
	private String city;
	
	@Value(value="India")
	private String country;
	
	@Value(value="560096")
	private int pin;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pin=" + pin + "]";
	}
	}


