package com.leonelfonseca.reelriddles.reel_riddles.service.external;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class StrategyContext {
    
    private final Map<String, ExternalServiceStrategy> strategies;
    
    @Autowired
    public StrategyContext(Map<String, ExternalServiceStrategy> strategies) {
        this.strategies = strategies;
    }
    
    public String executeStrategy(String serviceName) {
        ExternalServiceStrategy strategy = strategies.get(serviceName);
        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for service: " + serviceName);
        }
        return strategy.fetchData();
    }
}
