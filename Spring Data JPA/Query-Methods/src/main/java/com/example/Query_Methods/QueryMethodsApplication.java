package com.example.Query_Methods;

import com.example.Query_Methods.model.Country;
import com.example.Query_Methods.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class QueryMethodsApplication {

	private static CountryService countryService;
	private static final Logger LOGGER = LoggerFactory.getLogger(QueryMethodsApplication.class);
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(QueryMethodsApplication.class, args);
		countryService = (CountryService) context.getBean(CountryService.class);
		List<Country> countries = countryService.fetchCountryByPartialText("INDI");
		System.out.println(countries);
		countries = countryService.fetchCountryByPartialTextAscending("Ar");
		System.out.println(countries);
	}
}
