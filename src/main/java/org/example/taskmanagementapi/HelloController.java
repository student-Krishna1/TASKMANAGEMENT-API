package org.example.taskmanagementapi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/health")
    public String health() {

        return "Application is Running";
    }

    @GetMapping("/welcome")
    public String welcome() {

        return "Welcome to Spring Boot";
    }
}