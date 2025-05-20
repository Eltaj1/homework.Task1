package com.latesthomework.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
    @GetMapping(value = "/")
    public String hi() {
        return "Hi, go to /mercedes and you will see the best car!";
    }
}

// Eltaj Sarizada 70453