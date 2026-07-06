package com.cognizant.helloworld.controller;

import com.cognizant.helloworld.model.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryController{

    private Country country;
    public CountryController(Country country){
        this.country = country;
    }

    @GetMapping("/")
    public Country displayCountry(){
        return country;
    }
}