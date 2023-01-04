package net.mulaudzi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.mulaudzi.model.Movie;
import net.mulaudzi.model.MovieList;
import net.mulaudzi.service.MovieRatingsService;

@RestController
@RequestMapping("ratings")
public class MovieRatingsController {
	@Autowired
	private MovieRatingsService movieRatingsService;
		
	@RequestMapping("/{userId}")
	public MovieList getRatedMovies(@PathVariable String userId){
		return movieRatingsService.getRatedMovies(userId);
	}
	
	@RequestMapping("/{userId}/{title}")
	public Movie getMovieRating(@PathVariable String userId, @PathVariable String title){		
		return movieRatingsService.getMovieRating(userId, title);
	}
}
