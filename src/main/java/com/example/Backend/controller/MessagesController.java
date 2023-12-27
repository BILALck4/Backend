package com.example.Backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Arrays;


@RestController
public class MessagesController {

    @GetMapping("messages")
    public ResponseEntity<List<String>> messages(){
      return ResponseEntity.ok(Arrays.asList("first","second"));
    }

}
