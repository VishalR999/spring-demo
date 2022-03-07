package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public ResponseEntity<String> getUser() {
        return new ResponseEntity<>("This response is from User API", HttpStatus.OK);
    }

    @GetMapping("/user/{name}")
    public ResponseEntity<String> getUserName(@PathVariable(value = "name") String name) {
        return new ResponseEntity<>("This response is from User : " + name, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<String> emptyAPI() {
        return new ResponseEntity<>("New API with empty url", HttpStatus.OK);
    }
}
