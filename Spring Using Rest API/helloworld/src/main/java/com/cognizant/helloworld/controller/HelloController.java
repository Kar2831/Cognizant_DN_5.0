package com.cognizant.helloworld.controller;

import com.cognizant.helloworld.HelloworldApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
    @GetMapping("/home")
    public String hello(){
        LOGGER.info("Hello Controller Start");
        LOGGER.info("Hello Controller End");
        return "Hello, World!";
    }

}
