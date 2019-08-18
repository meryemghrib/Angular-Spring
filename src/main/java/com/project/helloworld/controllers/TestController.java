package com.project.helloworld.controllers;

import java.util.ArrayList;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.helloworld.model.Employee;
@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class TestController {
	private List<Employee> employees = createList();


@RequestMapping(value = "/employees", method = RequestMethod.GET, produces = "application/json")
public List<Employee> firstPage() {
	return employees;

}
@SuppressWarnings("unlikely-arg-type")
@DeleteMapping(path = { "/LastName}" })
public Employee delete(@PathVariable("LastName") int id) {
	Employee deletedEmp = null;
	for (Employee emp : employees) {
		if (emp.getID().equals(id)) {
			employees.remove(emp);
			deletedEmp = emp;
			break;
			
		}
	}
	return deletedEmp;
}

@PostMapping
public Employee create(@RequestBody Employee user) {
	employees.add(user);
	System.out.println(employees);
	return user;
}
private static List<Employee> createList() {
	List<Employee> tempEmployees = new ArrayList<>();
	Employee p1 = new Employee();
	p1.setID("01");
	p1.setLoginID("loginID");
	p1.setFirstName("firstName");
	p1.setLastName("lastName");
	p1.setFunction("aaa");
	p1.setEmail("emai");
	p1.setOrganization_Unit("ooo");
	p1.setDisplayname("aaaa");
	
	Employee p2 = new Employee();
	p2.setID("02");
	p2.setLoginID("login");
	p2.setFirstName("firstName1");
	p2.setLastName("lastName1");
	p2.setFunction("aa1");
	p2.setEmail("emai1");
	p2.setOrganization_Unit("ooo1");
	p2.setDisplayname("aa1");
	tempEmployees.add(p1);
	tempEmployees.add(p2);
	return tempEmployees;


}}