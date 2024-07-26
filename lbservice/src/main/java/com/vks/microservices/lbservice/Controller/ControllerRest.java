package com.vks.microservices.lbservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerRest {
    @Autowired
    Environment env;
    @GetMapping("/hello")
    public String hello(){
        return "Hello Vinay........!"+env.getProperty("local.server.port");
    }
}
