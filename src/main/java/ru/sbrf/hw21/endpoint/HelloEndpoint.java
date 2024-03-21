package ru.sbrf.hw21.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloEndpoint {

    @GetMapping("/hello")
    public String getDate() {
        return LocalDate.now().toString();
    }
}
