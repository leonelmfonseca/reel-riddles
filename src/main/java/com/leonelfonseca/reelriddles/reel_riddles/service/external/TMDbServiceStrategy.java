package com.leonelfonseca.reelriddles.reel_riddles.service.external;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("TMDbService")
public class TMDbServiceStrategy implements ExternalServiceStrategy  {
    @Override
    public String fetchData() {
        return "TMDbServiceStrategy";
    }
}
