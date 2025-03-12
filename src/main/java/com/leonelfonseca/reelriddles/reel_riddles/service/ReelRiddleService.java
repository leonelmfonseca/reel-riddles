package com.leonelfonseca.reelriddles.reel_riddles.service;

import com.leonelfonseca.reelriddles.reel_riddles.service.external.ExternalServiceStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReelRiddleService {

  private ExternalServiceStrategy strategy;
    
    @Autowired
  public ReelRiddleService(ExternalServiceStrategy strategy) {
      this.strategy = strategy;
  }
  
  public String executeFetch() {
    return strategy.fetchData();
  }
}
