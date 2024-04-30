package com.security.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class TestAuthController {
    @GetMapping("/hello")
    public  String hellow(){
        return "Hellow";
    }
    @GetMapping("/hello-secured")
    public  String hellowSecured(){
        return "Hellow Secured";
    }
}
