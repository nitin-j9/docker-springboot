package com.webapp.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.webapp.data.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
public class WebAppController {
@Autowired
    ObjectMapper objectMapper;
    @GetMapping(path = "/app")
    public ResponseEntity<?> app() throws IOException {
        Data data = Data.builder().name("Nitin").email("j9.nitin@gmail.com").build();
        return ResponseEntity.ok(data);
    }
}
