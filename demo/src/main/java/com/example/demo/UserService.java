package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getUser(){
        List<User> users = new ArrayList<>();

               users.add(new User("Yug",11010,21));
               users.add(new User("abd",1350,22));

               return users ;
    }

}
