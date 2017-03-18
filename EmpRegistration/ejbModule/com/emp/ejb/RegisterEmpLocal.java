package com.emp.ejb;

import java.util.List;

import javax.ejb.Local;

import com.emp.entity.EmpDetailsBean;

@Local
public interface RegisterEmpLocal {
	
	public void saveEmpDetails(EmpDetailsBean empDetBean);
	public List<EmpDetailsBean> getDetails(String username);
}
