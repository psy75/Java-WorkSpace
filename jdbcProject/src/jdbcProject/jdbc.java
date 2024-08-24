package jdbcProject;

import java.sql.*;
public class jdbc {

	public static void main(String[] args)throws Exception{
		String url="jdbc:mysql://localhost:3306/jp";
        String userName="root";
        String password="9346";
		
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection con=DriverManager.getConnection(url,userName,password);
        
        Statement st=con.createStatement();
        
        ResultSet rs=st.executeQuery("select* from students ");
        while(rs.next()) {
        int id=rs.getInt("Id");
        String name=rs.getString("Name");
        String city=rs.getString("City");
        System.out.println(id+" "+name+" "+city); }
        st.close();
        con.close();
	}

  }

