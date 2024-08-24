package net.javaguides.registration.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import net.javaguides.registration.dao.EmployeeDao;
import net.javaguides.registration.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private EmployeeDao employeeDao= new EmployeeDao();

	public boolean context;

    /**
     * Default constructor. 
     */
    public EmployeeServlet() {
    	super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		jakarta.servlet.RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/employeeregister.jsp");
		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstName =request.getParameter("firstName");
		String lastName  =request.getParameter("lastName");
		String userName  =request.getParameter("username");
		String password  =request.getParameter("password");
		String address   =request.getParameter("address");
		String contact   =request.getParameter("contact");
		
		Employee employee = new Employee();
		employee.setFirstname(firstName);
		employee.setLastname(lastName);
		employee.setUsername(userName);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContact(contact);
		
		try {
			employeeDao.registerEmployee(employee);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();	
		}
		jakarta.servlet.RequestDispatcher dispatcher = (jakarta.servlet.RequestDispatcher) 
		request.getRequestDispatcher("/WEB-INF/views/employeedetails.jsp");
		dispatcher.forward(request,response);
	}

}
