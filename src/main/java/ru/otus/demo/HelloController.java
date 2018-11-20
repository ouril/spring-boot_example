package ru.otus.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public List<String> sayHello() {
        return Arrays.asList("Hello", "World");
    }
}
