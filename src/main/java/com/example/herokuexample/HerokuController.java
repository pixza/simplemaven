package com.example.herokuexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HerokuController {

    @GetMapping("/api")
    public String index(){
        return "Hello there! I'm running.";
    }
}
