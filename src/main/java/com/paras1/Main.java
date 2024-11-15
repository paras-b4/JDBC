package com.paras1;

//import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.*;

public class Main  {
	public static void main(String [] args)
	{
		Student s= new Student();
		s.createDatabase();
		s.createTable();
		// CRUD 
		s.createData(); // PreparedStatement 
		s.ReadData(); // Result set
		s.UpdateData();
		s.DeleteData(); // PreparedStatement 
		
		
	}

}
