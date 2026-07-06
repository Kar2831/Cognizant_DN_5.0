package com.example.Ex2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@RestController
public class DateController {
    SimpleDateFormat simpleDateFormat;
    public DateController(SimpleDateFormat simpleDateFormat){
        this.simpleDateFormat = simpleDateFormat;
    }

    @GetMapping("/")
    public String home(){
        return simpleDateFormat.format(new Date());
    }
}
