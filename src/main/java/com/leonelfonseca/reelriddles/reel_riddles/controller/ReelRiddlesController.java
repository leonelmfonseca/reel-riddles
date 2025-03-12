package com.leonelfonseca.reelriddles.reel_riddles.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/riddle")
public class ReelRiddlesController {
    
    @GetMapping
    public ResponseEntity<String> getRiddles() {
        return ResponseEntity.ok("Riddles");
    }
    
}
