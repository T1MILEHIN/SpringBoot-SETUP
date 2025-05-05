package com.timiProject.practiceJava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public String Hello(){
        return "Finally you are working!!!!";
    }
}
