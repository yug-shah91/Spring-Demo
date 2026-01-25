package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet")
        public String greet(@RequestParam(required = false) String name){
                if (name == null ){
                    return "hello guest";
                }
            return "Hello "+name ;
    }
}
