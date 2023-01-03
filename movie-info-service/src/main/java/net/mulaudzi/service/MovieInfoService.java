package net.mulaudzi.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import net.mulaudzi.model.Movie;

/*
 * This service will be responsible for service information for all movies in our library
 * 
 * We keep a local copy of our library as a Map<k,v> where k is a movie title and v is the movie object
 */
@Service
public class MovieInfoService {
	/*
	 * probably a better way to do this but we keep our library as  a map 
	 */
	HashMap<String, Movie> library;
	    
	public MovieInfoService() {
		this.library = new HashMap<String, Movie>();
		this.library.put("Transformers", new Movie("Transformers", "Transformers is a series of science fiction action films based on the Transformers franchise of the 1980s."));
		this.library.put("Batman", new Movie("Batman", "Batman is a superhero appearing in American comic books published by DC Comics."));
		this.library.put("Titanic", new Movie("Titanic", "A love story doomed by the depths of the Atlantic Ocean."));
		this.library.put("Superman", new Movie("Superman","An alien named Kal-El from the destroyed planet Krypton."));
	}
	
	public Movie getMovieInfo(String title) {
		return library.get(title);
	}
	
}
