package net.mulaudzi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import net.mulaudzi.MovieCatalogServiceApplication;
import net.mulaudzi.model.Movie;
import net.mulaudzi.model.MovieList;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	/*
	 * Connect to our restTemplate Bean so that we can make Rest calls
	 */
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("{userId}")
	public List<Movie> getCatalog(@PathVariable String userId) {
		/*
		 * We fetch the null catalog for the user
		 */
		List<Movie> movies = restTemplate.getForObject("http://movie-ratings-service/"+"ratings/"+userId, MovieList.class).getMovieList();
		/*
		 * Now we need to access a Microservice that can give us the description of 
		 * the movies that are on the users catalog
		 */

		for(int idx = 0; idx < movies.size(); idx++) {
			/*
			 * We use our RestTemplate to make a call to the info Microservice for each movie title and get the info
			 * We then update the movie description on our catalog from this information
			 * 
			 * From trial and error we have also noticed that the restTemplate needs to be returning a similar type
			 * Which makes sense because it has to be parsable to ClassName.class in that instance i was trying to parse
			 * a String to ClassName.class
			 * 
			 */
			Movie movieInfo = restTemplate.getForObject("http://movie-info-service/"+"movies/"+movies.get(idx).getTitle(), Movie.class);
			movies.set(idx, new Movie(movies.get(idx).getTitle(),movieInfo.getDescirption(), movies.get(idx).getRating()));
		}		
		
		return movies;
	}
}
