package com.infinity.first_spring_app.controller;

import com.infinity.first_spring_app.domain.User;
import com.infinity.first_spring_app.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService) {

        this.helloWorldService =   helloWorldService;
    }

    @GetMapping
    public String helloWorld() {
        return helloWorldService.helloWorld("Lucas");
    }

    @PostMapping
    public String helloWorldPost(@RequestBody User body) {
        return "Hello World + " + body.getName();
    }
}
