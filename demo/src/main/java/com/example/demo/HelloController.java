package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    private final HelloService helloService;

    public HelloController (HelloService helloService){
        this.helloService = helloService ;
    }

    @GetMapping("/hello")
        public String hello(){
        return helloService.getMessage();
    }




    // -->Why Controller calls Service ?
    //Tomorrow you might need the same logic somewhere else
    //Service keeps logic reusable
    //Controller stays clean

    //Rule to remember:
    //Controller asks
    //Service works
    //Controller replies

}