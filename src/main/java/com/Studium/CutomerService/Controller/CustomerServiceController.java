package com.Studium.CutomerService.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerServiceController {

    @RequestMapping("/sayTest")
    public String sayTest()
    {
        return "<h1> Test </h1>";
    }

    @RequestMapping("/")
    public String localhost()
    {
        return "<h1> CustomerService </h1>";
    }

}
