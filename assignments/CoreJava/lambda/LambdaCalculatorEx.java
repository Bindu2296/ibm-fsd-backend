package assignments.CoreJava.lambda;

import java.util.function.BiFunction; 

import java.util.function.Consumer;

public class LambdaCalculatorEx {

	   public static void main(String args[]) {
		   LambdaCalculatorEx lamExp = new LambdaCalculatorEx();
			
	      //with type declaration
	        BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b; 
			
	      //with out type declaration
	        BiFunction<Integer, Integer, Integer>  subtraction = (a, b) -> a - b;
			
	      //with return statement along with curly braces
	        BiFunction<Integer, Integer, Integer> multiplication = ( a,  b) -> { return a * b; };
			
	      //without return statement and without curly braces
	        BiFunction<Integer, Integer, Integer>  division = ( a,  b) -> a / b;
			
	      System.out.println("10 + 5 = " + addition.apply(10,5));
	      System.out.println("10 - 5 = " + subtraction.apply(10, 5));
	      System.out.println("10 x 5 = " + multiplication.apply(10, 5));
	      System.out.println("10 / 5 = " + division.apply(10, 5));
	      
	  
	      //without parenthesis and using Consumer functional interface
	      Consumer<String> greetService1 = message ->
	      System.out.println("Hello " + message);
			
	      //with parenthesis and using custom functional interface
	     
			
	      greetService1.accept("Mahesh");
	      greetService1.accept("Suresh");      
	      
	   }
		
	  /* interface MathOperation {
	      int operation(int a, int b);
	   }
		
	   
	   interface GreetingService {
	      void sayMessage(String message);
	   }
		
	   
	   private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
*/
	}