package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/loan/{number}")
    public Map<String, Object> displayDetails(@PathVariable String number){
        HashMap<String, Object> map = new HashMap<>();
        map.put("number", number);
        map.put("type", "car");
        map.put("loan", 400000);
        map.put("emi", 3258);
        map.put("tenure", 18);
        return map;
    }

}
