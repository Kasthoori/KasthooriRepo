package com.emp.control;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.ejb.RegisterEmpLocal;
import com.emp.entity.EmpDetailsBean;

/**
 * Servlet implementation class EmpRegistrationServlet
 */
@WebServlet("/EmpRegistrationServlet")
public class EmpRegistrationServlet extends HttpServlet {
	
	@EJB
	RegisterEmpLocal  registerEmpLocal;
	
	private static final long serialVersionUID = 1L;
    
    public EmpRegistrationServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("username");
		String pword = request.getParameter("password");
		
		
		try {
			
			
			InitialContext  ic = new InitialContext();
			registerEmpLocal = (RegisterEmpLocal) ic.lookup("java:global/EmpRegistrationWeb/RegisterEmp!com.emp.ejb.RegisterEmpLocal");
			
			List<EmpDetailsBean> empDet = registerEmpLocal.getDetails(user);
			
			
			for(EmpDetailsBean  det : empDet){
				
				String dbuser = det.getUsername();
				String dbpasswd = det.getPassword();
				
				if(dbuser.matches(user) && dbpasswd.matches(pword)){
				
				
				        RequestDispatcher  rd = request.getRequestDispatcher("success.jsp");
				        rd.forward(request, response);
				        
				}else if(!dbuser.equals(user) || !dbpasswd.equals(pword)){
					
					   RequestDispatcher  rd1 = request.getRequestDispatcher("registration.jsp");
					   rd1.forward(request, response);
				}else{
					
					   RequestDispatcher  rd1 = request.getRequestDispatcher("registration.jsp");
					   rd1.forward(request, response);
					
				}
			}
			
			
		} catch (NamingException e) {
			

			e.printStackTrace();
		}
		
	}

}
