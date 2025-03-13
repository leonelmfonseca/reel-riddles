package com.leonelfonseca.reelriddles.reel_riddles.controller;

import com.leonelfonseca.reelriddles.reel_riddles.service.ReelRiddleService;
import info.movito.themoviedbapi.TmdbApi;
import info.movito.themoviedbapi.TmdbMovies;
import info.movito.themoviedbapi.model.movies.MovieDb;
import info.movito.themoviedbapi.tools.TmdbException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/riddles")
public class ReelRiddlesController {
    
    private ReelRiddleService reelRiddleService;
  private final TmdbApi tmdbApi;

  @Autowired
  public ReelRiddlesController(ReelRiddleService reelRiddleService, TmdbApi tmdbApi) {
        this.reelRiddleService = reelRiddleService;
    this.tmdbApi = tmdbApi;
    }

  @GetMapping("/tmdb")
  public ResponseEntity<String> getTmdb() throws TmdbException {
    TmdbMovies tmdbMovies = tmdbApi.getMovies();
    MovieDb movie = tmdbMovies.getDetails(5353, "en-US");

    return ResponseEntity.ok(movie.getTitle());
    }
}
