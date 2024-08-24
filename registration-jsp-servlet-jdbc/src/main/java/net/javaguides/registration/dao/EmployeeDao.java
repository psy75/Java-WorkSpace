package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.javaguides.registration.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee)throws ClassNotFoundException{
		String INSERT_USERS_SQL ="INSERT INTO employee"+
	    "(id,first_name,last_name,user_name,password,address,contact)"+
	    "VALUES"+"(?,?,?,?,?,?,?);";
		int result=0;
		Class.forName("com.mysql.cj.jdbc.Driver");
		try(Connection connection=DriverManager
			.getConnection("jdbc:mysql://localhost:3306/mvcProject","root","9346");
			PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setInt(1,1);
			preparedStatement.setString(2, employee.getFirstname());
			preparedStatement.setString(3, employee.getLastname());
			preparedStatement.setString(4, employee.getUsername());
			preparedStatement.setString(5, employee.getPassword());
			preparedStatement.setString(6, employee.getAddress());
			preparedStatement.setString(7, employee.getContact());
			
			System.out.println(preparedStatement);
			result =preparedStatement.executeUpdate();
			
		    }
		 catch(SQLException e) {
			  e.printStackTrace();
				  	  
		 }
		 return result;
		
		}

}
