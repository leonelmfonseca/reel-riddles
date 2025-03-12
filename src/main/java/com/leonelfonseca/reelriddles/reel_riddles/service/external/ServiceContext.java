package com.leonelfonseca.reelriddles.reel_riddles.service.external;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceContext {
    private ExternalServiceStrategy strategy;
    
    @Autowired
    public ServiceContext(ExternalServiceStrategy strategy) {
        this.strategy = strategy;
    }

}
