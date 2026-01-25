package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    private final MathService mathService ;

    public MathController(MathService mathService){
        this.mathService = mathService;
    }

    @GetMapping("/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b){
        return mathService.add(a,b);
    }
}
