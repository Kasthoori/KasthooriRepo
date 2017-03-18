package com.emp.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class HelloEjb
 */
@Stateless
@LocalBean
public class HelloEjb implements HelloEjbLocal {

    /**
     * Default constructor. 
     */
    public HelloEjb() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		
		String message = "Hello!, I'm from Session Bean";
		
		return message;
	}

}
