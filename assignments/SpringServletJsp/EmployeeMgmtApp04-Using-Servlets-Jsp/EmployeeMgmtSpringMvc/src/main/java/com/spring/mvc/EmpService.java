package com.spring.mvc;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpService {
E dao =new E() ;
	

	public  void addEmployee(Employees emp ) throws SQLException {
		// TODO Auto-generated method stub
		 dao.addEmployee(emp);
	}

	public  void updateEmployee(Employees emp) throws SQLException {
		// TODO Auto-generated method stub
		 dao.updateEmployee(emp);
	}

	@SuppressWarnings("unchecked")

	public List<Employees> viewEmployees() throws SQLException {
		// TODO Auto-generated method stub
		List<Employees> empList=new ArrayList();
		empList=dao.viewEmployees();
		return empList;
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

