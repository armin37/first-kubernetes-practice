package com.tosan.docker.controllers;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("")
    public String hello(@RequestParam(required = false) String name) {
        String s = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(name), StringUtils.SPACE);
        return name != null ? "Hello " + s : "Hello Stranger";
    }
}
