package com.example.FirstAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hi")
    public String HelloWorld(){
        return "Hello World";
//        http://localhost:8080/hi
    }

    @GetMapping("/yourName")
    public String PrintName(@RequestParam String name){
        return "Hello !! "+name;
//        http://localhost:8080/yourName?name=Prashant
    }

    @GetMapping("/rollNo")
    public String Name(@RequestParam int roll){
        DataStore store=new DataStore();
        return "Hello your name is: "+ store.getName(roll);
//        http://localhost:8080/rollNo?roll=62
    }
}
