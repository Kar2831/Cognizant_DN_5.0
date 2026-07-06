package com.cognizant.helloworld.service;

import com.cognizant.helloworld.model.Country;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private List<Country> countryList;

    public CountryService(List<Country> countryList){
        this.countryList = countryList;
    }

    public Country getCountry(String code){
        Country country = countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
        return country;
    }
}
