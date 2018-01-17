package dk.moerks.springbootexamples.helloworld.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
}
