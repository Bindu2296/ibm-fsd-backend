package labs.Jdbc;


//package com.examples.core.java;

//JDBC example
//STEP 1. Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC1 {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jdbctraining";

	// Database credentials
	static final String USER = "root";
	static final String PASS = "pass@word1";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		try {
			// STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();

			
			String query1="insert into employee values(?,?,?,?,?,?)";
			// stmt.executeUpdate(query1);
			PreparedStatement pstmt1 = conn.prepareStatement(query1);
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter Id");
			pstmt1.setInt(1, sc1.nextInt());
			System.out.println("Enter Age");
			pstmt1.setInt(3, sc1.nextInt());
			System.out.println("Enter Name");
			pstmt1.setString(2, sc1.next());
			System.out.println("Enter Designation");
			pstmt1.setString(4, sc1.next());
			System.out.println("Enter Dept");
			pstmt1.setString(5, sc1.next());
			System.out.println("Enter Country");
			pstmt1.setString(6, sc1.next());
			
			
			pstmt1.execute();
			
			
			String sql1, sql2;
			sql1 = "SELECT id, name, age, designation FROM employee";
//			 sql1 = "SELECT id, name, age FROM employee WHERE age >= 35 AND department='Admin' ORDER BY name";
			sql2 = "UPDATE employee SET designation=? WHERE id=?";
			String sql3 = "DELETE from employee WHERE id=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql2);
			PreparedStatement pstmt2 = conn.prepareStatement(sql3);

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter designation and id to update");
			pstmt.setString(1, sc.next());

			pstmt.setInt(2, sc.nextInt());

//			boolean status = stmt.execute(sql2);
			boolean status = pstmt.execute();
			System.out.println("Update status: " + status);
			ResultSet rs1 = stmt.executeQuery(sql1);
			
			System.out.println("Enter id to delete");

			pstmt2.setInt(1, sc.nextInt());
			boolean status1 = pstmt2.execute();
			System.out.println("Delete status: " + status1);
			// STEP 5: Extract data from result set
			while (rs1.next()) {
				// Retrieve by column name
				int id = rs1.getInt("id");
				int age = rs1.getInt("age");
				String name = rs1.getString("name");
				String designation = rs1.getString("designation");

				// Display values
				System.out.print("ID: " + id);
				System.out.print(", Age: " + age);
				System.out.print(", Name: " + name);
				System.out.print(", Designation: " + designation);

				System.out.println();
			}
			// STEP 6: Clean-up environment
			rs1.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} finally {
			// finally block used to close resources
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // nothing we can do
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample


