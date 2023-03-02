package com.example.springapp.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController{
    @Value("HI")
    private String message;

    @GetMapping("/")
    public String getMessage(){
        return message;
    }
}
