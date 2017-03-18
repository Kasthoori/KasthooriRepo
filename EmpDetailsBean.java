package com.emp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="emp_details")
public class EmpDetailsBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String sex;
	private String department;
	private String occupation;
	private String email;
	
	
	@Id
	@Column(name="username")
	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="first_name")
	public String getFirstname() {
		return firstname;
	}
	
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	@Column(name="last_name")
	public String getLastname() {
		return lastname;
	}
	
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@Column(name="sex")
	public String getSex() {
		return sex;
	}
	
	
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Column(name="department")
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Column(name="occupation")
	public String getOccupation() {
		return occupation;
	}
	
	
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}


	@Column(name="email")
	@Pattern(regexp = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
            + "[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9]"
     + "(?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9]"
     + "(?:[a-z0-9-]*[a-z0-9])?", 
     message = "{invalid.email}")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	

}
