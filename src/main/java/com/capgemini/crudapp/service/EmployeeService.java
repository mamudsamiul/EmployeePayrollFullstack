package com.capgemini.crudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.crudapp.entity.Employee;
import com.capgemini.crudapp.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}
	public List<Employee> saveEmployees(List<Employee> employees) {
		return repository.saveAll(employees);
	}
	public List<Employee> getEmployees(){
		return repository.findAll();
	}
	public Employee getEmployeeById(int id){
		return repository.findById(id).orElse(null);
	}
	public String deleteEmployee(int id) {
		repository.deleteById(id);
		return "product removed";
	}
	
	public Employee updateEmployee(Employee employee) {
		Employee existingEmployee=repository.findById(employee.getId()).orElse(null);
		existingEmployee.setName(employee.getName());
		return repository.save(existingEmployee);
		
	}
}
