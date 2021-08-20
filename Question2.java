package com.ntt.test;

import java.sql.*;
public class Question2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "SYSTEM";
		String password = "oracle";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		String createQuery = "CREATE TABLE EMPLOYEES(ID NUMBER(2), NAME VARCHAR(20))"; 
		stmt.executeUpdate(createQuery);	
		
		String insertRecord1 = "INSERT INTO EMPLOYEES(ID,NAME) VALUES(1,'BRINDA')";
		stmt.executeUpdate(insertRecord1);
		String insertRecord2 = "INSERT INTO EMPLOYEES(ID,NAME) VALUES(2,'SOURABH')";
		stmt.executeUpdate(insertRecord2);
		String insertRecord3 = "INSERT INTO EMPLOYEES(ID,NAME) VALUES(3,'VIBHA')";
		stmt.executeUpdate(insertRecord3);
		
		
		String updateQuery = "UPDATE EMPLOYEES SET NAME='VANDANA' WHERE ID = 3";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs = stmt.executeQuery("Select * from employees");
		System.out.println("TABLE CREATION AND UPDATION");
		while(rs.next()) {
			System.out.println(rs.getString("id") + " : " +  rs.getString("name"));
		}
		con.close();
	}

}
