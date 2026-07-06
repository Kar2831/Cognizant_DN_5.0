package com.example.Ex2;

import com.example.Ex2.model.Employee;
import com.example.Ex2.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		EmployeeService employeeService = (EmployeeService)context.getBean(EmployeeService.class);
//		Employee employee = new Employee("ABC", 50000.0);
		Employee employee = new Employee("BCD", 40000.0);
		employeeService.addEmployeeHibernate(employee);
	}

}
