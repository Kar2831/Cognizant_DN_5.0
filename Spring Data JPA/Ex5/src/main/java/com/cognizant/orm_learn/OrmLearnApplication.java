package com.cognizant.orm_learn;

import com.cognizant.orm_learn.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = (CountryService)context.getBean(CountryService.class);
		LOGGER.info("Inside main");
		getAllCountries();
	}
	public static void getAllCountries(){
		LOGGER.info("START");
		Country country = null;
		try{
			country = countryService.findCountryByCode("IN");
		}catch (CountryNotFoundException e){
			e.printStackTrace();
		}
		LOGGER.debug("Country: {}", country);
		LOGGER.info("END");
	}

}
