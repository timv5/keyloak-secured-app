package com.keycloak.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/user")
@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/info")
    public ResponseEntity<String> info() {
        LOGGER.info("::: UserController.info :::");
        return ResponseEntity.ok("info");
    }

    @GetMapping("/all")
    public ResponseEntity<String> all() {
        LOGGER.info("::: UserController.all :::");
        return ResponseEntity.ok("all");
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        LOGGER.info("::: UserController.test :::");
        return ResponseEntity.ok("test");
    }

}
