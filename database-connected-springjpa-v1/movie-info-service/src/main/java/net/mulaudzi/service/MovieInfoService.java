package net.mulaudzi.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import net.mulaudzi.model.Movie;
import net.mulaudzi.resource.MovieInfoRepository;

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
	@Autowired
	private MovieInfoRepository movieInfoRepository;
	
	/*
	 * The CRUD repository find methods return Optional so we need to see if null or not
	 * if not null the value exist and we can simply get and return the existing instance.
	 */
	public Movie getMovieInfo(String title) {
		Optional<Movie> movieOptional = movieInfoRepository.findById(title);
		if(movieOptional.isPresent()) {
			return movieOptional.get();
		}else {
			return new Movie(title, null);
		}
	}
	
}
