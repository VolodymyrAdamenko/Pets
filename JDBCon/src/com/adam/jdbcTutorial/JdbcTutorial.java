package com.adam.jdbcTutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTutorial {

	public static void main(String[] args) {
		try {
			//register Driver
	 Class.forName("org.postgresql.Driver");
	 }
		catch(ClassNotFoundException e) {
			System.out.println("Driver not found");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver registered successfully");
		Connection conn = null;
		try {
			//create Connection to dataBase
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pets_owner","postgres","11111111");
		}
		catch(SQLException e) {
			System.out.println("Unable to create the connection");
			e.printStackTrace();
			return;
		}
		if(conn!=null) {
			ResultSet result = null;
			try {
			//result = conn.createStatement().executeQuery("select * from owners");
			//conn.createStatement().executeUpdate("INSERT INTO owners(firstname, lastname, city, state)\n" + 
					//"		VALUES ('Volodymyr','Adamenko','Odesa','BH')");
				//conn.createStatement().executeUpdate("update owners set city = 'Kyiv' where city='Odesa'");
				//conn.createStatement().executeUpdate("delete from pets where species = 'Kangooro'");
				result = conn.createStatement().executeQuery("select*from pets");
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
//			try {
//				while (result.next()) {
//					System.out.println("------------------------------");
//					System.out.println("id: "+result.getString(1));
//					System.out.println("Name: "+result.getString(2));
//					System.out.println("Surname: "+result.getString(3));
//					System.out.println("City: "+result.getString(4));
//					System.out.println("State: "+result.getString(5));
//					System.out.println("------------------------------");
//				}
//			}
//			catch(SQLException e) {
//				e.printStackTrace();
//			}
			try {
				while (result.next()) {
					System.out.println("------------------------------");
					System.out.println("Id: "+result.getString(1));
					System.out.println("Species: "+result.getString(2));
					System.out.println("Alias: "+result.getString(3));
					String s = "Age: "+result.getString(4);
					System.out.println(s);
					System.out.println("Owner_Id: "+result.getString(5));
					System.out.println("------------------------------");
				}
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Unable to connect to dataBase");
		}
		
	}

}
