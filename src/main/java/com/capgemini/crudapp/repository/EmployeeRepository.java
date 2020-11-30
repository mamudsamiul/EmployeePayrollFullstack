package com.capgemini.crudapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.capgemini.crudapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
