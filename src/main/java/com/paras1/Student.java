package com.paras1;


import java.sql.*;


public class Student {
	
	public void createDatabase()
	{
		try {
			String url="jdbc:mysql://localhost:3306/";
			String username="root";
			String pass= "paras@yadav";
			String sql= "create database disha ";
			Connection con = DriverManager.getConnection(url,username,pass);
			Statement s=con.createStatement();
			s.execute(sql);
			
			
			System.out.println("Database Created succesfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void createTable() {
		
		try {
			String url="jdbc:mysql://localhost:3306/disha";
			String username="root";
			String pass= "paras@yadav";
			String sql= "create table employees(Eid int(20),Ename varchar(60),Edpt varchar(60),Marks int(20))";
			Connection con = DriverManager.getConnection(url,username,pass);
			Statement s=con.createStatement();
			s.execute(sql);
			
			
			System.out.println("Table Created succesfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void createData() {
		try {
			String url="jdbc:mysql://localhost:3306/disha";
			String username="root";
			String pass= "paras@yadav";
			String sql= "insert into employees (Eid , Ename , Edpt, Marks) values (?,?,?,?)";
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement s=con.prepareStatement(sql);
			 s.setInt(1, 18);
			 s.setString(2, "Paras");
			 s.setString(3,"CSE(AI)");
			 s.setInt(4, 95);
			
			s.executeUpdate();
			
			
			System.out.println("Data Inserted succesfully");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void ReadData() {
		
		try {
			String url="jdbc:mysql://localhost:3306/disha";
			String username="root";
			String pass= "paras@yadav";
			String sql= "select * from employees ";
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement s=con.prepareStatement(sql);
			ResultSet rs = s.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				System.out.println();
				
			}
			
			System.out.println(" Read succesfully ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void UpdateData() {
		try {
			String url="jdbc:mysql://localhost:3306/disha";
			String username="root";
			String pass= "paras@yadav";
			String sql= "update employees set Edpt=? where Edpt= 'CSE(AI' ";
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement s=con.prepareStatement(sql);
			s.setString(1, "CSE(AI)");
			s.execute();
			
			
			System.out.println(" Update succesfully ");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void DeleteData() {
		try {
			String url="jdbc:mysql://localhost:3306/disha";
			String username="root";
			String pass= "paras@yadav";
			String sql= "Delete from employees where eid = 18  ";
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement s=con.prepareStatement(sql);
			
			
			s.execute();
			
			
			System.out.println(" deleted  succesfully");
			
		}catch(Exception e) {
			e.printStackTrace();
			}
		}
	
	}

