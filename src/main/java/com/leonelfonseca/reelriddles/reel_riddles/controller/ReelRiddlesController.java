package com.leonelfonseca.reelriddles.reel_riddles.controller;

import com.leonelfonseca.reelriddles.reel_riddles.service.ReelRiddleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/riddles")
public class ReelRiddlesController {
    
    private ReelRiddleService reelRiddleService;
    
    @Autowired
    public ReelRiddlesController(ReelRiddleService reelRiddleService) {
        this.reelRiddleService = reelRiddleService;
    }
    
    @GetMapping
    public ResponseEntity<String> getRiddles() {
        String riddle = reelRiddleService.executeFetch();
        return ResponseEntity.ok(riddle);
    }
    
}
