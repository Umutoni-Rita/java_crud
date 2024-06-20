package rw.ac.app.employeeservice.service;

import java.util.List;

import rw.ac.app.employeeservice.model.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(Long id);
	
	Employee createEmployee(Employee employee);
	
	Employee updateEmployee(Long id, Employee employee);
	
	void deleteEmployee(Long id);
}
