package com.spring.mvc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class EmpService {
E dao =new E(0, null, null, null, 0, 0) ;
	

	public  void addEmployee(Employees emp ) throws SQLException {
		// TODO Auto-generated method stub
		 dao.addEmployee(emp);
	}

	public  void updateEmployee() throws SQLException {
		// TODO Auto-generated method stub
		// dao.updateEmployee();
	}

	@SuppressWarnings("unchecked")

	public List<Employees> viewEmployees() throws SQLException {
		// TODO Auto-generated method stub
		return dao.viewEmployees();
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

