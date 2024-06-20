package rw.ac.app.employeeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rw.ac.app.employeeservice.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
