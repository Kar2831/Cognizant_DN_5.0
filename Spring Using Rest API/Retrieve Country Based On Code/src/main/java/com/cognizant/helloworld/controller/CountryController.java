package com.cognizant.helloworld.controller;

import com.cognizant.helloworld.model.Country;
import com.cognizant.helloworld.service.CountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController{

    private final CountryService countryService;
    public CountryController(CountryService countryService){
        this.countryService = countryService;
    }

    @GetMapping("/{code}")
    public Country displayCountry(@PathVariable String code){
        return countryService.getCountry(code);
    }
}