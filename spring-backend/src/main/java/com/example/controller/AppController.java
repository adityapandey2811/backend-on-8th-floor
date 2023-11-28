package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/app")
public class AppController {
    @GetMapping("/get/{id}")
    public ResponseEntity<String> testApp(@PathVariable("id") int id) {
        RestTemplate rt = new RestTemplate();
        ResponseEntity<String> result = rt.getForEntity("https://jsonplaceholder.typicode.com/todos/" + id, String.class);
        return result;
    }
}
