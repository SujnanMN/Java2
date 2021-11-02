package com.javatpoint.services;

import java.util.List;
import com.javatpoint.model.Employee;

public interface EmployeeService {
	
	List < Employee > getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
}