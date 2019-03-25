package assignments.CoreJava.EmployeeManagementApp02;

import java.io.IOException;
import java.sql.SQLException;

public class EmpService {
E dao=new E();
	

	public  void addEmployee( ) throws SQLException {
		// TODO Auto-generated method stub
		 dao.addEmployee();
	}

	public  void updateEmployee() throws SQLException {
		// TODO Auto-generated method stub
		 dao.updateEmployee();
	}

	@SuppressWarnings("unchecked")

	public void viewEmployees() throws SQLException {
		// TODO Auto-generated method stub
		 dao.viewEmployees();
	}


	

	public void deleteEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		 dao.deleteEmployee(id);
	}
	
	public void viewEmployeeById(int id) throws SQLException {
		// TODO Auto-generated method stub
		 dao.viewEmployeeById(id);
	}

	public  void statistics() throws SQLException {
		// TODO Auto-generated method stub
		 dao.statistics();
	}

	public void Import() throws SQLException, IOException {
		// TODO Auto-generated method stub
		 dao.Import();
	}
	
	public void Export() throws SQLException, IOException {
		// TODO Auto-generated method stub
		 dao.Export();
	}



}

