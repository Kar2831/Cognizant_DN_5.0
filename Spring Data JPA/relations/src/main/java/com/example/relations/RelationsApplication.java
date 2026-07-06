package com.example.relations;

import com.example.relations.model.Department;
import com.example.relations.model.Employee;
import com.example.relations.service.DepartmentService;
import com.example.relations.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@SpringBootApplication
public class RelationsApplication {
	private static EmployeeService employeeService;
	private static DepartmentService departmentService;
	private static final Logger LOGGER = LoggerFactory.getLogger(RelationsApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(RelationsApplication.class, args);
		employeeService = (EmployeeService) context.getBean(EmployeeService.class);
		departmentService = (DepartmentService) context.getBean(DepartmentService.class);
		LOGGER.info("Inside main");
		testAddDepartment();
		try{
			testGetEmployee();
		}catch (ParseException e){
			e.printStackTrace();
		}
	}
	public static void testAddDepartment() {
		LOGGER.info("Department Test START");
		Department department1 = new Department("CSE");
		Department department2 = new Department("IT");
		Department department3 = new Department("ECE");
		departmentService.save(department1);
		departmentService.save(department2);
		departmentService.save(department3);
		LOGGER.info("Department Test END");
	}
	public static void testGetEmployee()throws ParseException {
		LOGGER.info("START");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employee employee = new Employee("ABC", 50000.0, true, sdf.parse("2005-04-26"));
		int id = 1;
		Department department = departmentService.get(id);
		employee.setDepartment(department);
		employeeService.save(employee);
		Employee employee1 = employeeService.get(1);
		LOGGER.info("END");
	}
}
