package com.example.springbootmanagementexample;
 
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class healthcheck.java {
    @GetMapping("/health")
    public String example() {
        return "Hello User !! " + new Date();
    }
}
