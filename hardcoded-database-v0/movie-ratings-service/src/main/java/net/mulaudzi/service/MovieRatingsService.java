package net.mulaudzi.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import net.mulaudzi.model.Movie;

/*
 * We model this service as keeping a library of movie ratings by the user
 * A user can rate a number of movies so we keep a Map of movie Lists
 * K-> UserId and V-> Movie
 */

@Service
public class MovieRatingsService {

	private HashMap<String, List<Movie>> library;

	public MovieRatingsService() {
		this.library = new HashMap<String, List<Movie>>();
		this.library.put("Phindulo", Arrays.asList(new Movie("Transformers", 3), new Movie("Titanic", 5)));
		this.library.put("Nathan", Arrays.asList(new Movie("Superman", 4), new Movie("Batman", 5)));
	}

	public Movie getMovieRating(String userId, String title) {
		List<Movie> movies = library.get(userId);
		for (Movie movie : movies) {
			if (movie.getTitle().equals(title)) {				
				return movie;
			}
		}
		// We return -1 if the movie rating is not found in the library for the specific
		// user
		return new Movie(title, -1);
	}

	public List<Movie> getRatedMovies(String userId) {
		if (library.containsKey(userId))
			return library.get(userId);
		else
			return null;
	}

}
