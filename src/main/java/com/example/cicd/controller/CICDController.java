package com.example.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/cicd")
public class CICDController {

    @GetMapping("/status")
    public ResponseEntity<String> getCICDStatus() {
        return ResponseEntity.ok("CICD is running successfully!");
    }
    @GetMapping("/app1")
    public ResponseEntity<String> getCICDapp1() {
        return ResponseEntity.ok("CICD app1 is running successfully!");
    }

    @GetMapping("/newstatus")
    public ResponseEntity<Map<String, String>> getCICDStatusWithDetails() {
        Map<String, String> statusDetails = Map.of(
                "status", "running",
                "version", "1.0.0",
                "lastBuild", "2024-06-01T12:00:00Z"
        );
        return ResponseEntity.ok(statusDetails);
    }

}
