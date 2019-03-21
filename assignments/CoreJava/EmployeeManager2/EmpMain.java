package labs.CoreJava.generics;

import java.util.Arrays;
import java.util.*;
import java.lang.*;



public class EmpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employees1<Integer>e=new Employees1(1,"sia", 12, "CSE", 120000);
Employees1 e1=new Employees1(2,"Moia", 25, "Clouds", "25k");
Employees1<Double>e2=new Employees1(3,"Rita", 23, "CSE", 5678.90);

Employees1 <Integer>e3=new Employees1(4,"Anna", 36, "CSE", 56000);
Employees1[] emp=new Employees1[] {e,e1,e2,e3

	};

System.out.println("---Employeees dtails---");
for(int i=0;i<emp.length;i++) {
	System.out.println("---Employees"+i+"--details--");
	emp[i].printDetails();
	System.out.println();
}
System.out.println("---Update dtails---");
e.setName("Bindu");
e1.setName("Divya");
e2.setName("Veda");

System.out.println("---Updated Employeees dtails---");
for(int i=0;i<emp.length;i++) {
	System.out.println("---Employees"+i+"--details--");
	emp[i].printDetails();
	System.out.println();
}



 
//Remove the element 
//emp = sortEmp(emp); 
System.out.println("---Sorted Employeees dtails---");

//Print the resultant array 
System.out.println( Arrays.toString(emp)); 


	System.out.println("---Delete dtails---");
	
	
	

	
	 System.out.println("Id of employee to be removed: "
             + 3); 

// Remove the element 
emp = removeTheElement(emp, 2); 
System.out.println("---deleted Employeees dtails---");

// Print the resultant array 
System.out.println( Arrays.toString(emp)); 


System.out.println("Enter the employee Name");
Scanner in=new Scanner(System.in);



	
	
}
	 public static Employees1[] removeTheElement(Employees1[] emp, 
             int index) 
{ 

// If the array is empty 
// or the index is not in array range 
// return the original array 
if (emp == null
|| index < 0
|| index >= emp.length) { 

return emp; 
} 

// Create another array of size one less 
Employees1[] anotherArray = new Employees1[emp.length - 1]; 

// Copy the elements except the index 
// from original array to the other array 
for (int i = 0, k = 0; i < emp.length; i++) { 

// if the index is 
// the removal element index 
if (i == index) { 
continue; 
} 

// if the index is not 
// the removal element index 
anotherArray[k++] = emp[i]; 
} 

// return the resultant array 
return anotherArray; 
} 
	 
	 
	public static Employees1[] sortEmp(Employees1[] emp
             ) 
{ 
		 Employees1 z;
// If the array is empty 
// or the index is not in array range 
// return the original array 

// Create another array of size one less 
// Copy the elements except the index 
// from original array to the other array 
for ( int i = 0; i < emp.length; i++) { 
for (int index1=i+1;index1<emp.length;index1++) {
	if((int)emp[i].getSalary() > (int)emp[index1].getSalary()) {
		z=emp[i];
		emp[i]=emp[index1];
		
		emp[index1]=z;
		}



// return the resultant array 

}
	
	 
}
return emp;

}
}