package org.intensiv.gatewayapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping(path = "/fallback/users")
    public ResponseEntity<String> usersFallback() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("User service временно недоступен");
    }

    @GetMapping(path = "/fallback/notification")
    public ResponseEntity<String> notificationsFallback() {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Notification service временно недоступен");
    }
}
