package com.example.Ex4;

import com.example.Ex4.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ex4Application {

	private static final Logger LOGGER = LoggerFactory.getLogger(Ex4Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Ex4Application.class, args);
		LOGGER.info("Inside main");
		displayCountry();
	}
	public static void displayCountry(){
		LOGGER.info("Inside displayCountry");
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Note: No Downcasting required because the requiredType is provided
		Country country = context.getBean("country", Country.class);
		LOGGER.info("country: {}", country);
	}
}
