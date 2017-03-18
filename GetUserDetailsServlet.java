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
import javax.servlet.http.HttpSession;

import com.emp.ejb.RegisterEmpLocal;
import com.emp.entity.EmpDetailsBean;


@WebServlet("/GetUserDetailsServlet")
public class GetUserDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	
	
	
	@EJB
	RegisterEmpLocal  registerEmpLocal;
    
    public GetUserDetailsServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	 request.getSession();
	 
	 
	 String user = request.getParameter("item");
		
     InitialContext ic;
		
		try {
			
			
			
			ic = new InitialContext();
			registerEmpLocal = (RegisterEmpLocal) ic.lookup("java:global/EmpRegistrationWeb/RegisterEmp!com.emp.ejb.RegisterEmpLocal");
			
			List<EmpDetailsBean> empDet = registerEmpLocal.getEmpDet(user);
			
			RequestDispatcher  rd = request.getRequestDispatcher("empdetails.jsp");
			request.setAttribute("empDet", empDet);
			rd.forward(request, response);
			
			
			
		} catch (NamingException e) {
			
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
