package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @PostMapping("/person")
    public String createPerson(@RequestBody Person person){
        return "Name:" + person.getName() + "Age : " + person.getAge() ;
    }
}
