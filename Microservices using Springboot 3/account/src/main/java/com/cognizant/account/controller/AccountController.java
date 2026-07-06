package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Map<String, Object> displayAccount(@PathVariable String number){
        HashMap<String, Object> map = new HashMap<>();
        map.put("number", number);
        map.put("type", "savings");
        map.put("balance", "322344");
        return map;
    }

}
