package com.webapp.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.webapp.data.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@Slf4j
public class WebAppController {
@Autowired
    ObjectMapper objectMapper;
    @GetMapping(path = "/app")
    public ResponseEntity<?> app() throws IOException {
        Data data = Data.builder().name("Nitin").email("j9.nitin@gmail.com").build();
        return ResponseEntity.ok(data);
    }
    @GetMapping(path = "/app/{id}")
    public ResponseEntity<?> app(@PathVariable Integer id) throws IOException {
        Data data = Data.builder().name("Nitin").email("j9.nitin@gmail.com").build();
        log.info("Id is {}",id);
        return ResponseEntity.ok(data);
    }
}
