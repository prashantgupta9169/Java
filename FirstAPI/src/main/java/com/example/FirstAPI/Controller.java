package com.example.FirstAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    DataStore store =new DataStore();

    @GetMapping("/hi")
    public String HelloWorld(){
        return "Hello World";
//        http://localhost:80 80/hi
    }

    @GetMapping("/yourName")
    public String PrintName(@RequestParam String name){
        return "Hello !! "+name;
//        http://localhost:8080/yourName?name=Prashant
    }

//    @GetMapping("/rollNo")
//    public String Name(@RequestParam int roll){
//        DataStore store=new DataStore();
//        return "Hello your name is: "+ store.getName(roll);
////        http://localhost:8080/rollNo?roll=62
//    }

    @GetMapping("/rollNum/{roll}")
    public User getUser(@PathVariable int roll){
        return store.getAUser(roll);
//        http://localhost:8080/rollNum/62
    }

    @GetMapping("/users")
    public List<User> getAllUser(){
        return store.getAll();
//        http://localhost:8080/users
    }
}
