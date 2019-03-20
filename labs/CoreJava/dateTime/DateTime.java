package labs.CoreJava.dateTime;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// To take the input
		
	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Date ");
DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = scanner.next();
		LocalDate date2=null;

		try {
		    //Parsing the String
		    date2 = (LocalDate) format.parse(date);

		} catch (Exception e) {
		    // TODO Auto-generated catch block
			System.out.println("provide proper format");
		    e.printStackTrace();
		    
		}
		System.out.println(date2);
		
	
	
	

		Instant d=Instant.now();System.out.println("instant:"+d);
		
		LocalDate date1 = LocalDate.now();
		System.out.println("Localdate:"+date1);
		
		LocalDate date21 =LocalDate.of(1996, Month.SEPTEMBER, 27);
		System.out.println("Your DOB:"+date21);
		
		Period period = Period.between(date21, date1);
		System.out.println("Your age: " + period.getYears());
		
		
		Period period1 = Period.between(date2, date1);
		System.out.println("Users age: " + period1.getYears());

		

	}
}
