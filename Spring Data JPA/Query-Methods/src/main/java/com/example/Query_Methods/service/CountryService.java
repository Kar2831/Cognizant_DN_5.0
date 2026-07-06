package com.example.Query_Methods.service;

import com.example.Query_Methods.model.Country;
import com.example.Query_Methods.repository.CountryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    public List<Country> fetchCountryByPartialText(String name){
        return countryRepository.findByNameContaining(name);
    }

    public List<Country> fetchCountryByPartialTextAscending(String name){
        return countryRepository.findByNameContainingOrderByNameAsc(name);
    }

}
