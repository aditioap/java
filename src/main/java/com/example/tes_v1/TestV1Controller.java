package com.example.tes_v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestV1Controller {

    @GetMapping("/")
    public String hello() {
        return "Hello Test-V1";
    }

}
