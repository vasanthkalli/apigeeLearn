package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/v1/api")
    public ResponseEntity<String> getResponse(){

        return new ResponseEntity<>("Response from server", HttpStatusCode.valueOf(200));
    }
}
