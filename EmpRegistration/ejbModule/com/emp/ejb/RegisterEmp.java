package com.emp.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.emp.entity.EmpDetailsBean;

/**
 * Session Bean implementation class RegisterEmp
 */
@Stateless
@LocalBean
public class RegisterEmp implements RegisterEmpLocal {
	
	
	@PersistenceContext(unitName="registration")
    EntityManager entityManager;

    
    public RegisterEmp() {
        
    }

    
	public void saveEmpDetails(EmpDetailsBean empDetBean) {
		
		
		entityManager.persist(empDetBean);
		
	}


	
	@SuppressWarnings("unchecked")
	@Override
	public List<EmpDetailsBean> getDetails(String username) {
		
		List<EmpDetailsBean>  getList = new ArrayList<EmpDetailsBean>();
		
		Query q = entityManager.createQuery("FROM EmpDetailsBean WHERE username='" + username + "'");
		
		getList = q.getResultList();
		
		return getList;
	}

}
