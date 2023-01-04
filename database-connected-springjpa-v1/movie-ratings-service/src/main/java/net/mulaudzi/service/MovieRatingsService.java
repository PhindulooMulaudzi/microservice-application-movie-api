package net.mulaudzi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.Tuple;
import net.mulaudzi.model.Movie;
import net.mulaudzi.model.MovieList;
import net.mulaudzi.model.MovieRatingId;
import net.mulaudzi.resource.MovieRatingsRepository;

/*
 * We model this service as keeping a library of movie ratings by the user
 * A user can rate a number of movies so we keep a Map of movie Lists
 * K-> UserId and V-> Movie
 */

@Service
public class MovieRatingsService {
	@Autowired
	private MovieRatingsRepository movieRatingsRepository;
	
	public MovieRatingsService() {

	}

	public Movie getMovieRating(String userId, String title) {
		var movieRatingsOptional = movieRatingsRepository.findById(new MovieRatingId(userId, title));

		if(movieRatingsOptional.isPresent()) {					
			return movieRatingsOptional.get();
		}else {
			return new Movie(userId,title, -1);
		}		
	}

	public MovieList getRatedMovies(String userId) {
		List<Movie> movies = new ArrayList<>();
		var movieRatingsIterable = movieRatingsRepository.findAll();
		for(var movie : movieRatingsIterable) {
			if(movie.getUserId().equals(userId)){
				movies.add(movie);
			}
		}		
		
		return new MovieList(movies);
	}
}
