package com.example.discoveryservice;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test", produces = MediaType.APPLICATION_JSON_VALUE)
public class TestController {
    @GetMapping(path = "/")
    public String deploymentWorks() { return "Hello from aws!"; }
}
