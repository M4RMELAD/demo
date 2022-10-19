package com.example.demo.controller;


import com.example.demo.bean.CurrencyRequest;
import com.example.demo.bean.CurrencyResponse;
import com.example.demo.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SallaryController {

    @Autowired
    private SalaryService service;

    @GetMapping("/salary/eur/get/")
    public Double salaryToUER(@RequestParam(name="salary") Integer salary){
        if(salary == null){
            return 0.0;

        }


        return service.bynToEur(Double.valueOf(salary.toString()));
    }
    @GetMapping("/salary/usd/get/{salary}")
    public Double salaryToUSD(@PathVariable(name = "salary")Integer salary){
        if(salary == null){
            return 0.0;
        }
        return service.bynToUsd(Double.valueOf(salary.toString()));
    }
    @PostMapping("/salary/all/currency")
    public CurrencyResponse allSalary(@RequestBody CurrencyRequest request){

        return service.allCurrency(request);
    }

}
