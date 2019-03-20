package assignments.CoreJava.EmployeeManagementApp01;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmployeeMain extends Empservice {
	public EmployeeMain(int id, String name, int age, String dept, Object salary) {
		// TODO Auto-generated constructor stub
	}
	public EmployeeMain() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empservice e=new Empservice();
		TreeMap emplist = new TreeMap(); ;
		char ans;
		do {
System.out.println("---Welcome---");
System.out.println("1.Add Employees");
System.out.println("2.View Employees");
System.out.println("3.Delete Employees");
System.out.println("4.Update Employees");
 
System.out.println("5.View All Employees");
System.out.println("6.Exit");
System.out.println("7.Statistics");
System.out.println("8.Write to file-serialize");
System.out.println("9.Import");
System.out.println("10.Export");

System.out.println("11.Write to file(object)");




System.out.println("Enter Your choice");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
switch(a) {
case 1:e.addEmp1();
//e.printDetails();
break;
case 2:e.printDetails();
break;
case 3:e.deleteEmp();
break;
case 4:e.updateEmp();
break;
case 5:e.printAll();
break;
case 6:System.exit(0);
break;
case 7:e.statistics();
break;

case 8:e.write();
break;
case 9:Callable<Boolean> i=new Callable<Boolean>() {
	public Boolean call() throws Exception{
		System.out.println(Thread.currentThread()+"waiting 5s");
		Thread.sleep(5000);
		e.writeTofile();
		return null;
	}
};
ExecutorService e1=Executors.newFixedThreadPool(3);
Future<Boolean> ifutures=e1.submit(i);
System.out.println(Thread.currentThread().getName()+"Export triggered");

break;

case 10:Callable<Boolean> im=new Callable<Boolean>() {
	public Boolean call() throws Exception{
		System.out.println(Thread.currentThread()+"waiting 5s");
		Thread.sleep(5000);
		e.readFile();
		return true;
	}
};
ExecutorService e11=Executors.newFixedThreadPool(3);
Future<Boolean> ifutures1=e11.submit(im);
System.out.println(Thread.currentThread().getName()+"Import triggered");

case 11:try {
		e.cFile();
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
break;
 default :System.out.println("Choose valid choice");
}
System.out.println("would u like to continue(y/n)");
Scanner n=new Scanner(System.in);
 ans=n.next().charAt(0);
}
		while(ans=='Y'||ans=='y');


	
	
	
	}}