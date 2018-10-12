package com.example.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GoodbyeController {

    @RequestMapping("/bye")
    public String index() {
        return "Goodbye from Spring Boot!";
    }
}