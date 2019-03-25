package assignments.CoreJava.EmployeeManagementApp02;



import java.io.IOException;
import java.sql.SQLException;
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
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmpConfigure.class);
		   EmpService e = (EmpService) context.getBean("employee");			do {
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
					case 1: try {
							e.addEmployee();
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
							break;
					case 2: System.out.println("Enter employee id:");
						try {
							e.updateEmployee();
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
							break;
					case 3: System.out.println("Enter employee id:");
						try {
							e.viewEmployeeById(sc.nextInt());
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
							break;
					case 4:	try {
							e.viewEmployees();
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
							break;
					case 5: System.out.println("Enter employee id:");
						try {
							e.deleteEmployee(sc.nextInt());
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
							break;
					case 6:try {
							e.statistics();
						} catch (SQLException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
							break;
					case 7:try {
							try {
								e.Import();
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					break;
					case 8:try {
						try {
							e.Export();
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
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


