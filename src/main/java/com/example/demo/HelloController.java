package com.example.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@EnableAutoConfiguration
public class HelloController {
    static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/")
    String home() {
        logger.debug("home");
        return "Hello World Spring Boot!";
    }
}
