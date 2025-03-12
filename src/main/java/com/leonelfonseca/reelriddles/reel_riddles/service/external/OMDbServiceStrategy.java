package com.leonelfonseca.reelriddles.reel_riddles.service.external;

import org.springframework.stereotype.Component;

@Component("OMDbService")
public class OMDbServiceStrategy implements ExternalServiceStrategy  {
    @Override
    public String fetchData() {
        return "OMDbServiceStrategy";
    }
}
