package com.cognizant.orm_learn;

import com.cognizant.orm_learn.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    private final CountryRepository countryRepository;
    CountryService(CountryRepository countryRepository){
        this.countryRepository = countryRepository;
    }

    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if(!result.isPresent()){
            throw new CountryNotFoundException("Country with provided code is not present");
        }
        Country country = result.get();
        return country;
    }



}
