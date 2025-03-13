package com.leonelfonseca.reelriddles.reel_riddles.configuration;


import info.movito.themoviedbapi.TmdbApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TMDbConfiguration {
    
    @Bean
    public TmdbApi tmdbApi() {
        return new TmdbApi("<api-key>");
    }
}
