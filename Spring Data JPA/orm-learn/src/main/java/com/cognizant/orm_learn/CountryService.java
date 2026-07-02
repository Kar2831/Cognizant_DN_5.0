package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Country;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {

    private final CountryRepository countryRepository;
    CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries(){
        return countryRepository.findAll();
    }


    @Transactional
    public void testGetAllCountries(){
//        LOGGER.info("Start");
        List<Country> countries = getAllCountries();
//        LOGGER.debug("countries={}", countries);
//        LOGGER.info("End");
        System.out.println(countries);
    }

}
