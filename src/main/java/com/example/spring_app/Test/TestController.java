package com.example.spring_app.Test;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//initialize a class, call the class as a list and return that list, it automatically sends a json output (crazy, ik)
public class TestController {
    @GetMapping("/test")
    public List<Test> sayHello(){
        return Arrays.asList(
            new Test("spring","spring framework","description"),
            new Test("wassup","gang","wassup description"),
            new Test("hello","world","hello description")
        );
    }
}
