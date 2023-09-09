package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }

}
