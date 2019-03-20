package labs.Jdbc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Empservice extends Employees2 {
	TreeMap<Integer,Employees2> emplist=new TreeMap<Integer,Employees2>();
	Scanner sc=new Scanner(System.in);
	
	//Method to print selected employees' details
	public   void printDetails() {
		System.out.println("Enter Employee ID to be displayed");
		 int id1=sc.nextInt();
		 if(emplist.containsKey(id1)) {

		System.out.println(emplist.get(id1));
		 }else {
			 System.out.println("This ID not exists");
		 }
	}

	//Method to add  employees' details
	public  void addEmp1() {
		
		id++;
		System.out.println("----Enter Employee Details---");
		//System.out.println("Enter Employee ID");
		boolean flag=false;
		//boolean isNumber= false;
	/*	do{try {
		 String id=sc.next();
		 int x=(Integer.parseInt(id));
		 break;
		}
		catch(Exception e) {
			flag=false;
			System.out.println("Type number, not a string");
		}}while(flag==false);*/
		
		/*do {if(sc.hasNextInt()) {
			id=(sc.nextInt());
			isNumber=true;
		}
		else {
			System.out.println("Enter Number");
			sc.next();
			
		}}while(!(isNumber));*/
		System.out.println("Employee's id: "+id);

		System.out.println("Enter Employee Name");
		String name=sc.next();
		String nametype="[a-zA-z]+";
		while(!flag) {
			if(name.matches(nametype)) {
				flag=true;
			}
			else {
				System.out.println("Enter strings");
				name=sc.next();
			}
		}
		
		System.out.println("Enter Employee Age");
		/*do{
			try {
			 String age=sc.next();
		 int x=(Integer.parseInt(age));
             //System.out.println(x);
             break;
		}
		catch(Exception e) {
			flag=false;
			System.out.println("age shud be a number");
			
		}
			}while(flag==false);*/
		int age=0;boolean isAge=false;
		do {if(sc.hasNextInt()) {
			age=sc.nextInt();
			isAge=true;
		}
		else {
			System.out.println("Enter Number");
			sc.next();
			
		}}while(!(isAge));
		
		
		//int age=sc.nextInt();

		
		System.out.println("Enter Employee Salary");
		int salary=sc.nextInt();
		
		System.out.println("Enter Employee Department");
	    String dept=sc.next();
		
	    Employees2 emp1=new Employees2(age,name,dept,id,salary);
	    emplist.put(emp1.id, emp1);	

		System.out.println(" Employee Details added");


	}
	
	public  void addEmp() {
		
		

		System.out.println("----Enter Employee Details---");
		System.out.println("Enter Employee ID");
		int id=sc.nextInt();

		System.out.println("Enter Employee Name");
		String name=sc.next();
		
		System.out.println("Enter Employee Age");
		int age=sc.nextInt();
		//boolean valstatus=validate(new ValidateEmployee() {public boolean check(int age) {return age>0;}},-10);

		
		System.out.println("Enter Employee Salary");
		int salary=sc.nextInt();
		
		System.out.println("Enter Employee Department");
	    //String dept=sc.next();
		String dept=sc.next(); boolean isdept=false;
		String dtype="[a-zA-z]+";
		while(!isdept) {
			if(dept.matches(dtype)) {
				isdept=true;
			}
			else {
				System.out.println("Enter strings");
				dept=sc.next();
			}
		}
		
		
	     Employees2 emp1=new Employees2(age,name,dept,id,salary);
         emplist.put(emp1.id, emp1);	

		 System.out.println(" Employee Details added");

		 

	}

	//Method to delete selected employees' details
	public  void deleteEmp() {
		
		System.out.println("Enter Employee ID to be deleted");
		 int id=sc.nextInt();
		 if(emplist.containsKey(id)) {
		 emplist.remove(id);}
		 else {
			 System.out.println("This ID doesn't exist");
		 }
	
		
	}
	
	
	//Method to update selected employees' details
	public  void updateEmp() {
		
		System.out.println("Enter Employee ID to be Updated");
		 int id1=sc.nextInt();

		if(emplist.containsKey(id1)) {
		 emplist.get(id1);
		 System.out.println("The Employee whose details to be updated are"+emplist.get(id1));
		 System.out.println();
		 System.out.println("Enter Employee Details");
			//System.out.println("Enter Employee ID");
			 //int id=sc.nextInt();

			System.out.println("Enter Employee Name");
			String name=sc.next();
			
			System.out.println("Enter Employee Age");
			int age=sc.nextInt();
			
			System.out.println("Enter Employee Salary");
			int salary=sc.nextInt();
			
			System.out.println("Enter Employee Department");
		String dept=sc.next();
			
		Employees2 emp1=new Employees2(age,name,dept,id1,salary);
	//emplist.put(emp1.id, emp1);	
		 emplist.replace(id1, emp1);

			System.out.println(" Employee Details updated");
	}
		else{
			System.out.println("This ID is doesn't exist");}
		}
	
	//Method to print all employees' details
	public  void printAll() {
		System.out.println("----------All Employees Details----------------");
		System.out.println("Id\t Name\t Age\t Salary\t Dept");

		    for(Object o:emplist.keySet()) {
			//System.out.println(emplist.get(o));
			System.out.println(emplist.get(o).id+"\t"+emplist.get(o).getName()+"\t"+emplist.get(o).getAge()+"\t"+emplist.get(o).getSalary()+"\t"+emplist.get(o).getDept());
		

			}
		
			
		}
	//Method to print statistics employees' details
	public  void statistics() {
		

		System.out.println("---Statistics---");
		int x=0,y=0;
		for(Object o:emplist.keySet()) {	

		if(emplist.get(o).getSalary()> 50000)
		{
			y++;
			
		}
		}System.out.println("Number Of Employees with Salary > 50K are "+y);
	
		System.out.println("\n--Employees per Department--");
		Map<String,Integer> map=new HashMap<String,Integer>();
			for(Object o:emplist.keySet()) {		

				String dept1 =emplist.get(o).getDept();
				if(map.containsKey(dept1))
				{

					map.put(dept1, map.get(dept1)+1);
				}
				else {
					map.put(dept1, 1);

				}}
				System.out.println("Department\t No. Of Employees");
				for(Entry<String, Integer> entry:map.entrySet())
					System.out.format("%s \t \t %d \n",entry.getKey(),entry.getValue());
			
		//Sorting by name
			System.out.println("\n---Employees Details sorted by name---");	
			TreeSet tlist=new TreeSet(SortName);
				for(Object o:emplist.keySet()) {	
					tlist.add(emplist.get(o));
				}
				for(Object o:tlist) {
		
					System.out.println(o);
				}
	
	//highest and lowest salary
				System.out.println("\n---Employees Details sorted by Salary---");	
				TreeSet slist =new TreeSet(SortSal);
				for(Object o:emplist.keySet()) {	
					slist.add(emplist.get(o));
				}	for(Object o:slist) {
				
					System.out.println(o);
				}
				System.out.println("\n---------");	
				System.out.println("Employee details having Lowest Salary: "+slist.first());
				System.out.println("Employee details having Highest Salary: "+slist.last());

				System.out.println("\n---Employees with Age more than 20yrs---");	

				long c=	emplist.values().stream().filter(a -> a.getAge()>=20).count();
				System.out.println("No. of employees > 20yrs are: "+c);
		
				List<Integer> x1=	emplist.values().stream().filter(a -> a.getAge()>=20).map(a-> a.id).collect(Collectors.toList());

				System.out.println("List of employeees ID with age > 20yrs: "+x1);
		
				List<String> x2=	emplist.values().stream().filter(a -> a.getAge()>=20).map(a-> a.getName()).collect(Collectors.toList());

				System.out.println("Name of employees with age > 20yrs: ");
				for(String names:x2)
				{
					System.out.println(names);
				}
				System.out.println("\n---Employees Departments available---");	

				List<String> e=emplist.values().stream().map(a->a.getDept()).distinct().collect(Collectors.toList());
				System.out.println("Departments"+e);
		
		//Employees count per department
				System.out.println("\n---Employees count in each department---");	

				Map<Object, Long> e1=emplist.values().stream().collect(Collectors.groupingBy(Employees2::getDept,Collectors.counting()));
				System.out.println(e1);
				
				/*Map<Employees2> map1 =new TreeMap();
				map1=(emplist).stream().sorted(Comparator.comparing(Employees2::getDept)).collect(Collectors.groupingBy(Employees2::getDept,TreeMap::new,Collectors.counting()));
				System.out.println("\n---Employees count in each department sorted!!---");	
				System.out.println(map1);*/
				System.out.println("\n---Employees count in each department sorted!!---");	
				Map<Object, Long> m=emplist.values().stream().sorted(Comparator.comparing(Employees2::getDept)).collect(Collectors.groupingBy(Employees2::getDept,Collectors.counting()));
				System.out.println(m);
				
				System.out.println("\n---Employees average salary in each department---");	
				Map<String, Double> y2=emplist.values().stream().collect(Collectors.groupingBy(Employees2::getDept,Collectors.averagingDouble(Employees2::getSalary)));
				System.out.println(y2);	
		
				System.out.println("\n---Employees average Age in each department---");	
				Map<String, Double> y3=emplist.values().stream().collect(Collectors.groupingBy(Employees2::getDept,Collectors.averagingDouble(Employees2::getAge)));
				System.out.println(y3);	
		
		
				List<Object> y1=	e1.entrySet().stream().filter(w->w.getValue()>2).map(Map.Entry::getKey).collect(Collectors.toList());
				System.out.println("\nDept having emps > 2 : " +y1);
				
				System.out.println("\n---Employees list in each department---");	
				Map<Object, List<Employees2>> e2=emplist.values().stream().collect(Collectors.groupingBy(Employees2::getDept));
				System.out.println(e2);
	
				emplist.values().stream().collect(Collectors.groupingBy(Employees2::getDept,Collectors.counting()));
		
		
		//adding all salaries				
				System.out.println("\n---Total Salary of all employees---");	
				double sal=	emplist.values().stream().map(Employees2::getSalary).reduce(0,(a,b)->a.intValue() +b.intValue()).doubleValue();
				System.out.println(sal);
	
	//average salary=
				System.out.println("\n---Average Salary of all employees----");	
				double avgsal=emplist.values().stream()
						.collect(Collectors.averagingDouble(Employees2::getSalary)).doubleValue();// has 3 args--> supplier,accumulator,combiner
				System.out.println(avgsal);
	
				System.out.println("\n---Employees with names starting with S---");	

				List<String> n=emplist.values().stream().filter(a->a.getName().charAt(0)=='s').map(a->a.getName()).collect(Collectors.toList());
				System.out.println(n);
		
				
				System.out.println("\n---Count of employees for the dept you choose----");	
				System.out.println("Enter Department");
				String dept=sc.next();
				for(Object o:emplist.keySet()) {	

					if(emplist.get(o).getDept().equals( dept))
					{
						x++;
	
					}
				}System.out.println("Employees with dept "+dept+" are "+x);
				}


	Comparator SortName=new Comparator() {
	
	@Override
		public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof Employees2 && arg1 instanceof Employees2)
			return (((Employees2) arg0).getName().compareTo(((Employees2) arg1).getName()));
			
			
		return 0;
	}
	};

	Comparator SortSal=new Comparator() {
	
	@Override
		public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		if(arg0 instanceof Employees2 && arg1 instanceof Employees2) {
			
			return (((Employees2) arg0).getSalary()-(((Employees2) arg1).getSalary()));
		}
		return 0;
	}
	};
	
	public void writeTofile() {
		BufferedWriter bw = null;
	      try {
		 String mycontent = "This String would be written" +
		    " to the specified File";
	         //Specify the file name and path here
		 File file = new File("D:/Java/myfile.txt");

		 /* This logic will make sure that the file 
		  * gets created if it is not present at the
		  * specified location*/
		  if (!file.exists()) {
		     file.createNewFile();
		  }

		  FileWriter fw = new FileWriter(file);
		  bw = new BufferedWriter(fw);
		//  bw.write(emplist);
	          System.out.println("File written Successfully");

	      } catch (IOException ioe) {
		   ioe.printStackTrace();
		}
		finally
		{ 
		   try{
		      if(bw!=null)
			 bw.close();
		   }catch(Exception ex){
		       System.out.println("Error in closing the BufferedWriter"+ex);
		    }
		}
	}
	
	
	public void write() {
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\Java\\myfile1.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emplist);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D:\\Java\\myfile1.txt");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
	
	

	public void cFile() throws IOException {
		FileWriter fstream = null;
		try {
			fstream = new FileWriter("D:\\Java\\myfile2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedWriter out = new BufferedWriter(fstream);

		for (Entry<Integer, Employees2> entry : emplist.entrySet()) {
		     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); //this statement prints out my keys and values
		     out.write("\n"+entry.getKey() + "\t" + entry.getValue());
		     System.out.println("Done");
		     out.flush();   // Flush the buffer and write all changes to the disk
		 }

		out.close();
	}
	
	public void bulkExport() {
		int countr=0;
		try(Scanner out=new Scanner(new FileReader("D:\\Java\\EmployeeData.txt"));){
			emplist.values().stream().map(e->e.id+","+e.getName()+","+e.getAge()+","+e.getSalary()+","+e.getDept())
			.forEach(r->{
				try {
			//		out.read(r);
				}catch(Exception e) {
					
				}
			});
		
		}catch(Exception e) {
			
		}

				
	}
	
	public void bulkImport() {
		int countr=0;
		try(Scanner in=new Scanner(new FileReader("D:\\Java\\EmployeeData.txt"));){
		while(in.hasNextLine())
		{
			String emp=in.nextLine();
			Employees2 e2=new Employees2();
			StringTokenizer t=new StringTokenizer(emp, ",");
			//e2.id(Integer.parseInt(t.nextToken()));
			e2.setAge(Integer.parseInt(t.nextToken()));
			e2.setName((t.nextToken()));
			e2.setDept((t.nextToken()));
			e2.setSalary(Integer.parseInt(t.nextToken()));


			
		}
		}
		catch(Exception e) {
			
		}

				
	}
	
	}


