package com.greatlearning.admin.service;

import com.greatlearning.admin.model.Employee;

public interface ServiceInterface {
	
	public void generatePassword(Employee employee);
	
	public void generateEmail(Employee employee);
	
	public void showCredentials(Employee employee);

}
