package com.timiProject.practiceJava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String Home() {
        return "HOME";
    }
    
    @RequestMapping("/hello")
    public String Hello() {
        return "Finally you are working!!!!, Sooooo much stress";
    }
}
