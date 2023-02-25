package com.tosan.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("author")
public class AuthController {
    @GetMapping("")
    public String hello() {
        return "Ali Ahmadi";
    }
}
