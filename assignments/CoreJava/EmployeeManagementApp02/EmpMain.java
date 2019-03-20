package assignments.CoreJava.EmployeeManagementApp02;



import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class EmpMain {

	static Scanner sc=new Scanner(System.in);	
	static int op;
	static char choice;
	static boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E es=new E(op, null, null, null, op, op);
			do {
				System.out.println("Choose an action: ");
				System.out.println("1. Add Employee");
				System.out.println("2. Update Employee");
				System.out.println("3. View Employee by id");
				System.out.println("4. View All Employees");
				System.out.println("5. Delete Employee");
				System.out.println("6. Statistics");
				System.out.println("7. Import");
				System.out.println("8. Export");

				
					switch(sc.nextInt())
					{
					case 1: es.addEmployee();
							break;
					case 2: System.out.println("Enter employee id:");
							es.updateEmployee();
							break;
					case 3: System.out.println("Enter employee id:");
							es.viewEmployeeById(sc.nextInt());
							break;
					case 4:	es.viewEmployees();
							break;
					case 5: System.out.println("Enter employee id:");
							es.deleteEmployee(sc.nextInt());
							break;
					case 6:es.statistics();
							break;
					case 7:try {
							es.Import();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					break;
					case 8:try {
						es.Export();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				break;
					default:System.out.println("choose valid action");
					}
					System.out.println("Do you want to continue Y/N :");
					choice=sc.next().charAt(0);
				
				
			
			}
	
			while(choice=='Y'||choice=='y');
	
	}

			
		
		
	}


